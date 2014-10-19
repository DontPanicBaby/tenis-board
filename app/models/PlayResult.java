package models;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.data.validation.*;
import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

@Entity
public class PlayResult extends Model {
	@Id
	public Long id;
	
	@ManyToOne
	public Players player1;
	
	@ManyToOne
	public Players player2;
	  
	@Constraints.Required
	public Integer score1;
	
	@Constraints.Required
	public Integer score2;
	  
	public static Finder<Long,PlayResult> find = new Finder(
			Long.class, PlayResult.class
	);
			  
	public static List<PlayResult> all() {
		return find.all();
	}

}
