import ConnectDatabase.DatabaseConnection;
import java.sql.Connection;
public class EmpController {
   private Employee model;
   private EmployeeView view;

   public EmpController(Employee model, EmployeeView view){
      this.model = model;
      this.view = view;
   }

   public void setempName(String name){
      model.setName(name);		
   }

   public String getempName(){
      return model.getName();		
   }

   public void seteid(Integer eid){
      model.seteid(eid);		
   }

   public Integer geteid(){
      return model.geteid();		
   }

   public void updateView(){				
      view.printEmployeeDetails(model.getName(), model.geteid());
   }	
}