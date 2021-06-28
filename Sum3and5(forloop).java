//PROGRAM THE PRINT THE SUM OF THE NUMBERS DIVISIBLE BY 3 AND 5 WITHIN A GIVEN RANGE//

package Recursion;

public class Sum3and5 {

	public static void main(String[] args) {
		
		int count = 0 ; 
		int sum = 0 ;
		Sum(count , sum);
	}
	public static void Sum(int count , int sum)
	{
		for(int i = 1 ; i <= 1000 ; i++)
		{
			if(i % 3 == 0 && i % 5 == 0)
			{
				count++ ;
				sum += i ;
				System.out.println("Found number : "+i);
			}
			if(count == 5)
				break ;
		}
		System.out.println("Sum is : "+sum);

	}

}
