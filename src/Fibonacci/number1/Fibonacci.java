package Fibonacci.number1;
// Возвращает n-е большое число Фибоначчи по запросу пользователя
import java.util.Scanner;
import java.math.BigInteger;

public class Fibonacci {
 static BigInteger fib(int n) {
 BigInteger a = BigInteger.valueOf(0);
 BigInteger b = BigInteger.valueOf(1);
 BigInteger c;
 for (int j=2 ; j<=n ; j++) {
     c =  a.add(b);
     a = b;
     b = c;
    }
 return (a);
 }

 public static void main(String[] args) {
 System.out.println("Введите номер числа Фибоначчи, например 1000:");
     Scanner st = new Scanner(System.in);
  int n = st.nextInt();
  System.out.println("Число Фибоначчи " + n + "-го номера = " + fib(n));
    }
 }
