//PROGRAM TO PRINT FIRST THOUSAND PRIMES//

package Recursion;

public class FirstThousandPrimes {

	public static void main(String[] args) {
		int i = 0 ;
		prime(i);
	}
	public static void prime(int i)
	{
		for(i = 0 ; i <= 1000 ; i++)
			System.out.println(i);
	}

}

