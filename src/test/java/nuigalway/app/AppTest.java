package nuigalway.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	
    @Test
    public void getUsername()
    {
    	Student testStudent = new Student("Bernard", 22, "05/05/1997", 14527643);
    	testStudent.setUsername();
    	
    	assertEquals("Bernard22", testStudent.getUsername());
    }
    
    @Test
    public void getStudents()
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
}
