package DayFiveJavaAssignment;

public class FindLargestThreeNumberQten {
    public static void main(String[] args) {
        int lengthOfRope1 = 20;
        int lengthOfRope2 = 10;

        int lengthOfRope3 = 15;

        if (lengthOfRope1 == lengthOfRope2 && lengthOfRope2 == lengthOfRope3) {
            System.out.println("Both the rope are equal");
        } else if (lengthOfRope1 > lengthOfRope2 && lengthOfRope1 > lengthOfRope3) {
            System.out.println("lengthOfRope1 is larger");
        } else if (lengthOfRope2 > lengthOfRope1 && lengthOfRope2 > lengthOfRope3) {
            System.out.println("lengthOfRope2 is larger");
        } else {
            System.out.println("lengthOfRope3 is larger");
        }
    }
}
