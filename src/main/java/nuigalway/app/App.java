package nuigalway.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //public Student(String name, int age, String dob, int id)
        Student student1 = new Student("Bernard", 22, "05/05/1997", 14527643);
        Student student2 = new Student("John", 23, "12/11/1996", 14585264);
        Student student3 = new Student("Mary", 24, "01/01/1995", 14412379);
        
        student1.setUsername();
        student1.getUsername();
        
        Module module1 = new Module();
        Module module2 = new Module();

        Course course = new Course();
        
        module1.add(student1);
        module1.add(student2);
        
        module2.add(student2);
        module2.add(student3);
        
        course.add(module1);
        course.add(module2);
        
        //student1.getUsername();
        student1.getRegisteredModules();
        
        module1.getStudents();
        module1.getCourses();
        
        course.getModules();
        course.getStudents();
        course.getStartEndDates();
        
        
        
        
    }
}
