import java.util.Scanner;
public class IT24103090Lab5Q1
{
	public static void main(String[] args)
	{
	int number1;
	int number2;
	int number3;
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the first integer: ");
	number1=input.nextInt();
	System.out.print("Enter the second integer: ");
	number2=input.nextInt();
	System.out.print("Enter the third integer: ");
	number3=input.nextInt();

	System.out.println("User Entered numbers are: " +number1+ " " +number2+ " " +number3);
	if(number1<number2)
	{
		System.out.println("The smallest number is:"+number1);	
	} 
	else if(number3<number2)
	{
		System.out.println("The smallest number is :"+number3);	
	} 
	else
	{
		System.out.println("The smallest number is :"+number2);	
	} 	

	if(number1>number2)
	{
		System.out.println("The Largest number is:"+number1);	
	} 
	else if(number3>number2)
	{
		System.out.println("The Largest number is :"+number3);	
	} 
	else
	{
		System.out.println("The Largest number is :"+number2);	
	} 
	}

}