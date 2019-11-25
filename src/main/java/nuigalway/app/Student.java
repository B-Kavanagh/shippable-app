package nuigalway.app;

import java.util.ArrayList;

public class Student {
	private String name;
	private int age;
	private String DOB;
	private int id;
	private String username;
	private ArrayList<Course> courses = new ArrayList<Course>(); 
	private ArrayList<Module> modules = new ArrayList<Module>();

	public Student(String name, int age, String dob, int id){
		this.name = name;
		this.age = age;
		this.DOB = dob;
		this.id = id; 		
	}
	
	public void setUsername() {
		username = name + age;
		
	}
	
	public String getUsername() {
		System.out.println(this.username);
		return this.username;
		
	}

	public void getRegisteredModules() {
		// TODO Auto-generated method stub
		
	}

}
