package OOP_Part1.Classes;

import java.util.Locale;

public class Car {

// This is the state of the car which we are defining as the five fields of these class
        //Private means is dont allow a class outside of the class to access these variable
        private int doors;
        private int wheels;
        private String model;
        private String engine;
        private String color;

        //setter name set by java
        // here we are allowing the method to update the model.
        public void setModel(String model){
                // update field variable with the contents or the parameter model that was pass to us.
                String validModel = model.toLowerCase();
                if (validModel.equals("carrera") || validModel.equals("commodore")){
                        this.model = model;
                }else {
                        this.model = "Unknown";
                }
        }

        //getter name set by java
        //we wanna return the type and we wanna return the type getModel this time.
        public String getModel(){
                return this.model;
        }
}

