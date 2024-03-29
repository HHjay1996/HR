package ConnectDatabase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/*import com.oop.service.IEmployeeService;
import com.oop.util.CommonConstants;
import com.oop.util.QueryUtil;
import com.oop.util.String;*/

import Attendance.AttendanceINTF ;

public class CommonUtil {
	
	public static final Logger log = Logger.getLogger(AttendanceINTF.class.getName());

	public static final Properties properties = new Properties();

	static {
		try {
			
			// Read the property only once when load the class
			properties.load(QueryUtil.class.getResourceAsStream(CommonConstants.PROPERTY_FILE));
			
		} catch (IOException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
	}

	/**
	 * Add new Employee ID
	 * 
	 * @param arrayList
	 * @return
	 */
	public static String generateIDs(ArrayList<String> arrayList) {

		String id;
		int next = arrayList.size();
		next++;
		id = CommonConstants.EMPLOYEE_ID_PREFIX + next;
		if (arrayList.contains(id)) {
			next++;
			id = CommonConstants.EMPLOYEE_ID_PREFIX + next;
		}
		return id;
	}

}
