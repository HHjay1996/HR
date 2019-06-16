import ConnectDatabase.DatabaseConnection;
import java.sql.Connection;
public class MVC{
   public static void main(String[] args) {

      //fetch Employee record based on his eid from the database
      Employee model  = retriveEmployeeFromDatabase();

      //Create a view : to write Employee details on console
      EmployeeView view = new EmployeeView();

      EmpController controller = new EmpController(model, view);

      controller.updateView();

      //update model data
      controller.setempName("John");

      controller.updateView();
   }

   private static Employee retriveEmployeeFromDatabase(){
      Employee employee = new Employee();
      employee.setName("Robert");
      employee.seteid(10);
      return employee;
   }
}