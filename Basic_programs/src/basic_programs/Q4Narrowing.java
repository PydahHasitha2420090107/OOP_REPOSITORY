package basic_programs;
import java.util.*;

public class Q4Narrowing {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d = scan.nextDouble();
        int i= (int) d;
        System.out.println("Original value: " + d);
        System.out.println("After casting int : " + i);
        scan.close();
    }
}
