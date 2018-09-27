package ejb;

import entites.Article;
import entites.Categorie;
import entites.InfoArticle;
import entites.Ingredient;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
public class CreationJeuEssai implements CreationJeuEssaiLocal {
    
    @PersistenceContext(unitName = "BorneMcDo-ejbPU")
    private EntityManager em;
    
    @Override
    public void creerDonnees() {
        Article cheeseBurger = new Article("LE CHEESEBURGER",
                "Le « Cheese » pour les intimes",
                "Un steak haché, une tranche de cheddar fondu, une rondelle de cornichon, des oignons, du ketchup et de la moutarde douce dans un pain classique : fondez pour son goût unique et emblématique.",
                "./images/cheeseburger.png",
                1.45f);
        Article bigMac = new Article("LE BIG MAC™",
                "Le seul, l'unique",
                "Ses deux steaks hachés, son cheddar fondu, ses oignons, ses cornichons, son lit de salade et sa sauce inimitable, font du Big Mac un burger culte et indémodable.",
                "./images/big-mac.png",
                3.45f);
        Article cbo = new Article("LE CBO™",
                "",
                "Pain spécial aux éclats de bacon, spécialité panée au poulet, bacon, fromage fondu goût bacon au poivre, oignons préparés et frits, salade, sauce",
                "./images/CBO.png",
                4.27f);
        
        Article panCakes = new Article("LES PANCAKES",
                "",
                "Sirop confiture d'abricot, framboise, orange, miel, Nutella, beurre",
                "./images/pancakes.png",
                2.64f);
        
        Article petitCoca = new Article("COCA-COLA®",
                "",
                "Avec sa recette authentique et son goût unique, Coca-Cola Original Taste nous procure plaisir, rafraîchissement et nous donne au quotidien une énergie positive incomparable... Coca-Cola Original Taste, c'est du bonheur en bouteille !\n"
                + " \n"
                + "Rendez-vous chez McDonald's pour redécouvrir le goût original et rafraîchissant de cette boisson unique et vivre un moment de convivialité entre amis !\n",
                "./images/petitCoca.png",
                1.73f);
        
        Article moyenCoca = new Article("COCA-COLA®",
                "",
                "Avec sa recette authentique et son goût unique, Coca-Cola Original Taste nous procure plaisir, rafraîchissement et nous donne au quotidien une énergie positive incomparable... Coca-Cola Original Taste, c'est du bonheur en bouteille !\n"
                + " \n"
                + "Rendez-vous chez McDonald's pour redécouvrir le goût original et rafraîchissant de cette boisson unique et vivre un moment de convivialité entre amis !\n",
                "./images/moyenCoca.png",
                2.09f);
        
        Article grandCoca = new Article("COCA-COLA®",
                "",
                "Avec sa recette authentique et son goût unique, Coca-Cola Original Taste nous procure plaisir, rafraîchissement et nous donne au quotidien une énergie positive incomparable... Coca-Cola Original Taste, c'est du bonheur en bouteille !\n"
                + " \n"
                + "Rendez-vous chez McDonald's pour redécouvrir le goût original et rafraîchissant de cette boisson unique et vivre un moment de convivialité entre amis !\n",
                "./images/grandCoca.png",
                2.55f);
        
        Article petitFanta = new Article("FANTA®",
                "",
                "Profitez d'un moment de plaisir en famille chez McDonald's pour découvrir ou redécouvrir le goût unique si fruité et délicieux de Fanta Orange ! \n"
                + "Fanta Orange contient du jus d'orange et des arômes naturels.",
                "./images/petitFanta.png",
                1.73f);
        
        Article moyenFanta = new Article("FANTA®",
                "",
                "Profitez d'un moment de plaisir en famille chez McDonald's pour découvrir ou redécouvrir le goût unique si fruité et délicieux de Fanta Orange ! \n"
                + "Fanta Orange contient du jus d'orange et des arômes naturels.",
                "./images/moyenFanta.png",
                2.09f);
        
        Article grandFanta = new Article("FANTA®",
                "",
                "Profitez d'un moment de plaisir en famille chez McDonald's pour découvrir ou redécouvrir le goût unique si fruité et délicieux de Fanta Orange ! \n"
                + "Fanta Orange contient du jus d'orange et des arômes naturels.",
                "./images/grandFanta.png",
                2.55f);
        
        Article petitSprite = new Article("SPRITE ZERO®",
                "Plus qu'une boisson, un frisson !",
                "Vivez l'expérience Sprite zero chez McDonald's et redécouvrez le goût unique de la célèbre boisson rafraîchissante aux arômes naturels de citron et citron vert, maintenant sans sucre !\n"
                + " \n"
                + "Sprite, born to refresh !*"
                + "*Créé pour rafraichir !\n",
                "./images/petitSprite.png",
                1.73f);
        
        Article moyenSprite = new Article("SPRITE ZERO®",
                "Plus qu'une boisson, un frisson !",
                "Vivez l'expérience Sprite zero chez McDonald's et redécouvrez le goût unique de la célèbre boisson rafraîchissante aux arômes naturels de citron et citron vert, maintenant sans sucre !\n"
                + " \n"
                + "Sprite, born to refresh !*"
                + "*Créé pour rafraichir !\n",
                "./images/moyenSprite.png",
                2.09f);
        
        Article grandSprite = new Article("SPRITE ZERO®",
                "Plus qu'une boisson, un frisson !",
                "Vivez l'expérience Sprite zero chez McDonald's et redécouvrez le goût unique de la célèbre boisson rafraîchissante aux arômes naturels de citron et citron vert, maintenant sans sucre !\n"
                + " \n"
                + "Sprite, born to refresh !*"
                + "*Créé pour rafraichir !\n",
                "./images/grandSprite.png",
                2.55f);
        
        Article expresso = new Article("L'EXPRESSO",
                "Pour se réveiller, rien de tel qu'un EXPRESSO.",
                "Une jolie mousse. Un goût intense. Profitez de sa richesse et de ses arômes dès les premières lueurs de la journée. Notre café Segafredo, à l'exception de notre café décaféiné, est 100% Arabica, fraîchement moulu et issu de fermes vérifiées Rainforest Alliance.",
                "./images/expresso.png",
                1.25f);
        
        Article cappuccino = new Article("LE CAPPUCCINO",
                "Une véritable recette à l'italienne.",
                "Sous une mousse de lait chaud, toute la puissance et l'arôme d'un expresso mélangé à une touche de lait.",
                "./images/cappuccino.png",
                2.08f);
        
        Article nuggets4 = new Article("LES CHICKEN McNUGGETS™",
                "À déguster seul ou accompagné",
                "Craquez pour ces nuggets croustillants, à savourer avec ou sans sauce, en famille ou entre amis, faîtes-vous plaisir !",
                "./images/nuggets.png",
                2.58f);
        Article nuggets6 = new Article("LES CHICKEN McNUGGETS™",
                "À déguster seul ou accompagné",
                "Craquez pour ces nuggets croustillants, à savourer avec ou sans sauce, en famille ou entre amis, faîtes-vous plaisir !",
                "./images/nuggets.png",
                3.5f);
        Article nuggets9 = new Article("LES CHICKEN McNUGGETS™",
                "À déguster seul ou accompagné",
                "Craquez pour ces nuggets croustillants, à savourer avec ou sans sauce, en famille ou entre amis, faîtes-vous plaisir !",
                "./images/nuggets.png",
                4.42f);
        Article nuggets20 = new Article("LES CHICKEN McNUGGETS™",
                "À déguster seul ou accompagné",
                "Craquez pour ces nuggets croustillants, à savourer avec ou sans sauce, en famille ou entre amis, faîtes-vous plaisir !",
                "./images/nuggets.png",
                8.25f);
        
        Article petiteFrite = new Article("LES FRITES",
                "Comment ne pas craquer ?",
                "En menu, pour combler une petite faim, en petite, moyenne ou bien grande portion, goûtez-les croustillantes et savoureuses.",
                "./images/petiteFrite.png",
                1.33f);
        Article moyenneFrite = new Article("LES FRITES",
                "Comment ne pas craquer ?",
                "En menu, pour combler une petite faim, en petite, moyenne ou bien grande portion, goûtez-les croustillantes et savoureuses.",
                "./images/moyenneFrite.png",
                2.08f);
        Article grandeFrite = new Article("LES FRITES",
                "Comment ne pas craquer ?",
                "En menu, pour combler une petite faim, en petite, moyenne ou bien grande portion, goûtez-les croustillantes et savoureuses.",
                "./images/grandeFrite.png",
                2.42f);
        
        Article moyennePotatoes = new Article("LES DELUXE POTATOES™",
                "Craquantes et savoureuses !",
                "Découvrez ces délicieux morceaux de pomme de terre épicés et leur sauce spéciale à la ciboulette, en accompagnement d'un menu ou pour les petites faims, ils sauront à la perfection trouver leur place sur votre plateau.",
                "./images/petitPotatoes.png",
                2.08f);
        Article grandePotatoes = new Article("LES DELUXE POTATOES™",
                "Craquantes et savoureuses !",
                "Découvrez ces délicieux morceaux de pomme de terre épicés et leur sauce spéciale à la ciboulette, en accompagnement d'un menu ou pour les petites faims, ils sauront à la perfection trouver leur place sur votre plateau.",
                "./images/moyenPotatoes.png",
                2.42f);
        
        Article ketchup = new Article("LE KETCHUP",
                "",
                "Tomato Ketchup",
                "./images/sauceKetchup.png",
                0);
        Article sauceFrite = new Article("LA SAUCE POMMES-FRITES",
                "",
                "Sauce Pommes frites",
                "./images/sauceFrites.png",
                0);
        Article moutarde = new Article("LA SAUCE CLASSIC MOUTARDE",
                "",
                "Sauce Classic Moutarde",
                "./images/sauceMoutarde.png",
                0.25f);
        Article sauceBbq = new Article("LA SAUCE CLASSIC BARBECUE",
                "",
                "Sauce Classic Barbecue",
                "./images/sauceBbq.png",
                0.25f);
        Article sauceCurry = new Article("LA SAUCE CURRY",
                "",
                "LA SAUCE CURRY",
                "./images/sauceCurry.png",
                0.25f);
        Article salade = new Article("LA SALADE ITALIAN MOZZA",
                "",
                "Une salade à base de pâtes radiatori parfumées au basilic, des feuilles de roquettes, des tomates assaisonnées aux herbes et une généreuse mozzarella au lait de bufflonne. Servie avec une sauce vinaigrette à l'huile d'olive et au vinaigre balsamique",
                "./images/salade.png",
                5.25f);
        
        Article muffin = new Article("LE P'TIT MUFFIN AUX PÉPITES DE CHOCOLAT",
                "Succombez aux nouveaux P'tits Muffins !",
                "Découvrez les nouveaux P'tits Muffins avec un fourrage saveur chocolat noisette ou à la myrtille.",
                "./images/muffin.png",
                1.67f);
        Article mcFlurryKK = new Article("LE McFLURRY",
                "Inventez le McFlurry™ de vos rêves !",
                "Un délicieux tourbillon glacé* accompagné d'une gourmandise et d'un nappage pour un plaisir intense !\n"
                + "Choisissez un croquant : Oréo®, Speculoos Lotus, Daim®, Kit Kat Ball® ou M&M's®**.\n"
                + "Complétez avec le nouveau coulis mangue passion ou un nappage saveur chocolat ou caramel.\n"
                + " \n"
                + "Tout simplement irrésistible !",
                "./images/McFlurryKitkat.png",
                2.67f);
        Article mcFlurryOreo = new Article("LE McFLURRY",
                "Inventez le McFlurry™ de vos rêves !",
                "Un délicieux tourbillon glacé* accompagné d'une gourmandise et d'un nappage pour un plaisir intense !\n"
                + "Choisissez un croquant : Oréo®, Speculoos Lotus, Daim®, Kit Kat Ball® ou M&M's®**.\n"
                + "Complétez avec le nouveau coulis mangue passion ou un nappage saveur chocolat ou caramel.\n"
                + " \n"
                + "Tout simplement irrésistible !",
                "./images/McFlurryOreo.png",
                2.67f);
<<<<<<< HEAD
        Article SundaeChoco = new Article("LE SUNDAE",
                "",
                "Craquez pour un plaisir glacé au lait avec des éclats de cacahuètes et retrouvez les nappages saveur caramel et chocolat, pour une pause gourmande ou un plaisir de fin de repas.",
                "images/SundaeChocolat.png",
                1.92f);
        Article SundaeCaramel = new Article("LE SUNDAE",
                "",
                "Craquez pour un plaisir glacé au lait avec des éclats de cacahuètes et retrouvez les nappages saveur caramel et chocolat, pour une pause gourmande ou un plaisir de fin de repas.",
                "images/SundaeCaramel.png",
                1.92f);
        Article cadeauFille = new Article("LE PETIT CADEAU", "MON PETIT PONEY", "", "images/cadeauFille.png", 0.6f);
        Article cadeauGarcon = new Article("LE PETIT CADEAU", "TRANSFORMERS", "", "images/cadeauGarcon.png", 0.6f);
        Article livre = new Article("LE PETIT CADEAU", "MON PETIT PONEY", "", "images/livre.png", 0.6f);

=======
        Article SundaeChoco = new Article("LE SUNDAE", 
                "", 
                "Craquez pour un plaisir glacé au lait avec des éclats de cacahuètes et retrouvez les nappages saveur caramel et chocolat, pour une pause gourmande ou un plaisir de fin de repas.", 
                "./images/SundaeChocolat.png", 
                1.92f);
        Article SundaeCaramel = new Article("LE SUNDAE", 
                "", 
                "Craquez pour un plaisir glacé au lait avec des éclats de cacahuètes et retrouvez les nappages saveur caramel et chocolat, pour une pause gourmande ou un plaisir de fin de repas.", 
                "./images/SundaeCaramel.png", 
                1.92f);
        Article cadeauFille = new Article("LE PETIT CADEAU", "MON PETIT PONEY", "", "./images/cadeauFille.png", 0.6f);
        Article cadeauGarcon = new Article("LE PETIT CADEAU", "TRANSFORMERS", "", "./images/cadeauGarcon.png", 0.6f);
        Article livre = new Article("LE PETIT CADEAU", "MON PETIT PONEY", "", "./images/livre.png", 0.6f);
        
>>>>>>> 4993513b4b80a9f058ab9ad1da9bdba3b024dbea
        //Ingredients
        Ingredient pain = new Ingredient("pain spécial");
        Ingredient steak = new Ingredient("steak haché");
        Ingredient fromage = new Ingredient("fromage fondu");
        Ingredient oignon = new Ingredient("oignons");
        Ingredient cornichon = new Ingredient("cornichons");
        Ingredient moutardeI = new Ingredient("moutarde");
        Ingredient ketchupI = new Ingredient("ketchup");
        Ingredient salad = new Ingredient("salade");
        Ingredient sauce = new Ingredient("sauce");
        Ingredient painsp = new Ingredient("pain spécial au éclats de bacon");
        Ingredient pane = new Ingredient("specialité panée au poulet");
        Ingredient bacon = new Ingredient("bacon");
        Ingredient fromageBc = new Ingredient("fromage fondu goût bacon au poivre");
        Ingredient siropAbricot = new Ingredient("Sirop de confiture d'abricot");
        Ingredient siropFramboise = new Ingredient("Sirop de confiture de framboise");
        Ingredient siropOrange = new Ingredient("Sirop de confiture d'orange");
        Ingredient miel = new Ingredient("miel");
        Ingredient Nutella = new Ingredient("NUTELLA ®");
        Ingredient Beurre = new Ingredient("beurre");

        //Catégories
<<<<<<< HEAD
        Categorie burger = new Categorie("burger");
        Categorie petitAccomp = new Categorie("petit accompagnement");
        Categorie moyenAccomp = new Categorie("moyen accompagnement");
        Categorie grandAccomp = new Categorie("grand accompagnement");
        Categorie breakfast = new Categorie("petit déjeuner");
        Categorie petitBoisson = new Categorie("petite boisson");
        Categorie moyenBoisson = new Categorie("moyenne boisson");
        Categorie grandeBoisson = new Categorie("grande boisson");
        Categorie boissonChaude = new Categorie("boisson chaude");
        Categorie platAutre = new Categorie("autres plats");
        Categorie cadeau = new Categorie("cadeau");
        Categorie sauceCat = new Categorie("sauce");
        Categorie saladCat = new Categorie("salade");
        Categorie dessert = new Categorie("dessert");

        //Information articles
        InfoArticle infoSteak = new InfoArticle("Petite mise au point sur la viande bovine :\n"
                + "  La viande de nos steaks hachés est 100% pur bœuf et provient de bovins d'origine française pour 51,27% (chiffres et estimations sur base des volumes de produits achetés en 2015). Le volume restant provient des Pays-Bas, d'Irlande selon le même cahier des charges et les mêmes contrôles qu'en France. Nos fournisseurs sélectionnent pour vous des muscles principalement issus de l'avant des bovins, par exemple, l'épaule, le collier, le plat de côte.",
                "NOS STEAKS HACHÉS", "LES FILIÈRES QUALITÉ");
        InfoArticle infoNutriBigMac = new InfoArticle("images/infoNutriBigMac.png");
        InfoArticle infoAllergBigMac = new InfoArticle("images/infoallergBigMac.png");
        InfoArticle infoFiliere = new InfoArticle("Depuis toujours, la qualité et la sécurité alimentaire sont au cœur de nos préoccupations.\n"
                + "Cette exigence commence bien en amont dès la production des matières premières et se poursuit jusqu'au restaurant. ", "", "LES FILIÈRES QUALITÉ");
        InfoArticle infoNutriCbo = new InfoArticle("images/infoNutriCbo.png");
        InfoArticle infoAllerCbo = new InfoArticle("images/infoallergCbo.png");
        InfoArticle infoPainRond = new InfoArticle("Sa mie serrée, sa croûte fine et sa couleur uniforme sont obtenues notamment grâce à l’utilisation d’une farine de qualitéproduite par mouture de blés de force. La qualité de nos petits pains ronds est contrôlée à chaque étape de leur fabrication.",
                "NOS PETITS PAINS RONDS", "LES FILIÈRES QUALITÉ");
        InfoArticle infoNutriCheese = new InfoArticle("images/infoNutriCheese.png");
        InfoArticle infoallergCheese = new InfoArticle("images/infoallergCheese.png");
        InfoArticle infoNutriCoca = new InfoArticle("images/infoNutriCoca.png");
        InfoArticle infoallergVide = new InfoArticle("images/infoallergVide.png");
        InfoArticle infoNutriSprite = new InfoArticle("images/infoNutriSprite.png");
        InfoArticle infoNutriFanta = new InfoArticle("images/infoNutriFanta.png");
        InfoArticle infoNutriCappu = new InfoArticle("images/infoNutriCappu.png");
        InfoArticle infoallergCappu = new InfoArticle("images/infoallergCappu.png");
        InfoArticle infoNuggets = new InfoArticle(" Nos Chicken McNuggets sont préparés à partir de filets de poulet origine France. Finement hachés et marinés, ils sont ensuite enrobés d'une panure, pour être servis dorés et croustillants, dans nos restaurants, pour toujours plus de plaisir.\n"
                + "\n"
                + "L'Élevage\n"
                + "  1. Les poulets sont élevés dans des bâtiments couverts et tempérés où ils se déplacent librement et accèdent facilement aux points de nourriture et d’eau fraîche.\n"
                + "  2. Leur alimentation est végétale avec des minéraux et des vitamines. Aucun antibiotique activateur de croissance* et aucune farine animale* ne sont autorisés (* conformément à la réglementation en vigueur).\n"
                + "  3. Les poulets sont élevés pendant environ 50 jours. ",
                "NOS CHICKEN McNUGGETS",
                "LES FILIÈRES QUALITÉ");
        InfoArticle infoNutriNuggets = new InfoArticle("images/infoNutriNuggets.png");
        InfoArticle infoAllergNuggets = new InfoArticle("images/infoAllergNuggets.png");
        InfoArticle infoFrites = new InfoArticle("Les pommes de terres utilisées pour nos frites sont 100% d’origine française. Les pommes de terre pour nos frites sont cultivées en France. McDonald's utilise des variétés comme la Santana ou encore l'Innovator dont les longs tubercules permettent d’avoir de longues frites. En restaurant, elles sont cuites dans une huile végétale composée de colza et de tournesol pour des frites toujours croustillantes. ",
                "NOS FRITES",
                "LES FILIÈRES QUALITÉ");
        InfoArticle infoNutriFrites = new InfoArticle("images/infoNutriFrites.png");
        InfoArticle infoAllergFrites = new InfoArticle("images/infoAllergFrites.png");
        InfoArticle infoNutriPota = new InfoArticle("images/infoNutriPota.png");
        InfoArticle infoNutriKetchup = new InfoArticle("images/infoNutriKetchup.png");
        InfoArticle infoNutriSauceFrite = new InfoArticle("images/infoNutriSauceFrite.png");
        InfoArticle infoAllergSauceFrite = new InfoArticle("images/infoAllergSauceFrite.png");
        InfoArticle infoNutriMout = new InfoArticle("images/infoNutriMout.png");
        InfoArticle infoAllergMout = new InfoArticle("images/infoAllergMout.png");
        InfoArticle infoNutriCurry = new InfoArticle("infoNutriCurry.png");
        InfoArticle infoAllergCurry = new InfoArticle("images/infoAllergCurry.png");
        InfoArticle infoNutriBbq = new InfoArticle("images/infoNutriBbq.png");
        InfoArticle infoAllergBbq = new InfoArticle("images/infoAllergBbq.png");
        InfoArticle infoNutriSalad = new InfoArticle("images/infoNutriSalad.png");
        InfoArticle infoAllergSalad = new InfoArticle("images/infoAllergSalad.png");
        InfoArticle infoNutriMuffin = new InfoArticle("images/infoNutriMuffin.png");
        InfoArticle infoAllergMuffin = new InfoArticle("images/infoAllergMuffin.png");
        InfoArticle infoNutriSundae = new InfoArticle("images/infoNutriSundae.png");
        InfoArticle infoAllergSundae = new InfoArticle("images/infoAllergSundae.png");
=======
//        Categorie burger = new Categorie("burger");
//        Categorie petitAccomp = new Categorie("petit accompagnement");
//        Categorie moyenAccomp = new Categorie("moyen accompagnement");
//        Categorie grandAccomp = new Categorie("grand accompagnement");
//        Categorie breakfast = new Categorie("petit déjeuner");
//        Categorie petitBoisson = new Categorie("petite boisson");
//        Categorie moyenBoisson = new Categorie("moyenne boisson");
//        Categorie grandeBoisson = new Categorie("grande boisson");
//        Categorie boissonChaude = new Categorie("boisson chaude");
//        Categorie platAutre = new Categorie("autres plats");
//        Categorie cadeau = new Categorie("cadeau");
//        Categorie sauceCat = new Categorie("sauce");
//        Categorie saladCat = new Categorie("salade");
//        Categorie dessert = new Categorie("dessert");
        
        Categorie nosMenus = new Categorie("nos menus", "./images/nos_menus.png");
        Categorie nosBurgers = new Categorie("nos burgers", "./images/nos_burgers.png");
        Categorie petiteFaim = new Categorie("petite faim","./images/petite_faim.png");
        Categorie nosSalades = new Categorie("nos salades","./images/nos_salades.png");
        Categorie nosBoissons = new Categorie("nos boissons","./images/nos_boissons.png");
        Categorie nosDesserts = new Categorie("nos desserts","./images/nos_desserts.png");
        Categorie nosFritesSauces = new Categorie("nos frites & sauces", "./images/nos_frites&sauces.png");
        Categorie happyMeal = new Categorie("happy meal", "./images/happy_meal.png");
>>>>>>> 4993513b4b80a9f058ab9ad1da9bdba3b024dbea
        
        

        cbo.getLesIngredients().add(painsp);
        cbo.getLesIngredients().add(pane);
        cbo.getLesIngredients().add(bacon);
        cbo.getLesIngredients().add(fromageBc);
        cbo.getLesIngredients().add(oignon);
        cbo.getLesIngredients().add(salad);
        cbo.getLesIngredients().add(sauce);
        
        bigMac.getLesIngredients().add(pain);
        bigMac.getLesIngredients().add(steak);
        bigMac.getLesIngredients().add(salad);
        bigMac.getLesIngredients().add(oignon);
        bigMac.getLesIngredients().add(cornichon);
        bigMac.getLesIngredients().add(fromage);
        bigMac.getLesIngredients().add(sauce);
        
        cheeseBurger.getLesIngredients().add(pain);
        cheeseBurger.getLesIngredients().add(steak);
        cheeseBurger.getLesIngredients().add(fromage);
        cheeseBurger.getLesIngredients().add(oignon);
        cheeseBurger.getLesIngredients().add(cornichon);
        cheeseBurger.getLesIngredients().add(moutardeI);
        cheeseBurger.getLesIngredients().add(ketchupI);
        
        panCakes.getLesIngredients().add(siropAbricot);
        panCakes.getLesIngredients().add(siropFramboise);
        panCakes.getLesIngredients().add(siropOrange);
        panCakes.getLesIngredients().add(miel);
        panCakes.getLesIngredients().add(Nutella);
        panCakes.getLesIngredients().add(Beurre);
        
<<<<<<< HEAD
        cheeseBurger.setLaCategorie(burger);
        bigMac.setLaCategorie(burger);
        cbo.setLaCategorie(burger);
        panCakes.setLaCategorie(breakfast);
        petitCoca.setLaCategorie(petitBoisson);
        moyenCoca.setLaCategorie(moyenBoisson);
        grandCoca.setLaCategorie(grandeBoisson);
        petitFanta.setLaCategorie(petitBoisson);
        moyenFanta.setLaCategorie(moyenBoisson);
        grandFanta.setLaCategorie(grandeBoisson);
        petitSprite.setLaCategorie(petitBoisson);
        moyenSprite.setLaCategorie(moyenBoisson);
        grandSprite.setLaCategorie(grandeBoisson);
        expresso.setLaCategorie(boissonChaude);
        cappuccino.setLaCategorie(boissonChaude);
        nuggets4.setLaCategorie(platAutre);
        nuggets6.setLaCategorie(platAutre);
        nuggets9.setLaCategorie(platAutre);
        nuggets20.setLaCategorie(platAutre);
        petiteFrite.setLaCategorie(petitAccomp);
        moyenneFrite.setLaCategorie(moyenAccomp);
        grandeFrite.setLaCategorie(grandAccomp);
        moyennePotatoes.setLaCategorie(moyenAccomp);
        grandePotatoes.setLaCategorie(grandAccomp);
        sauceFrite.setLaCategorie(sauceCat);
        ketchup.setLaCategorie(sauceCat);
        moutarde.setLaCategorie(sauceCat);
        sauceBbq.setLaCategorie(sauceCat);
        sauceCurry.setLaCategorie(sauceCat);
        salade.setLaCategorie(saladCat);
        muffin.setLaCategorie(dessert);
        mcFlurryKK.setLaCategorie(dessert);
        mcFlurryOreo.setLaCategorie(dessert);
        SundaeCaramel.setLaCategorie(dessert);
        SundaeChoco.setLaCategorie(dessert);
        cadeauFille.setLaCategorie(cadeau);
        cadeauGarcon.setLaCategorie(cadeau);
        livre.setLaCategorie(cadeau);
        
        cbo.getLesInfos().add(infoNutriCbo);
        cbo.getLesInfos().add(infoAllerCbo);
        cbo.getLesInfos().add(infoFiliere);
        bigMac.getLesInfos().add(infoSteak);
        bigMac.getLesInfos().add(infoNutriBigMac);
        bigMac.getLesInfos().add(infoAllergBigMac);
        
        
        
=======
//      cheeseBurger.setLaCategorie(burger);
        cheeseBurger.setLaCategorie(nosBurgers);
//      bigMac.setLaCategorie(burger);
        bigMac.setLaCategorie(nosBurgers);
//      cbo.setLaCategorie(burger);
        cbo.setLaCategorie(nosBurgers);
//      panCakes.setLaCategorie(breakfast);
        panCakes.setLaCategorie(nosDesserts);
//      petitCoca.setLaCategorie(petitBoisson);
        petitCoca.setLaCategorie(nosBoissons);
//      moyenCoca.setLaCategorie(moyenBoisson);
        moyenCoca.setLaCategorie(nosBoissons);
//      grandCoca.setLaCategorie(grandeBoisson);
        grandCoca.setLaCategorie(nosBoissons);
//      petitFanta.setLaCategorie(petitBoisson);
        petitFanta.setLaCategorie(nosBoissons);
//      moyenFanta.setLaCategorie(moyenBoisson);
        moyenFanta.setLaCategorie(nosBoissons);
//      grandFanta.setLaCategorie(grandeBoisson);
        grandFanta.setLaCategorie(nosBoissons);
//      petitSprite.setLaCategorie(petitBoisson);
        petitSprite.setLaCategorie(nosBoissons);
//      moyenSprite.setLaCategorie(moyenBoisson);
        moyenSprite.setLaCategorie(nosBoissons);
//      grandSprite.setLaCategorie(grandeBoisson);
        grandSprite.setLaCategorie(nosBoissons);
//      expresso.setLaCategorie(boissonChaude);
        expresso.setLaCategorie(nosBoissons);
//      cappuccino.setLaCategorie(boissonChaude);
        cappuccino.setLaCategorie(nosBoissons);
//      nuggets4.setLaCategorie(platAutre);
        nuggets4.setLaCategorie(nosBurgers);
//      nuggets6.setLaCategorie(platAutre);
        nuggets6.setLaCategorie(nosBurgers);
//      nuggets9.setLaCategorie(platAutre);
        nuggets9.setLaCategorie(nosBurgers);
//      nuggets20.setLaCategorie(platAutre);
        nuggets20.setLaCategorie(nosBurgers);
//      petiteFrite.setLaCategorie(petitAccomp);
        petiteFrite.setLaCategorie(petiteFaim);
//      moyenneFrite.setLaCategorie(moyenAccomp);
        moyenneFrite.setLaCategorie(petiteFaim);
//      grandeFrite.setLaCategorie(grandAccomp);
        grandeFrite.setLaCategorie(petiteFaim);
//      moyennePotatoes.setLaCategorie(moyenAccomp);
        moyennePotatoes.setLaCategorie(petiteFaim);
//      grandePotatoes.setLaCategorie(grandAccomp);
        grandePotatoes.setLaCategorie(petiteFaim);
//      sauceFrite.setLaCategorie(sauceCat);
        sauceFrite.setLaCategorie(nosFritesSauces);
//      ketchup.setLaCategorie(sauceCat);
        ketchup.setLaCategorie(nosFritesSauces);
//      moutarde.setLaCategorie(sauceCat);
        moutarde.setLaCategorie(nosFritesSauces);
//      sauceBbq.setLaCategorie(sauceCat);
        sauceBbq.setLaCategorie(nosFritesSauces);
//      sauceCurry.setLaCategorie(sauceCat);
        sauceCurry.setLaCategorie(nosFritesSauces);
//      salade.setLaCategorie(saladCat);
        salade.setLaCategorie(nosSalades);
//      muffin.setLaCategorie(dessert);
        muffin.setLaCategorie(nosDesserts);
//      mcFlurryKK.setLaCategorie(dessert);
        mcFlurryKK.setLaCategorie(nosDesserts);
//      mcFlurryOreo.setLaCategorie(dessert);
        mcFlurryOreo.setLaCategorie(nosDesserts);
//      SundaeCaramel.setLaCategorie(dessert);
        SundaeCaramel.setLaCategorie(nosDesserts);
//      SundaeChoco.setLaCategorie(dessert);
        SundaeChoco.setLaCategorie(nosDesserts);
//      cadeauFille.setLaCategorie(cadeau);
        cadeauFille.setLaCategorie(happyMeal);
//      cadeauGarcon.setLaCategorie(cadeau);
        cadeauGarcon.setLaCategorie(happyMeal);
//      livre.setLaCategorie(cadeau);
        livre.setLaCategorie(happyMeal);

>>>>>>> 4993513b4b80a9f058ab9ad1da9bdba3b024dbea
        em.persist(cheeseBurger);
        em.persist(bigMac);
        em.persist(cbo);
        em.persist(panCakes);
        em.persist(petitCoca);
        em.persist(moyenCoca);
        em.persist(grandCoca);
        em.persist(petitFanta);
        em.persist(moyenFanta);
        em.persist(grandFanta);
        em.persist(petitSprite);
        em.persist(moyenSprite);
        em.persist(grandSprite);
        em.persist(expresso);
        em.persist(cappuccino);
        em.persist(nuggets4);
        em.persist(nuggets6);
        em.persist(nuggets9);
        em.persist(nuggets20);
        em.persist(petiteFrite);
        em.persist(moyenneFrite);
        em.persist(grandeFrite);
        em.persist(moyennePotatoes);
        em.persist(grandePotatoes);
        em.persist(sauceFrite);
        em.persist(ketchup);
        em.persist(moutarde);
        em.persist(sauceBbq);
        em.persist(sauceCurry);
        em.persist(salade);
        em.persist(muffin);
        em.persist(mcFlurryKK);
        em.persist(mcFlurryOreo);
        em.persist(SundaeCaramel);
        em.persist(SundaeChoco);
        em.persist(cadeauFille);
        em.persist(cadeauGarcon);
        em.persist(livre);
        
    }
    
}
