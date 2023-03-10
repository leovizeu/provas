package provas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class provaFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        List<Integer> fib = fibonacci(num);

        if (fib.contains(num)) {
            System.out.printf("%d pertence à sequência de Fibonacci: %s", num, fib.toString());
        } else {
            System.out.printf("%d não pertence à sequência de Fibonacci: %s", num, fib.toString());
        }
    }

    public static List<Integer> fibonacci(int n) {
        List<Integer> fib = new ArrayList<>();
        if (n >= 0) {
            fib.add(0);
        }
        if (n >= 1) {
            fib.add(1);
        }
        int i = 2;
        while (fib.get(i-1) < n) {
            fib.add(fib.get(i-1) + fib.get(i-2));
            i++;
        }
        return fib;
    }
}