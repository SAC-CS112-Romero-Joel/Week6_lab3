package week6_lab3;

import java.util.Scanner;

public class lab3 {

	public static void main(String[] args) {
	
			
Scanner input = new Scanner(System.in);
Scanner op =  new Scanner(System.in);
			
int computerNum;
int Num;

computerNum = 0 + (int) ( Math.random() * 10 );
	 
	 
System.out.println("Guess a Number between 1 and 10");
 Num = input.nextInt();


if ( computerNum < Num )
System.out.println("Your Number is to high");

else if ( computerNum > Num )
System.out.println("Your Number is to low ");

else  
System.out.println("we got the Same Number you win "); 

	 
System.out.println(" My Number Was : "+(computerNum));

	}

}
