// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Calculator{
    int result;

    public void calculator(int number){
        result = number;
    }

    public int add(int num1, int num2){
        result = num1 + num2;
        return result;
    }
    public double subtract(int num1, int num2){
        result = num1 - num2;
        return result;
    }

    public int multiply(int num1, int num2){
        result = num1 * num2;
        return result;
    }

    public int divide(int num1, int num2){
        result = num1 / num2;
        return result;
    }

    public int modulus(int num1, int num2){
        result = num1 % num2;
        return result;
    }
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        myCalculator.add(5, 7);
        System.out.println(myCalculator.result);
        myCalculator.subtract(45, 11);
        System.out.println(myCalculator.result);

        myCalculator.multiply(12,34);
        System.out.println(myCalculator.result);

    }
}