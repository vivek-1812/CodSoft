
//NUMBER GAME  
package Codsoft_Taskno_1;
import java.util.*;

public class NumberGame {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        int target=45;
        System.out.println("\t\t\tWELCOME TO THE NUMBER GAME !!");
        System.out.println();
        System.out.println("IN THIS GAME YOU HAVE TO GUESS A SPECIFIED NUMBER IN THE GIVEN RANGE BETWEEN 1 TO 100\nAND FOR DOING THIS YOU WILL HAVE ONLY 5 ATTEMPTS\n-------------------------------------------------------------------------------------------------------------");
        while(n<5)
        {
        
        	System.out.println("PLEASE ENTER A NUMBER BETWEEN 0 TO 100");
        	System.out.println("ENTER YOUR GUESS:");
        	int guess = sc.nextInt();
        	   if(guess==target)
        	   {
        		 System.out.println("YEAH!! YOUR GUESS IS RIGHT");
        		 n++;
        		 break;
        	   }
        	   else if(guess>=40 && guess<=50)
        	   {
        		   System.out.println("YOUR GUESS IS TOO CLOSE\nRETRY!!\n---------------------------------------------------------------------------");
        		   
        	   }
        	   else if(guess>0 && guess<40)
               {		   
        	      System.out.println("YOUR GUESS IS LOW\nRETRY!!\n----------------------------------------------------------------------------------");
        	      
        	   }
        	   else if(guess>50 && guess<100)
        	   {
        		   System.out.println("YOUR GUESS IS HIGH\nRETRY!!\n---------------------------------------------------------------------------------");
        		   
        	   }
        	   else {
        		   System.out.println("YOU ENTERED A NUMBER BEYOND RANGE\nRE-ENTER\n-----------------------------------------------------------------");
        		  continue;   
        	   }
        	   
        	 n++;  
        	 
               	
        }
        //SCORE
        int score=n;
        switch(score)
        {
        case 1:
        	System.out.println("YOUR SCORE IS 5/5");
        	break;
        	
        case 2:
        	System.out.println("YOUR SCORE IS 4/5");
        	break;
        	
        case 3:
        	System.out.println("YOUR SCORE IS 3/5");
        	break;
        case 4:
        	System.out.println("YOUR SCORE IS 2/5");
        	break;
        case 5:
        	System.out.println("YOUR SCORE IS 1/5");
        	break;
        default:
        	System.out.println("YOUR SCORE IS 0/5");	
        	
        }
        System.out.println("------------------THANKS FOR PLAYING-----------------------");
        
        
	}

}
