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
}
