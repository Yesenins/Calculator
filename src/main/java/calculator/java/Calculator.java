package calculator.java;

public class Calculator{

    public Calculator() {
    }

    public Double sum(Double a, Double b){
        System.out.println("method returns the sum of two numbers of type Double");
        return a + b;
    }

    public Integer sum(Integer a, Integer b){
        System.out.println("method returns the sum of two numbers of type Integer");
        return a + b;
    }

    public Double subtract(Double a, Double b){
        System.out.println("method returns the difference of two numbers of type Double");
        return a - b;
    }

    public Integer subtract(Integer a, Integer b){
        System.out.println("method returns the difference of two numbers of type Integer");
        return a - b;
    }

    public Double multiply(Double a, Double b){
        System.out.println("method returns the result of multiplication of two numbers of type Double");
        return a * b;
    }

    public Integer multiply(Integer a, Integer b){
        System.out.println("method returns the result of multiplication of two numbers of type Integer");
        return a * b;
    }

    public Double divide(Double a, Double b){
        System.out.println("method returns the result of division of two numbers of type Double");
        return a / b;
    }
}
