package OOP_Part1.Classes;

public class PersonChallenge {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age<0 ||age>100){
            setAge(0);
        }
        else{
            this.age = age;
        }
    }

    public boolean isTeen(){
        return age > 12 && age < 20;
    }

    public String getFullName(){

        if (firstName.isEmpty()){
            return lastName;
        }
        else if (lastName.isEmpty()){
            return firstName;
        }
        else if (firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }
        return firstName+" "+lastName;
    }



}