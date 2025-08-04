package basic_programs;
import java.util.*;
public class Q5ASCII_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        int a= (int) ch;
        System.out.println("Character entered: " + ch);
        System.out.println("ASCII value: " + a);
        scan.close();
	}

}
