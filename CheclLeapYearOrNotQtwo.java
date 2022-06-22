package DayFiveJavaAssignment;

import java.util.Scanner;

public class CheclLeapYearOrNotQtwo {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        a=year % 400;
        b=year % 4;
        c=year % 100;
        if(a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.println("leap year");
                }
            }
        }
    }
}
