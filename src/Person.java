import java.time.Year;

public class Person {
    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int yearBorn;
/**
Stores a given person object
@param ID   the persons ID
@param firstName    the persons first name
@param lastName     the persons last name
@param title        given title for the person
@param yearBorn     the year that the person was born
 **/


    public Person(String ID, String firstName, String lastName, String title, int yearBorn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearBorn = yearBorn;
        this.title = title;
        this.ID = ID;
    }

    /**
     *
     * @return full name which is first name + last name
     */
    public String fullName(){
        return firstName + " " + lastName;
    }

    /**
     *
     * @return returns title + full name as described above
     */

    public String formalName(){
        return title + " " + fullName();
    }

    /**
     *
     * @return returns the age using the getAge(int) method
     */

    public String getAge(){
        return String.valueOf(getAge(yearBorn));
    }

    /**
     *
     * @param yearBorn - given year born
     * @return subtracts current year from year born giving age
     */

    public int getAge(int yearBorn){
        return Year.now().getValue() - yearBorn;
    }

    /**
     *
     * @return returns CSV format
     */

    public String toCSV(){
        return ID + "," + firstName + "," + lastName + "," + title + "," + yearBorn;
    }

    public String toJson(){
        return toCSV();
    }

    public String toXML(){
        return toCSV();
    }

    public void setYOB(int yearBorn){
        this.yearBorn = yearBorn;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
