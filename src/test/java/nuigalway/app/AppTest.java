package nuigalway.app;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	
    @Test
    public void getUsernameTest()
    {
    	Student testStudent = new Student("Bernard", 22, "05/05/1997", 14527643);
    	testStudent.setUsername();
    	
    	assertEquals("Bernard22", testStudent.getUsername());
    }
    
    @Test
    public void getStudentsTest()
    {
    	Module testModule = new Module("Software III", "CT417");
    	
    	Student testStudent1 = new Student("test1", 22, "05/05/1997", 14527643);
    	Student testStudent2 = new Student("test2", 24, "12/05/1997", 14527644);
    	Student testStudent3 = new Student("test3", 30, "25/05/1997", 14527645);
    	
    	testModule.add(testStudent1);
    	testModule.add(testStudent2);
    	testModule.add(testStudent3);
    	
    	assertEquals(3, testModule.getStudents());
    }
    
    @Test
    public void JodaTime()
    {
    	//To ensure JodaTime is working
    	DateTime date = new DateTime();
    	assertEquals(2019, date.getYear());
        
    }
    
    @Test
    public void getModulesTest()
    {
    	LocalDate startDate  = new LocalDate( 2016 , 7 , 1 );
        LocalDate endDate	 = new LocalDate( 2020 , 5 , 31 );
        
    	Course testCourse = new Course("IT", startDate, endDate);
    	ArrayList<Module> testArray = new ArrayList<Module>();
    	 
    	Module testModule1 = new Module("Software III", "CT417");
        Module testModule2 = new Module("Machine Learning", "CT41010");
        
     
        testCourse.add(testModule1);
        testCourse.add(testModule2);       
        
        testArray.add(testModule1);
        testArray.add(testModule2);
         
        
    	assertEquals(testArray, testCourse.getModules());
    }
}
