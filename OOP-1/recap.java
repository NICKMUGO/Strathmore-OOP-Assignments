import java.util.Scanner;

public class recap {
    public static int total_sum_alt1(int n) {
        int total = 0;

        for (int i = 1; i <= n; i++) {
            total = total + i;
        }
        return total;
    }

    public static int total_sum_alt2(int n) {
        int total = (n * (n + 1) / 2);
        return total;
    }
        
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value for n ");
        int n = sc.nextInt();
        
        System.out.println("Total = " + total_sum_alt1(n));
        System.out.println(" ");
        System.out.println("Total = " + total_sum_alt2(n));
}
}
