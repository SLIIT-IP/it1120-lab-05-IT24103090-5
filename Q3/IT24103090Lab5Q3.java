import java.util.Scanner;
public class IT24103090Lab5Q3
{
	public static final double ROOM_CHARGE = 48000.00;
   	public static final int NO_DISCOUNT_DAYS = 3;
   	public static final int LOW_DISCOUNT_DAYS = 5;
    	public static final double LOWDISCOUNT = 0.10;  
    	public static final double HIGHDISCOUNT = 0.20;

	public static void main(String[] args)
	{
	

	Scanner input=new Scanner(System.in);

	System.out.print("Enter the start date(1-31): ");
        int startDate = input.nextInt();
        System.out.print("Enter the end date(1-31): ");
        int endDate = input.nextInt();

	  if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) 
	{
            System.out.println("Error: Dates must be between 1 and 31");
            return; 
        }

 	if (startDate >= endDate) {
            System.out.println("Error: The start date must be Less than end date.");
            return;
        }


	   int reservedDays = endDate - startDate;

        
        double totalAmount;
        if (reservedDays < NO_DISCOUNT_DAYS) {
            
            totalAmount = reservedDays * ROOM_CHARGE;
        } else if (reservedDays < LOW_DISCOUNT_DAYS) {
            
            totalAmount = reservedDays * ROOM_CHARGE * (1 - LOWDISCOUNT);
        } else {
            
            totalAmount = reservedDays * ROOM_CHARGE * (1 - HIGHDISCOUNT);
        }

       	System.out.println("Room charge per day: " +ROOM_CHARGE);
        System.out.println("Number of days reserved: " +reservedDays);
        System.out.println("Total amount to be paid: " +totalAmount);

	}

}