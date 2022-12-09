Rodruggo 7inches
package javaapplication44;
import java.util.Scanner;
public class JavaApplication44 {
    public static void main(String[] args) {
        
        char operator;
        Double number1, number2, result;
        
        Scanner sd = new Scanner(System.in);
        
        System.out.println("Choose an operator: +, -, * or /");
        operator = sd.next().charAt(0);
        
        System.out.println("Enter first number: ");
        number1 = sd.nextDouble();
        
        System.out.println("Enter second number: ");
        number2 = sd.nextDouble();
        while(operator<4){
            System.out.println(operator);
        }
        
        switch(operator){
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " +result);
                break;
                
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
                
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
                
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
                
                default:
                    System.out.println("Invalid Operator!");
        }
      sd.close();
        
    }
    }
