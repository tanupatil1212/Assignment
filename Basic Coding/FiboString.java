import java.util.Scanner;
public class FiboString{
	public static void main(String args[]){
		System.out.println("Enter the :");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String org_str= str;
		String rev ="";
		
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+ str.charAt(i);
		}
		
	    if(org_str.equals(rev))
		{
			System.out.println("The String is fibonacci series");
		}
		else
		{
			System.out.println("The String is not a fibonacci series");
		}
			
    }
}	