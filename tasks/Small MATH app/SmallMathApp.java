public class SmallMathApp{

    double numberOne= 100; double numberTwo = 10;

    public double getOperation(String operator){
        double resultOfTheOperation = 0; 
        switch(operator){
            case "+": return add(numberOne,numberTwo);
      
            case "-": return subtract(numberOne,numberTwo);
        
            case "/": return division(numberOne, numberTwo);

            case "*": return multiply(numberOne, numberTwo);

            default: resultOfTheOperation = 0;
        }
        return resultOfTheOperation;
    }

    public double multiply(double numberOne, double numberTwo){

        return numberOne * numberTwo;
    }

    public double subtract(double numberOne, double numberTwo){

        return numberOne - numberTwo;
    }

    public double add(double numberOne, double numberTwo){

        return numberOne + numberTwo;
    }

    public double division(double numerator, double denominator){
        if (denominator == 0) 
            throw new IllegalArgumentException("It cannot Go!!, zero can no divid as a denominator");
                    return numberOne / numberTwo;
    }
}
