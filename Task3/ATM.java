package Task3;

import java.util.*;
public class ATM {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		
      System.out.println("\t\t\tWELCOME TO CODSOFT BANK ATM");
      System.out.println("PLEASE ENTER YOUR NAME:");
      String name=sc.nextLine();
      System.out.println("--------------------------------------------------");

      int exit=0;
	while(exit!=1) 
	{
      System.out.println("HELLO "+name.toUpperCase()+" !!\nPLEASE ENTER YOUR OPERATION:\n1. CHECK BALANCE\n2. WITHDRAW MONEY\n3. DEPOSIT MONEY\n999. EXIT");
      int operation = sc.nextInt();
      
         switch(operation)
         {
           case 1:
    	       double bal= acc.chechBalance();
    	       System.out.println("YOUR ACCOUNT BALANCE IS "+bal+" Rupees\n--------------------------------------");
    	       break;
    	       
           case 2:
        	   System.out.println("ENTER AMOUNT TO BE WITHDRAWN:");
        	   double wamount=sc.nextDouble(); 
        	   acc.withdraw(wamount);
        	   break;
        	   
           case 3:
        	   System.out.println("ENTER AMOUNT TO BE DEPOSITED:");
        	   double damount=sc.nextDouble();
        	   acc.deposit(damount);
        	   break;
           
           case 999:
        	   System.out.println("---------THANKS FOR USING------------");
        	   exit=1;
        	   break;
        	   
        	   
           default:
        	   System.out.println("NO SUCH OPERATION FOUND\nPLEASE RETRY!!");
        	
         }
	}
      
		
		
	}

}
