package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest { //EO:class declaration
    //TODO: Create your unit tests here

    @Test
    // EO: 2 job objects  with empty constructor, test if 2 different objects get 2 different IDs
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }


    @Test // EO: testing 'Job' constructor to see if all fields set correctly.
    public void testJobConstructorSetsAllFields() {
        Job jobNew = new Job(); // instantiating a job object
        jobNew.setName("Product tester"); //set values
        jobNew.setEmployer(new Employer("ACME"));
        jobNew.setLocation(new Location("Desert"));
        jobNew.setPositionType(new PositionType("Quality control"));
        jobNew.setCoreCompetency(new CoreCompetency("Persistence"));


        //EO: checking the class of an object
        assertTrue(jobNew instanceof Job);
        assertTrue(jobNew.getEmployer() instanceof Employer);
        assertTrue(jobNew.getLocation() instanceof Location);
        assertTrue(jobNew.getPositionType() instanceof PositionType);
        assertTrue(jobNew.getCoreCompetency() instanceof CoreCompetency);


        // EO: Checking the value
        String msgName = "constructor assigns correct value to the field Name";
        assertEquals(msgName, "Product tester", jobNew.getName());

        String msgEmployer = "constructor assigns correct value to the field Employer";
        assertEquals(msgEmployer, "ACME", jobNew.getEmployer().getValue());

        String msgLocation = "constructor assigns correct value to the field Location";
        assertEquals(msgLocation, "Desert", jobNew.getLocation().getValue());

        String msgPositionType = "constructor assigns correct value to the field PositionType";
        assertEquals(msgPositionType, "Quality control", jobNew.getPositionType().getValue());

        String msgCoreCompetency = "constructor assigns correct value to the field CoreCompetency";
        assertEquals(msgCoreCompetency, "Persistence", jobNew.getCoreCompetency().getValue());

    }


    @Test // EO: test that overridden equals method works correctly
    public void testJobsForEquality() { // EO: Define a test with name testJobsForEquality

//EO: Generate 2 Job objects with identical fields values and different IDs
        Job jobForEquality1 = new Job("Product tester",
                new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobForEquality1.getId();

        Job jobForEquality2 = new Job("Product tester",
                new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobForEquality2.getId();


        // EO: Test equals method => assertFalse returns false if 2 objects have different ids, but other info is identical
        assertFalse(jobForEquality1.equals(jobForEquality2));

    }

        @Test
        public void testToStringStartsAndEndsWithNewLine() {
            Job job = new Job();
            String jobString = job.toString(); // EO: Get the string representation of the job
            String newLine = System.lineSeparator(); // Define the expected new line separator. System.lineSeparator() moves cursor to the next line

            // Assert conditions using JUnit's assertions
            assertEquals("String should start with a new line", newLine, jobString.substring(0, newLine.length()));
            // EO: assertEquals is method from JUnit's assertion class Assert, used to compare two values for equality. In brackets message (is optional), expected value, the actual value
            // EO: jobString.substring(0, newLine.length() - part of jobString (substring),  extracted portion of jobString that is equal to the length of newLine.
            assertEquals("String should end with a new line", newLine, jobString.substring(jobString.length() - newLine.length()));
            // EO:  takes a substring of jobString starting from the index calculated by subtracting newLine.length() from jobString.length()
        };


            @Test
    public void testToStringContainsCorrectLabelsAndData() { //EO: method declaration

        Job job = new Job( "Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"),
                new CoreCompetency("Persistence"));  // EO:create instance of 'Job' class with parameters

        String expectedResult = System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: " + job.getName() + System.lineSeparator() +
                "Employer: " + job.getEmployer().getValue() + System.lineSeparator() +
                "Location: " + job.getLocation().getValue() + System.lineSeparator() +
                "Position Type: " + job.getPositionType().getValue() + System.lineSeparator() +
                "Core Competency: " + job.getCoreCompetency().getValue() + System.lineSeparator()  ;

        String actualResult = job.toString();  //EO: get actualResult

        assertEquals(expectedResult, actualResult);      // EO: compare 2 results.test will fail if results are not equal
        }

    @Test
    public void testToStringHandlesEmptyField() {
         Employer emptyEmployer = new Employer("");
         Location emptyLocation = new Location("");
         PositionType emptyPositionType = new PositionType("");
         CoreCompetency enptyCoreCompetency = new CoreCompetency("");


        Job job = new Job("", emptyEmployer,emptyLocation,emptyPositionType,enptyCoreCompetency); // EO: Create an instance of Job Class with empty fields


        //EO: Get the expected string representation
        String expected = System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: Data not available" + System.lineSeparator() +
                "Employer: Data not available" + job.getEmployer() + System.lineSeparator() +
                "Location: Data not available" + job.getLocation() + System.lineSeparator() +
                "Position Type: Data not available" + job.getPositionType() + System.lineSeparator() +
                "Core Competency: Data not available" + job.getCoreCompetency() + System.lineSeparator();

        //EO: Verify that the actual string representation matches the expected one
        assertEquals(expected, job.toString());
    }




}