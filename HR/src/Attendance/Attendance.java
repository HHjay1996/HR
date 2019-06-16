package Attendance;

public class Attendance {
	private String eid;
	private String Name;
	private String date;
	private Integer workHrsPerDay;
	private Integer otHrs;
	private Integer workDaysperMonth;
	
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getWorkHrsPerDay() {
		return workHrsPerDay;
	}
	public void setWorkHrsPerDay(Integer workHrsPerDay) {
		this.workHrsPerDay = workHrsPerDay;
	}
	public Integer getOtHrs() {
		return otHrs;
	}
	public void setOtHrs(Integer otHrs) {
		this.otHrs = otHrs;
	}
	public Integer getWorkDaysperMonth() {
		return workDaysperMonth;
	}
	public void setWorkDaysperMonth(Integer workDaysperMonth) {
		this.workDaysperMonth = workDaysperMonth;
	}
	


}
