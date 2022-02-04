package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
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
    Job job;
    @Before
    public  void jobObject() {
         job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistance"));}

    @Test
    public void testSettingJobId(){
        Job test_Job2 = new Job();
        Job test_Job3 = new Job();
        assertTrue(test_Job3.getId()!= test_Job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_Job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(test_Job2.getName(), "Product tester");
        assertEquals(test_Job2.getEmployer().getValue(), "ACME");
        assertEquals(test_Job2.getLocation().getValue(), "Desert");
        assertEquals(test_Job2.getPositionType().getValue(), "Quality control");
        assertEquals(test_Job2.getCoreCompetency().getValue(), "Persistence");
        assertTrue(test_Job2 instanceof Job);
        assertTrue(test_Job2.getName().equals("Product tester"));
        assertTrue(test_Job2.getEmployer().getValue().equals("ACME"));
        assertTrue(test_Job2.getLocation().getValue().equals("Desert"));
        assertTrue(test_Job2.getPositionType().getValue().equals("Quality control"));
        assertTrue(test_Job2.getCoreCompetency().getValue().equals("Persistence"));
    }

    @Test
    public void testJobsForEquality(){
        Job test_Job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistance"));
        assertFalse(test_Job2.equals(job));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job test_Job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistance"));
        String expected = "\n" +
                "ID: " + test_Job2.getId() + '\n' +
                "Name: " + test_Job2.getName() +'\n' +
                "Employer: " + test_Job2.getEmployer() +'\n' +
                "Location: " + test_Job2.getLocation() +'\n' +
                "Position Type: " + test_Job2.getPositionType() +'\n' +
                "Core Competency: " + test_Job2.getCoreCompetency() +'\n';
        String actual = test_Job2.toString();
        assertEquals(expected,actual);


    }

    @Test
    public void testToStringHandlesEmptyField(){
        Job test_Job2 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        String expected = '\n' +
                "ID: " + test_Job2.getId() + '\n' +
                "Name: " + "Product tester" +'\n' +
                "Employer: " + "Data not available" +'\n' +
                "Location: " + "Desert" +'\n' +
                "Position Type: " + "Data not available" +'\n' +
                "Core Competency: " + "Persistence" +'\n';


        assertEquals(expected, test_Job2.toString());
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job test_Job2 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        String expected = '\n' +
                "ID: " + test_Job2.getId() + '\n' +
                "Name: " + "Product tester" +'\n' +
                "Employer: " + "Data not available" +'\n' +
                "Location: " + "Desert" +'\n' +
                "Position Type: " + "Data not available" +'\n' +
                "Core Competency: " + "Persistence" +'\n' +
                '\n';
//        Boolean beginning_Test = expected.startsWith("\n");
//        Boolean ending_Test = expected.endsWith("\n");
        assertEquals(true, test_Job2.toString().startsWith("\n"));
        assertEquals(true,test_Job2.toString().endsWith("\n"));
//        assertEquals(test_Job2.toString().startsWith("\n"), beginning_Test);
//        assertEquals(test_Job2.toString().endsWith("\n"), ending_Test);
        assertEquals('\n', '\n');
        assertEquals('\n', '\n');

    }

}
