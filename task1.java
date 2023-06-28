package Java.HW2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        try {
            myInput();
        }
        catch (InvalidNumberException ex){
            System.out.println("Ошибка: " + ex.getMessage());
        }
        finally {
            System.out.println("Завершение работы");
        }

    }

    public static void myInput() throws InvalidNumberException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        if(num <= 0){
            throw new InvalidNumberException("Некорректное число");
        }
        System.out.println("Число корректно");
    }
}

class  InvalidNumberException extends Exception{
    public InvalidNumberException(String message){
        super(message);
    }
}
