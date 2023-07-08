import java.util.Scanner;
public class RideBill{
  public static void main(String args[]){
	  System.out.println("Enter the Height");
	  Scanner sc = new Scanner(System.in);
	  int height = sc.nextInt();
	  
	       if(height>120)
	         {
                 System.out.println("Can't Ride");
             }
            else
	            {
                  System.out.println("Can Ride");
				  System.out.println("what's your age");
				  
				  
				  int age = sc.nextInt();
				
				  if(age < 12)
				  {
				
					  System.out.println("want photos /n Yes or No");
					  String ageGreater12 = sc.next();
					  if(ageGreater12.equalsIgnoreCase("yes")){
						  int bill = 5+3;
						  System.out.println("your total bill is"+ " " + bill +"$" );
					  }
					  else if (ageGreater12.equalsIgnoreCase("No")){
						  System.out.println("Pay $" + " " +5);
					  }
					  else
					  {
						  System.out.println("Invalid Input");
					  }
					  
				}
				
				//if age in between 12-18
				if(age == 12 || age < 18)
				  {
				
					  System.out.println("want photos /n Yes or No");
					  String ageInBetween12to18 = sc.next();
					  if(ageInBetween12to18.equalsIgnoreCase("yes")){
						  int bill = 7+3;
						  System.out.println("your total bill is"+ " " + bill +"$" );
					  }
					  else if (ageInBetween12to18.equalsIgnoreCase("No")){
						  System.out.println("Pay $" + " " +7);
					  }
					  else
					  {
						  System.out.println("Invalid Input");
					  }
					  
				}
				//if age 18 or over
				if(age == 18 || age < 45 )
				  {
				
					  System.out.println("want photos /n Yes or No");
					  String ageGreater18 = sc.next();
					  if(ageGreater18.equalsIgnoreCase("yes")){
						  int bill = 12+3;
						  System.out.println("your total bill is"+ " " + bill +"$" );
					  }
					  else if (ageGreater18.equalsIgnoreCase("No")){
						  System.out.println("Pay $" + " " +12);
					  }
					  else
					  {
						  System.out.println("Invalid Input");
					  }
					  
				}
				// if age 45 and above
				if( age == 45 || age < 56)
				  {
				
					  System.out.println("want photos /n Yes or No");
					  String ageGreater45 = sc.next();
					  if(ageGreater45.equalsIgnoreCase("yes")){
						  int bill = 50+3;
						  System.out.println("your total bill is"+ " " + bill +"$" );
					  }
					  else if (ageGreater45.equalsIgnoreCase("No")){
						  System.out.println("Pay $" + " " +50);
					  }
					  else
					  {
						  System.out.println("Invalid Input");
					  }
					  
				}


				
				  }
				  
				  
				  
				  
                
    }
}