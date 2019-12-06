package timbuchalka.java.S06.excercises.classes;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName() {
        this.firstName = firstName;
    }

    public void setSecondName() {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100){
            setAge(0);

        } else {
            this.age = age;
        }
    }
    public boolean isTeen(){
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        }
        if (lastName.isEmpty()) {
            return this.firstName;
        }
        if (firstName.isEmpty()) {
            return this.lastName;
        }
        return this.firstName + " " + this.lastName;
    }
}
























