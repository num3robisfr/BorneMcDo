package entites;

import entites.Article;
import entites.Menu;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-03T16:41:16")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-03T10:05:45")
>>>>>>> a78c4681261c9d314caf2700cc7de48f06cebd0a
@StaticMetamodel(InfoArticle.class)
public class InfoArticle_ { 

    public static volatile SingularAttribute<InfoArticle, String> image;
    public static volatile CollectionAttribute<InfoArticle, Menu> lesMenus;
    public static volatile SingularAttribute<InfoArticle, String> titre;
    public static volatile CollectionAttribute<InfoArticle, Article> lesArticle;
    public static volatile SingularAttribute<InfoArticle, String> description;
    public static volatile SingularAttribute<InfoArticle, Long> id;
    public static volatile SingularAttribute<InfoArticle, String> sousTitre;

}