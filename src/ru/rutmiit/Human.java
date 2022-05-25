package ru.rutmiit;

public class Human {
    protected String firstName;
    protected String lastName;

    public Human(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    private void setFirstName(String firstName) {

        if(!Character.isUpperCase(firstName.toCharArray()[0])){
            throw new IllegalArgumentException("Expected upper case letter! Argument: " + firstName);
        }
        else if (firstName.length()<4) {
            throw new IllegalArgumentException("Expected length at least 4 symbols! Argument: " + firstName);
        }
        else {
            this.firstName = firstName;
        }
    }

    protected void setLastName(String lastName) {
        if(!Character.isUpperCase(lastName.toCharArray()[0])){
            throw new IllegalArgumentException("Expected upper case letter! Argument: " + lastName);
        }
        else if (firstName.length()<3){
            throw new IllegalArgumentException("Expected length at least 3 symbols! Argument: " + lastName);
        }
        else{
            this.lastName = lastName;
        }
    }

    @Override
    public String toString(){
        return firstName + " " + lastName;
    }
}
