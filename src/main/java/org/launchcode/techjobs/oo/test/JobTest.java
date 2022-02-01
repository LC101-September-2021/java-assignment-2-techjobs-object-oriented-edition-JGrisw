package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    Job test_Job;
    @Before
    public  void jobObject() {
         test_Job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistance"));}

    @Test
    public void testSettingJobId(){
        Job test_Job2 = new Job();
        assertTrue(test_Job.getId()!= test_Job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(test_Job instanceof Job);
    }

    @Test
    public void testJobsForEquality(){
        Job test_Job2 = new Job("Product tester", new Employer("AMCE"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistance"));
        assertFalse(test_Job.equals(test_Job2));
    }

    @Test
    public void testToString(){
        String expected = "\n" +
                "Id: " + test_Job.getId() + '\n' +
                "Name: " + "Product tester" +'\n' +
                "Employer: " + "ACME" +'\n' +
                "Location: " + "Desert" +'\n' +
                "PositionType: " + "Quality control" +'\n' +
                "CoreCompetency: " + "Persistance" +'\n' +
                '\n';
        assertEquals(expected, test_Job.toString());
    }

    @Test
    public void testToStringWithEmptyValue(){
        Job test_Job2 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = "\n" +
                "Id: " + test_Job2.getId() + '\n' +
                "Name: " + "Product tester" +'\n' +
                "Employer: " + "Data not available" +'\n' +
                "Location: " + "Desert" +'\n' +
                "PositionType: " + "Quality control" +'\n' +
                "CoreCompetency: " + "Persistence" +'\n' +
                '\n';
        assertEquals(expected, test_Job2.toString());
    }

}
