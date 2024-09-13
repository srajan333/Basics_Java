import java.util.*;
public class practiceIII {
    public static void main(String args[]) {
        //Bill of products:
      Scanner sc = new Scanner(System.in);
      System.out.print("Pencil Price:");
      float a = sc.nextFloat();
      System.out.print("Pen Price:");
      float b = sc.nextFloat();
      System.out.print("Eraser Price:");
      float c = sc.nextFloat();
      System.out.print("Your total Bill is:");
      float bill = (a+b+c);
      System.out.print(bill);
    }
}
