package basic_programs;
import java.util.*;
public class Q10Divisible_logic_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		if ((a% 3 == 0) && (a% 5 == 0)) {
            System.out.println(a+ " is divisible by both 3 and 5");
        } else {
            System.out.println(a+ " is not divisible by both 3 and 5");
        }

        scan.close();
	}

}
