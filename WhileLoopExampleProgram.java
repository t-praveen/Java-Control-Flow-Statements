//While Loop Example//

package loops;
import java.util.Scanner;

public class WhileLoopExampleProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		System.out.print("Is entered number a even one ?? : "+Function(n));
		sc.close();
	}
	public static boolean Function(int n)
	{
		while(n % 2 == 0)
		{
				return true ;
		}
		return false ;
	}
}
