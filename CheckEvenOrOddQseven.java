package DayFiveJavaAssignment;

import java.util.Scanner;

public class CheckEvenOrOddQseven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int i = sc.nextInt();
        if (i % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
