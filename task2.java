package Java.HW2;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args){
        try {
            divide();
        }
        catch (DivisionByZeroException ex){
            System.out.println("Ошибка: " + ex.getMessage());
        }
        finally {
            System.out.println("Завершение работы");
        }

    }

    public static void divide() throws DivisionByZeroException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextInt();
        if(num2 == 0){
            throw new DivisionByZeroException ("Деление на ноль недопустимо");
        }
        double div = num1 / num2;
        System.out.println("Результат деления " + num1 + " на " + num2 + " равен " + div);
    }
}

class  DivisionByZeroException  extends Exception{
    public DivisionByZeroException (String message){
        super(message);
    }
}
