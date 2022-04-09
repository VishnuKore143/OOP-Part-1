package OOP_Part1.Classes;

public class SumCalculatorChallenge {

    //fields
    private double firstNumber;
    private double secondNumber;

    //getter
    public double getFirstNumber(){
        return this.firstNumber;
    }
    public double getSecondNumber(){
        return this.secondNumber;
    }

    //setter
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    //Addition
    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }

    //subtraction
    public double getSubtractionResult(){
        return secondNumber-firstNumber;
    }

    //Multiplication
    public  double getMultiplicationResult(){
        return (firstNumber * secondNumber);
    }

    //Division
    public double getDivisionResult(){
        if (secondNumber==0){
            return 0;
        }
        else {
            return firstNumber / secondNumber;
        }
    }

}
