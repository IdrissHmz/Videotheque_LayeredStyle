package modelLayer;

import java.io.Serializable;
import javax.persistence.*;
import modelLayer.StockItem;

/**
 * Entity implementation class for Entity: Game
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Game extends StockItem implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String platform ;

	public Game (String plt,String nom, int rentprc){
        super(nom,rentprc);
        platform = plt;
    }
	
	public Game() {
		super();
	}

    
    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }
	
	
   
}
