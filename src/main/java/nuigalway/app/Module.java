package nuigalway.app;

import java.util.ArrayList;

public class Module {
	private String name;
	private String id;	
	private ArrayList<Course> courses = new ArrayList<Course>(); 
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public Module(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	public void add(Student student1) {
		students.add(student1);		
	}

	public int getStudents() {
		for(int i = 0; i < students.size(); i++){
			System.out.println(i+1);
		}
		return students.size();
	}

	public void getCourses() {
		// TODO Auto-generated method stub
		
	}

}
