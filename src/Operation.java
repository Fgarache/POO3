import javax.swing.*;

public class Operation {
    int sum, multiplication;

    public void SUMA (int number1,int number2){
        sum = number1 + number2;

    }

    public void MULTI (int number1, int number2){
        multiplication = number1 * number2;
    }
    public void printResult (){
        System.out.println("Sum: "+sum);
        System.out.println("Mult: "+multiplication);
    }
}
