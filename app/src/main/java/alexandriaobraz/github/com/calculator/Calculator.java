package alexandriaobraz.github.com.calculator;


public class Calculator implements ICalculator {
    @Override
    public double sum(double a, double b){
        return a+b;
    }

    @Override
    public double multiply(double a, double b) {
        return a*b;
    }

    @Override
    public double difference(double a, double b) {
        return a-b;
    }

    @Override
    public double division(double a, double b) {
        if(b!=0){ return a/b;}
        else {
            System.out.print("It's a mistake");
            return 0;
        }

    }
}
