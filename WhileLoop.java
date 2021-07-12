//While Loop//
package loops;

public class WhileLoop {

	public static void main(String[] args) {
			//While Loop//    
			int count = 6;
		    while(count != 6)
		    {
	            System.out.println("Count value is " + count);
	            count++;
	        }
		    //For loop//
        	for(int i=6; i!= 6; i++)
        	{
	            System.out.println("Count value is " + count);
        	}
        	//do-while loop//
	        count = 6;
	        do 
	        {
	        	System.out.println("Count value was " + count);
	        	count++;

	            if(count >100)
	            {
	                break;
	            }
	        }while(count != 6);
	}

}
