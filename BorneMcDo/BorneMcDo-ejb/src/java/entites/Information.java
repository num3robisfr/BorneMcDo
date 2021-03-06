package entites;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Information implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(length = 25)
    private String id;
    @Column(length = 500)
    private String description;
    
    @ManyToMany(mappedBy = "lesInfos")
    private Collection<Commande> lesCommandes;

    public Information() {
        lesCommandes = new ArrayList();
    }

    public Information(String id,String description) {
        this();
        this.id = id;
        this.description = description;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Commande> getLesCommandes() {
        return lesCommandes;
    }

    public void setLesCommandes(Collection<Commande> lesCommandes) {
        this.lesCommandes = lesCommandes;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Information)) {
            return false;
        }
        Information other = (Information) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Information n°" + id + ", description=" + description;
    }

    

}
