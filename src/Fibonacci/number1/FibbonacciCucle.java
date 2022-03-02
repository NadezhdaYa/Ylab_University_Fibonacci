package Fibonacci.number1;
// Реализация поиска числа в цикле с пользовательским вводом
import java.util.Scanner;
public class FibbonacciCucle {
    public static void main(String[] args) {
        int maxNumber;
        int previousNumber = 0;
        int nextNumber = 1;
    System.out.println("Сколько чисел Фибоначчи вывести?");
        Scanner scanner = new Scanner(System.in);
        maxNumber = scanner.nextInt();
        System.out.print("Ряд Фибоначчи из "+maxNumber+" чисел:");

        for (int i = 1; i <= maxNumber; ++i)
        {
            System.out.print(previousNumber+" ");
         int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }

    }
}
