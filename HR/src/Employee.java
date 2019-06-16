import ConnectDatabase.DatabaseConnection;
import java.sql.Connection;
public class Employee {
	   private int eid;
	   private String name;
	   
	   public int geteid() {
	      return eid;
	   }
	   
	   public void seteid(int eid) {
	      this.eid = eid;
	   }
	   
	   public String getName() {
	      return name;
	   }
	   
	   public void setName(String name) {
	      this.name = name;
	   }
	}