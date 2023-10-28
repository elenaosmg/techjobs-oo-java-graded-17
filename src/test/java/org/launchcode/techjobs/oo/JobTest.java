package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    // 2 job objects  with empty constructor, test if 2 different objects get 2 different IDs
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        assertNotEquals(job1.getId(), job2.getId());
    }


@Test // testing 'Job' constructor to see if all fields set correctly.
    public void testJobConstructorSetsAllFields () {
        Job jobNew = new Job(); // instantiating a job object
        jobNew.setName("Product tester"); //set values
        jobNew.setEmployer(new Employer("ACME"));
        jobNew.setLocation(new Location("Desert"));
        jobNew.setPositionType(new PositionType("Quality control"));
        jobNew.setCoreCompetency(new CoreCompetency("Persistence"));


        //checking the class of an object
    assertTrue(jobNew instanceof Job);
    assertTrue(jobNew.getEmployer() instanceof Employer);
    assertTrue(jobNew.getLocation() instanceof Location);
    assertTrue(jobNew.getPositionType() instanceof PositionType);
    assertTrue(jobNew.getCoreCompetency() instanceof CoreCompetency);


        // Checking the value
   String msgName = "constructor assigns correct value to the field Name";
    assertEquals(msgName,"Product tester",jobNew.getName());

    String msgEmployer = "constructor assigns correct value to the field Employer";
    assertEquals(msgEmployer, "ACME",jobNew.getEmployer().getValue());

    String msgLocation = "constructor assigns correct value to the field Location";
    assertEquals(msgLocation,"Desert",jobNew.getLocation().getValue());

    String msgPositionType = "constructor assigns correct value to the field PositionType";
    assertEquals(msgPositionType,"Quality control",jobNew.getPositionType().getValue());

    String msgCoreCompetency = "constructor assigns correct value to the field CoreCompetency";
    assertEquals(msgCoreCompetency,"Persistence",jobNew.getCoreCompetency().getValue());

    }




@Test // test that overridden equals method works correctly
public void testJobsForEquality () { // Define a test with name testJobsForEquality

//Generate 2 Job objects with identical fields values and different IDs
    Job jobForEquality1 = new Job("Product tester",
            new Employer ("ACME"), new Location ("Desert"),
            new PositionType ("Quality control"), new CoreCompetency("Persistence"));
    jobForEquality1.getId ();

    Job jobForEquality2 = new Job("Product tester",
            new Employer ("ACME"), new Location ("Desert"),
            new PositionType ("Quality control"), new CoreCompetency("Persistence"));
    jobForEquality2.getId ();


    // Test equals method => assertFalse returns false if 2 objects have different ids, but other info is identical
    assertFalse(jobForEquality1.equals(jobForEquality2));

}
}