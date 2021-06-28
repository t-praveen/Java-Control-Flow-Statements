//SWITCH CASE PROGRAM//

package Recursion;
import java.util.Scanner ;

public class Switch1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		char ch = sc.next().charAt(0);
		Test(ch);
		sc.close();
	}
	public static void Test(char ch)
	{
		switch(ch)
		{
		case 'a' : case 'A' :
			System.out.println("Found A or a .");
			break;
		case 'b' : case 'B' :
			System.out.println("Found B or b .");
			break;
		case 'c' : case 'C' :
			System.out.println("Found C or c .");
			break;
		case 'd' : case 'D' :
			System.out.println("Found D or d .");
			break;
		case 'e' : case 'E' :
			System.out.println("Found E or e .");
			break;
		default : System.out.println("Not found !! ");
		}
	}

}
