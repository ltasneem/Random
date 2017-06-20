import java.util.*;


public class Randomness {
	 public static void main(String[] args)
	    {
	        output("Generate 10 random integers between 0 and 6");
	        Random rnd = new Random();
	        
	        for (int i = 1; i <= 10; ++i)
	        {
	          int randomInt = 1 + rnd.nextInt(6);
	          output("Generated number: " + randomInt);
	        }
	    
	        output("Done.");
	        
	        
	        /*Randomness Change Activity */
	        
	        output("Generate 10 random integers between 1 and 6");

	        //Random rnd = new Random();
	        
	        for (int i = 1; i <= 10; ++i)
	        {
	          int randomInt = 1 + rnd.nextInt(95);
	          System.out.println("Generated number: " + randomInt);
	        }
	    
	        System.out.println("Done.");
	        
	        //Randomness Completion Activity 
	        
	        int dienumber;
	        //Random rnd =
	        
	        dienumber = 1+rnd.nextInt(6);
	        
	        System.out.println("Your die roll was : " + dienumber);
	        
	        //Repeating yourself with a while loop 
	        
	        Scanner keyboard = new Scanner(System.in);
	        /*int secretNumber, guess = 0;//guess is initialized to 0
			
			secretNumber = 123;
			
			System.out.println("I'm thinking of a number between 1 and 1000");
			System.out.print("Enter the number:");
			guess = keyboard.nextInt();
			
			while ( guess != secretNumber )
			{
				if(guess == 5)
				{
					break;
				}
				System.out.println("\nYou are wrong. Try again.");
				System.out.println("Enter the number: ");
				guess = keyboard.nextInt();
			}
			
			System.out.println("You are correct. You win a prize!");
			keyboard.close();
            */
	        
	        //Monopoly Dice
	        int num1,num2;
	        int num=0;
	        
	        while(true)
	        {
		        System.out.println("Enter 2 dice number:");
		        num1 = keyboard.nextInt();
		        num2 = keyboard.nextInt();
		        if(num==2)
		        {
		        	System.out.println("DOUBLES!");
		        	System.out.println("GO TO JAIL");
		        	break;
		        }
		        if(num1 == num2)
		        {
		        	num++;
		        	System.out.println("DOUBLES!");
		        	System.out.println("Move "+ (num1+num2)+" Spaces and roll again getting");
		        	continue;
		        }
		        if(num1 != num2)
		        {
		        	System.out.println("Move "+ (num1+num2)+" Spaces and stop");
		        	break;
		        }
	        }

	    }
	  
	  private static void output(String aMessage)
	  {
	    System.out.println(aMessage);
	  }

}
