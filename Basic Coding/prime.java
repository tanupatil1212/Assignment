import java.util.Scanner;

public class Prime{
     public static void main(String args[]){
		 System.out.println("Enter the no:");
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 int count=0;
		 
		 if(num>1)
		 {	 
			 for(int i=1;i<=num;i++)
			     {
				   
				    if(num%i==0)
					 count++;
				 }
				 if(count==2)
				 {
					 System.out.println("it is prime no");
				 }	 
		else{
			System.out.println("it is  not a prime no");
		    }
		 }	
	 }
	 
}	 