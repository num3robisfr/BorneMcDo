package sousControllers;

import ejb.GestionCatalogueLocal;
import entites.Article;
import entites.Categorie;
import entites.Choix;
import entites.Menu;
import entites.SousCategorie;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ScCatalogue implements SousController {
    GestionCatalogueLocal gestionCatalogue = lookupGestionCatalogueLocal();

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String url = "/WEB-INF/Catalogue.jsp";
        String cat = request.getParameter("cat");
        String ssCat = request.getParameter("souscat");
        String idMenu = request.getParameter("menu");
        String leBurger = request.getParameter("burger");
        String boisson = request.getParameter("boisson");
        String accompagnement = request.getParameter("accompagnement");
        String etape = request.getParameter("etape");
        String dessert = request.getParameter("dessert");
        String cadeau = request.getParameter("cadeau");
        Menu m = new Menu();
        Choix choixMenu = new Choix();
        
        
        GestionCatalogueLocal gestionCatalogue = lookupGestionCatalogueLocal();
        List<Categorie> lc = gestionCatalogue.SelectAllCategorie();
        request.setAttribute("categorie", lc);
        
        if(idMenu != null){
             m = gestionCatalogue.getMenuById(idMenu);
        }
        
        if (cat == null) {
            request.setAttribute("central", lc);
        }
        
        if (cat != null) {
            if (cat.equalsIgnoreCase("nos burgers") || cat.equalsIgnoreCase("nos desserts") || cat.equalsIgnoreCase("nos salades")) {
                request.setAttribute("article", gestionCatalogue.afficheArticleByCategorie(cat));
            }

            if (cat.equalsIgnoreCase("nos frites et sauces")) {
                List<String> ls = new ArrayList<>();
                ls.add("accompagnements");
                ls.add("sauce");

                request.setAttribute("article", gestionCatalogue.afficherArticleBySousCategorie(ls)); 
            }
            
            if (cat.equalsIgnoreCase("petite faim")) {
                request.setAttribute("article", gestionCatalogue.afficherArticleBySousCategorie(ssCat));
            }
            
            if(cat.equalsIgnoreCase("nos boissons") && (ssCat == null)){
                url = "/WEB-INF/choixBoisson.jsp";     
            }
            if(cat.equalsIgnoreCase("nos boissons") && (ssCat != null)){
                url = "/WEB-INF/Catalogue.jsp";
               request.setAttribute("article", gestionCatalogue.afficherArticleBySousCategorie(ssCat)); 
            }
            
            if(cat.equalsIgnoreCase("nos menus") && etape == null){
                url = "/WEB-INF/choixMenu.jsp";
                request.setAttribute("burger", gestionCatalogue.SelectAllMenu());
            }
            
            if(cat.equalsIgnoreCase("happy meal") && etape == null){
                    url = "/WEB-INF/choixBurger.jsp";
                    List<String> ls = new ArrayList<>();
                    ls.add("petit burger");
                    ls.add("autre petit plat");

                    Long id = gestionCatalogue.getIdMenu("MENU HAPPY MEAL™");

                    request.setAttribute("liste", gestionCatalogue.afficherArticleBySousCategorie(ls));
                    request.setAttribute("chemin", "cat=" + cat + "&menu=" + id);
            }
            if((cat.equalsIgnoreCase("nos menus")) && etape != null){
                if (etape.equalsIgnoreCase("1")) {
                    url = "/WEB-INF/choixBurger.jsp";
                    List<Article> laListe = new ArrayList<Article>();
                    List<SousCategorie> lm = gestionCatalogue.getSousCategorieByMenu(idMenu);
                    for (SousCategorie lm1 : lm) {
                        if (lm1.getNom().equalsIgnoreCase("burger") || lm1.getNom().equalsIgnoreCase("salade")) {
                            List<Article> la = gestionCatalogue.SelectArticleBySousCategorie(lm1);
                            for (Article la1 : la) {
                                laListe.add(la1);
                            }
                        }
                    }
                    List<String> ls = new ArrayList<>();
                    ls.add("burger");
                    ls.add("salade");
                    

                    choixMenu.setUnMenu(gestionCatalogue.getMenuById(idMenu));
                    
                    request.setAttribute("liste", laListe);
                    request.setAttribute("chemin", "cat=" + cat + "&menu=" + idMenu);
                }
                if(etape.equalsIgnoreCase("2")){
                    url = "/WEB-INF/choixBoissonMenu.jsp";
                    List<Article> laListe = new ArrayList<Article>();
                    List<SousCategorie> lm = gestionCatalogue.getSousCategorieByMenu(idMenu);
                    for (SousCategorie lm1 : lm) {
                        if (lm1.getNom().equalsIgnoreCase("moyenne boisson") || lm1.getNom().equalsIgnoreCase("jus de fruit") || lm1.getNom().equalsIgnoreCase("grande boisson")) {
                            List<Article> la = gestionCatalogue.SelectArticleBySousCategorie(lm1);
                            for (Article la1 : la) {
                                laListe.add(la1);
                            }
                        }
                    }
                    request.setAttribute("liste", laListe);
                    request.setAttribute("chemin", "cat=" + cat + "&menu=" + idMenu + "&burger=" + leBurger);
                }
                if(etape.equalsIgnoreCase("3")){
                    url = "/WEB-INF/choixAccompagnement.jsp";
                    List<Article> laListe = new ArrayList<Article>();
                    List<SousCategorie> lm = gestionCatalogue.getSousCategorieByMenu(idMenu);
                    for (SousCategorie lm1 : lm) {
                        if (lm1.getNom().equalsIgnoreCase("moyen accompagnement") || lm1.getNom().equalsIgnoreCase("grand accompagnement") || lm1.getNom().equalsIgnoreCase("petit accompagnement")) {
                            List<Article> la = gestionCatalogue.SelectArticleBySousCategorie(lm1);
                            for (Article la1 : la) {
                                laListe.add(la1);
                            }
                        }
                    }
                    request.setAttribute("liste", laListe);
                    request.setAttribute("chemin", "Controller?section=ScCatalogue&" + "cat=" + cat + "&menu=" + idMenu + "&burger=" + leBurger + "&boisson=" + boisson);
                }
                if(etape.equalsIgnoreCase("4")){

                    if (m.getNom().equalsIgnoreCase("MENU HAPPY MEAL™")) {
                        url = "/WEB-INF/choixDessert.jsp";
                        List<Article> laListe = new ArrayList<Article>();
                        List<SousCategorie> lm = gestionCatalogue.getSousCategorieByMenu(idMenu);
                        for (SousCategorie lm1 : lm) {
                            if (lm1.getNom().equalsIgnoreCase("p'tit Dessert")) {
                                List<Article> la = gestionCatalogue.SelectArticleBySousCategorie(lm1);
                                for (Article la1 : la) {
                                    laListe.add(la1);
                                }
                            }
                        }
                        request.setAttribute("liste", laListe);
                        request.setAttribute("chemin", "Controller?section=ScCatalogue&" + "cat=" + cat + "&menu=" + idMenu + "&burger=" + leBurger + "&boisson=" + boisson + "&accompagnement=" + accompagnement);
                    }
                }
                
                if (etape.equalsIgnoreCase("5")) {
                    if (m.getNom().equalsIgnoreCase("MENU HAPPY MEAL™")) {
                        url = "/WEB-INF/choixCadeau.jsp";
                        List<Article> laListe = new ArrayList<Article>();
                        List<SousCategorie> lm = gestionCatalogue.getSousCategorieByMenu(idMenu);
                        for (SousCategorie lm1 : lm) {
                            if (lm1.getNom().equalsIgnoreCase("cadeau")) {
                                List<Article> la = gestionCatalogue.SelectArticleBySousCategorie(lm1);
                                for (Article la1 : la) {
                                    laListe.add(la1);
                                }
                            }
                        }
                        request.setAttribute("liste", laListe);
                        request.setAttribute("chemin", "Controller?section=ScCatalogue&" + "cat=" + cat + "&menu=" + idMenu + "&burger=" + leBurger + "&boisson=" + boisson + "&accompagnement=" + accompagnement + "&dessert=" + dessert);
                    }
                }
                
            }
            
        }
        return url;
    }

    private GestionCatalogueLocal lookupGestionCatalogueLocal() {
        try {
            Context c = new InitialContext();
            return (GestionCatalogueLocal) c.lookup("java:global/BorneMcDo/BorneMcDo-ejb/GestionCatalogue!ejb.GestionCatalogueLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
    
    
}
