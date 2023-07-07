import java.util.Scanner;

class fact{
         public static void main(String args[]){
         System.out.println("Enter a no");
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
		 int i=1,fact=1;
		 
		 while(i<=num)
		  {
		     fact=fact*i;
			 i++;
		  }	 

		 System.out.println("Factorial of the no"  +" " + fact );
		}
}		