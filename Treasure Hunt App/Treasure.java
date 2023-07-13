import java.util.Scanner;
class Treasure{
    public static void main(String args[]){

        System.out.println("Welcome to Treasure Island");
		Scanner sc = new Scanner(System.in);
		System.out.println("Right or Left");
		String decision = sc.next();
		
	    if (decision.equalsIgnoreCase("Right")) {
		  System.out.println("Fall into a hole.Game over");
		     }  
		    else if(decision.equalsIgnoreCase("Left")) {
		         System.out.println("Swim or wait");
		         String swimWait=sc.next();
		         if(swimWait.equalsIgnoreCase("swim")) {
		           System.out.println("Attact by trout,Game over");
			     }
		         else if(swimWait.equalsIgnoreCase("wait")){
		                 System.out.println("Enter Door color Red or BLue or yeloow");
		                 String redBlueYellow=sc.next();
		                if(redBlueYellow.equalsIgnoreCase("Red")){
				          System.out.println("Burned by fire.Game Over.");
			            }  	
				            else if(redBlueYellow.equalsIgnoreCase("Blue")){
				            System.out.println("Eaten by beasts.");
				            } 
				            else if(redBlueYellow.equalsIgnoreCase("yellow")){
				              System.out.println("YOu win");
				              }
			            
				         else{
		                     System.out.println("Invalid Input");
				              }
                 }
			        else{
		              System.out.println("Invalid Input");
		            }
	        }  
		    else{
		      System.out.println("Invalid Input");
		    }		
	}			
}  
		    
		  
				
		
		