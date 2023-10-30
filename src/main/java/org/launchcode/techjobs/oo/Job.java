package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId ++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this ();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) { //EO: We override equal method from the 'Object' class
        if (this == o) return true; //EO: check if the current object and the passed object are references to the same memory location
        if (o == null || getClass() != o.getClass()) return false; //EO: check if tis  null or if it belongs to a different class
        Job job = (Job) o; // EO: cast the passed object o to the Job class and compares the id
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    } //EO: Objects refers to the java.util.Objects class


//    @Override
//    public String toString () {
//             return System.lineSeparator()
//
//                + "ID: "+ id + System.lineSeparator()
//                + "Name: " + this.name + System.lineSeparator()
//                + "Employer: " + this.employer + System.lineSeparator()
//                + "Location: " + this.location + System.lineSeparator()
//                + "Position Type: " + this.positionType + System.lineSeparator()
//                + "Core Competency: " + this.coreCompetency + System.lineSeparator();
//                    };


//    @Override
//    public String toString() {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(System.lineSeparator());
//        stringBuilder.append("ID: ").append(id).append(System.lineSeparator());
//        stringBuilder.append("Name: ").append(name.isEmpty() ? "Data not available" : name).append(System.lineSeparator());
//        stringBuilder.append("Employer: ").append(employer.getValue().isEmpty() ? "Data not available" : employer.getValue()).append(System.lineSeparator());
//        stringBuilder.append("Location: ").append(location.getValue().isEmpty() ? "Data not available" : location.getValue()).append(System.lineSeparator());
//        stringBuilder.append("Position Type: ").append(positionType.getValue().isEmpty() ? "Data not available" : positionType.getValue()).append(System.lineSeparator());
//        stringBuilder.append("Core Competency: ").append(coreCompetency.getValue().isEmpty() ? "Data not available" : coreCompetency.getValue()).append(System.lineSeparator());
//
//        return stringBuilder.toString();
//    }



//    public String toString() {
//        String separator = System.lineSeparator();
//        String idString = "ID: " + id + separator;
//        String nameString = "Name: " + (name.isEmpty() ? "Data not available" : name) + separator;
//        String employerString = "Employer: " + (employer.getValue().isEmpty() ? "Data not available" : employer.getValue()) + separator;
//        String locationString = "Location: " + (location.getValue().isEmpty() ? "Data not available" : location.getValue()) + separator;
//        String positionTypeString = "Position Type: " + (positionType.getValue().isEmpty() ? "Data not available" : positionType.getValue()) + separator;
//        String coreCompetencyString = "Core Competency: " + (coreCompetency.getValue().isEmpty() ? "Data not available" : coreCompetency.getValue()) + separator;
//
//        return System.lineSeparator() + idString + nameString + employerString + locationString + positionTypeString + coreCompetencyString;
//    }

    @Override
    public String toString() {
        String separator = System.lineSeparator();
        String idString = "ID: " + id + separator;
        String nameString = "Name: " + (name == null ? "Data not available" : (name.isEmpty() ? "Data not available" : name)) + separator;
        String employerString = "Employer: " + (employer == null ? "Data not available" : (employer.getValue() == null ? "Data not available" : (employer.getValue().isEmpty() ? "Data not available" : employer.getValue()))) + separator;
        String locationString = "Location: " + (location == null ? "Data not available" : (location.getValue() == null ? "Data not available" : (location.getValue().isEmpty() ? "Data not available" : location.getValue()))) + separator;
        String positionTypeString = "Position Type: " + (positionType == null ? "Data not available" : (positionType.getValue() == null ? "Data not available" : (positionType.getValue().isEmpty() ? "Data not available" : positionType.getValue()))) + separator;
        String coreCompetencyString = "Core Competency: " + (coreCompetency == null ? "Data not available" : (coreCompetency.getValue() == null ? "Data not available" : (coreCompetency.getValue().isEmpty() ? "Data not available" : coreCompetency.getValue()))) + separator;

        return separator + idString + nameString + employerString + locationString + positionTypeString + coreCompetencyString;
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}


