package Package1;
// fibonacci upto 12
public class Fibonacci {

    public static void main(String[] args) {
        int n = 12; // Number of terms to print
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

