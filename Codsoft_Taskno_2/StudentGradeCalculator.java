package Codsoft_Taskno_2;
import java.util.*;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("ENTER YOUR MARKS OUT OF 100 IN ALL 5 SUBJECTS:");
		System.out.println("PHYSICS:");
		int phy  = sc.nextInt();
		System.out.println("CHEMISTRY:");
		int chem  = sc.nextInt();
		System.out.println("MATHEMATICS:");
		int mat  = sc.nextInt();
		System.out.println("ENGLISH:");
		int eng  = sc.nextInt();
		System.out.println("INFORMATION PRACTICES:");
		int ip  = sc.nextInt();
		System.out.println("-----------------------------------------------");
		
		double sum = phy+chem+mat+eng+ip;
		double per = (sum)/500*100;
				
		System.out.println("YOUR DETAILS ARE:");
		System.out.println("TOTAL MARKS : "+(phy+chem+mat+eng+ip));
		System.out.println("AVERAGE PERCENTAGE:"+per+"%");
		
		//GRADE:
		char grade;
		if(per>=90)
          grade='A';
	    else if(per>=80)
          grade='B';
		else if(per>=70)
			grade='C';
		else if(per>=60)
			grade='D';
		else if(per>=40)
			grade='E';
		else
			grade='F';
		
		System.out.println("YOUR GRADE IS: "+grade);
		
	}
}
