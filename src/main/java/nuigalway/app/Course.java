package nuigalway.app;

import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Course {
	private String name;
	private LocalDate start;
	private LocalDate end;
	private String startEnd;
	private ArrayList<Module> modules = new ArrayList<Module>();
	
	public Course(String name, LocalDate start, LocalDate end){
		this.name = name;
		this.start = start;
		this.end = end;
	}

	public void add(Module module) {
		modules.add(module);
	}

	public ArrayList<Module> getModules() {
		for(int i=0; i<modules.size(); i++){
			System.out.println(modules.get(i).getName());
		}
		return modules;
		
	}

	public void getStudents() {
		// TODO Auto-generated method stub
		
	}

	public void getStartEndDates() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString(){//overriding the toString() method  
		  return "Course Start time: "+start+"\nCourse End time: "+end;  
		 }
	

}
