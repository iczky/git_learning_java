import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
//     Find the area of rectangle
        System.out.println("#1 exercise");
        System.out.println("Enter length: ");
        int length = scanner.nextInt();
        System.out.println("Enter width: ");
        int width = scanner.nextInt();

        int area = calculateAreaOfRectangle(length, width);
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("\n");

//Find diameter, circumference, and area of circle
        System.out.println("#2 Challenge");
        System.out.println("Enter the radius: ");
        int radius = scanner.nextInt();
        double[] result = calculateOfCircle(radius);

        System.out.println("The result for the calculation with " + radius + " radius");
        System.out.println("Diameter: " + result[0]);
        System.out.println("Circumference: " + result[1]);
        System.out.println("area: " + result[2]);
        System.out.println("\n");

//    find angle of triangle
        System.out.println("#3 Challenge");
        System.out.println("Enter Angle 1: ");
        int angle1 = scanner.nextInt();
        System.out.println("Enter Angle 2: ");
        int angle2 = scanner.nextInt();

        int angle3 = calculateAngleOfTriangle(angle1,angle2);
        System.out.println("The result of the last angles from two given angles: " + angle3 + "\n");


//    Difference day from 2 dates
        System.out.println("#4 Challenge");
        System.out.println("Enter Start Date: ");
        String d1 = scanner.next();
        System.out.println("Enter End Date: ");
        String d2 = scanner.next();

        long difference_days = differenceInTime(d1,d2);
        System.out.println("Difference of day from " + d1 + " and " + d2);
        System.out.println(difference_days + " Days" + "\n");

//      Get Initial Name

        System.out.println("#5 Challenge");
        System.out.print("Enter your fullname: ");
        scanner.nextLine();
        String firstName = scanner.nextLine();

        String initial = getInitialName(firstName);
        System.out.println(initial);
        scanner.close();
    }


    public static int calculateAreaOfRectangle(int length, int width){
        return length * width;
    }

    public static double[] calculateOfCircle(int rad){
        double diameter = 2 * rad;
        double circumference = 2 * Math.PI * rad;
        double area = Math.PI * rad * rad;
        return new double[]{diameter, circumference, area};
    }

    public static int calculateAngleOfTriangle(int a, int b){
        return 180 - (a + b);
    }

    public static long differenceInTime (String start_date, String end_date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(
                "yyyy-MM-dd"
        );

        Date d1 = sdf.parse(start_date);
        Date d2 = sdf.parse(end_date);

//      calculate to Milliseconds
        long difference_In_Time = d2.getTime() - d1.getTime();

        return TimeUnit.MILLISECONDS.toDays(difference_In_Time);
    }

    public static String getInitialName(String fullName) {
        String initials = "";
        String[] words = fullName.split("\\s+");

        for (String word:words){
            if(!word.isEmpty()){
                initials += word.charAt(0);
            }
        }
        return initials.toUpperCase();
    }

}