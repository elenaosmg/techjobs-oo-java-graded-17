package org.launchcode.techjobs.oo;
import java.util.Objects;

    public abstract class JobField {

        //EO: Declare VARIABLES (common to all subclasses fields) id and value.

        private int id;
        private static int nextId = 1;
        private String value;


        // EO: create 2 CONSTRUCTORS:

        // 1-initializes a JobField object
        // 2-JobField(String value) sets the value for the JobField object
        public JobField () {  //EO: this constructor is used when no
            // initial value is provided
            id = nextId;
            nextId++;
        }
        public JobField (String value) {// EO: calls the default constructor
            // to set the ID
            this();
            this.value = value;
        }

        // EO: CUSTOM METHODS:

        @Override
        public String toString() {
            return value;
        }//EO: returns the value

        @Override
        public boolean equals(Object o) { //EO: compares 2 JobFields objects by id value
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            JobField base = (JobField) o;
            return id == base.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        } //EO: generates hashcode basedon id



        // PROVIDE GETTERS AND SETTERS:

        public int getId() {
            return id;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }


