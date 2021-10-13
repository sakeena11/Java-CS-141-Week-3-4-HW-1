import java.util.Scanner;

public class Week3_4Homework1Question4 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the coordinates of the first point, x1 and y1:");
        double x1 = scnr.nextDouble();
        double y1 = scnr.nextDouble();

        System.out.println("Enter the coordinates of the second point, x2 and y2:");
        double x2 = scnr.nextDouble();
        double y2 = scnr.nextDouble();

        System.out.print("Distance between (" + x1 + "," + y1 + ") and (");
        System.out.print(x2 + "," + y2 + ") = ");

        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println(distance);
    }
}

