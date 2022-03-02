package Fibonacci.number1;
//  Рекурсивная реализация поиска числа Фибоначчи
public class FibonacciRecur {
    public static int fib(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2) {
            return 1;
        }
        return fib(n-2) + fib(n-1);
    }
    public static void main(String[] args) {
        int maxNumber = 10;
        System.out.print("Ряд Фибоначчи из " + maxNumber + " чисел: ");
        for(int i = 0; i < maxNumber; i++) {
            System.out.print(fib(i) +" ");
        }
    }
}
