package basic_programs;
import java.util.*;

public class Q2Formatted_output {

    public static void main(String[] args) {
        // name, roll number, age, gender, and percentage
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        long roll_no = scan.nextLong();
        int age = scan.nextInt();
        char gender = scan.next().charAt(0);
        double p = scan.nextDouble();
        System.out.printf("Name       : %s\n", name);
        System.out.printf("Roll No.   : %d\n", roll_no);
        System.out.printf("Age        : %d\n", age);
        System.out.printf("Gender     : %c\n", gender);
        System.out.printf("Percentage : %.2f%%\n", p);
        scan.close();
    }
}

