package modelLayer;

import java.io.Serializable;
import javax.persistence.*;
import modelLayer.StockItem;

/**
 * Entity implementation class for Entity: Film
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Film extends StockItem implements Serializable {	
	private static final long serialVersionUID = 1L;

	private String acteur ;
	
	public Film() {
		super();
	}
	
    public Film(String act,String nom , int rentprc){
        super(nom,rentprc);
        acteur = act ;
    }
    public String getActeur() {
        return acteur;
    }
    public void setActeur(String acteur) {
        this.acteur = acteur;
    }
   
}
