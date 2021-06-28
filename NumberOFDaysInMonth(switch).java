//PROGRAM TO PRINT NUMBER OF DAYS IN MONTH//

package Recursion;
import java.util.Scanner ;

public class NumberOFDaysInMonth {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year : ");
		int year = sc.nextInt();
		boolean result = isLeapYear(year);
		System.out.println(result);
		System.out.print("Enter month : ");
		int month = sc.nextInt();
		System.out.print("Enter year : ");
		int year1 = sc.nextInt();
		int result1 = getDaysInMonth(month , year1);
		System.out.println(result1);
		sc.close();
	}
	public static boolean isLeapYear(int year)
	{
		if( ( year < 1 ) || (year > 9999))
		{
			return false ;
		}
		if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
		{
			return true ;
		}
		else if(year % 4 == 0 && year % 100 != 0)
		{
			return true ;
		}
		return false ;
	}
	public static int getDaysInMonth(int month , int year1)
	{
		if ( month < 1 || month > 12 || year1 < 1 || year1 > 9999)
			return -1 ;
		else if(isLeapYear(year1))
		{
			if(month == 2)
			{
				return 29 ;
			}
			else
			{
				switch(month)
				{
					case 1 :
						return 31 ;
					case 3 : 
						return 31 ;
					case 4 : 
						return 30 ;
					case 5 : 
						return 31 ;
					case 6 : 
						return 30 ;
					case 7 : 
						return 31 ;
					case 8 : 
						return 31 ;
					case 9 : 
						return 30 ;
					case 10 : 
						return 31 ;
					case 11 : 
						return 30 ;
					case 12 : 
						return 31 ;
				}
			}
		}
		else if(!isLeapYear(year1))
		{
				switch(month)
				{
					case 1 :
						return 31 ;
					case 2 : 
						return 28 ;
					case 3 : 
						return 31 ;
					case 4 : 
						return 30 ;
					case 5 : 
						return 31 ;
					case 6 : 
						return 30 ;
					case 7 : 
						return 31 ;
					case 8 : 
						return 31 ;
					case 9 : 
						return 30 ;
					case 10 : 
						return 31 ;
					case 11 : 
						return 30 ;
					case 12 : 
						return 31 ;
				}
		}
			return -1 ;
	}

}
