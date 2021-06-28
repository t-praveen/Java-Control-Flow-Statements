//PROGRAM TO PRINT SUM OF ODD NUMBERS WITHIN A GIVEN RANGE//

package Recursion;
import java.util.Scanner ;

public class SumOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
		boolean result = isOdd(number);
		System.out.println(result);
		System.out.print("Enter start range : ");
		int start = sc.nextInt();
		System.out.print("Enter end range : ");
		int end = sc.nextInt();
		System.out.println("The sum of the numbers is : "+sumOdd(start , end));
		sc.close();
	}
	public static boolean isOdd(int number)
	{
		if(number < 0)
			return false ;
		if(number % 2 != 0)
			return true ;
		return false ;
		
	}
	public static int sumOdd(int start , int end)
	{
		if(start < 0 || start > end || (end < start && end< 0))
			return -1 ;
		int sum = 0 ;
		for(int i = start ; i <= end ; i++)
		{
			if(isOdd(i))
			{
				sum += i ;
			}
		} 
		return sum ;
		
	}

}
