package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.*;
import play.db.ebean.Model;

@Entity
public class Players extends Model {
	@Id
	public Long id;
	  
	@Constraints.Required
	public String name;
	  
	public static Finder<Long,Players> find = new Finder(
			Long.class, Players.class
	);
			  
	public static List<Players> all() {
		return find.all();
	}
}
