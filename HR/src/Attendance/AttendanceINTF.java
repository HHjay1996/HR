package Attendance;

import java.util.ArrayList;

import Attendance.Attendance;


public interface AttendanceINTF {

	public int insertEmployee(Attendance att) ;
		
		
	
	public Attendance getAttendace(String eid,String name);

	public ArrayList<Attendance> getAttendance();
}
