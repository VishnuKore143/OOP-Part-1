package OOP_Part1.Classes;

public class Main {
    public static void main(String[] args) {
        //This is how we define an object of type Car we call it porsche.
        //in other words we have created an object called porsche based on the template car.
        Car porsche = new Car();
        Car holden = new Car();
         porsche.setModel("911");
        System.out.println("Model is "+porsche.getModel());
    }
}
