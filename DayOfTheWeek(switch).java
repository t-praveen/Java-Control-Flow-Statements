//PROGRAM TO PRINT DAY OF THE WEEK USING SWITCH CASE//

package Recursion;
import java.util.Scanner ;

public class DayOfTheWeek {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a digit : ");
		int day = sc.nextInt();
		printDayOfTheWeek(day);
		sc.close() ;		
	}
	public static void printDayOfTheWeek(int day)
	{
		switch(day)
		{
		case 0 : 
			System.out.println("Sunday");
			break ;
		case 1 : 
			System.out.println("Monday");
			break ;
		case 2 : 
			System.out.println("Tuesday");
			break ;
		case 3 : 
			System.out.println("Wednesday");
			break ;
		case 4 : 
			System.out.println("Thursday");
			break ;
		case 5 : 
			System.out.println("Friday");
			break ;
		case 6 : 
			System.out.println("Saturday");
			break ;
		default : 
			System.out.println("Invalid Day");
		}
	}

}


