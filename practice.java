import java.util.Scanner;

/**
 * practice
 */
public class practice {
     public static void main(String[] args) {
        //average of 3 numbers:
        Scanner sc = new Scanner(System.in);
        System.out.print("First number:");
        float a = sc.nextFloat();
        System.out.print("Second number:");
        float b = sc.nextFloat();
        System.out.print("Third number:");
        float c = sc.nextFloat();
        System.out.println("Average of these numbers is:");
        float avg = (a+b+c)/3;
        System.out.println(avg);
     }
    
}