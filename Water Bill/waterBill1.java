import java.util.*;
public class waterBill1{
    public static void main(String[] args) {
 
        int meter_charge=75;
		int total_water_bill;
		int charge;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no units consumed");
		int units_consumed = sc.nextInt();
 
        if (units_consumed<=100)
		{
   
			charge=units_consumed * 5;
		}
	//Nested if else
		if (units_consumed<=250)
		{
		charge=units_consumed * 10;
		}
		else
		{
		charge=units_consumed * 20;
		}
}
		else
		{
		total_water_bill = charge + meter_charge;
   
				System.out.println("Total water bill is"+total_water_bill);
   }
        
    }
		
}
