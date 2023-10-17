package week1.day2.assignment;

public class Fibonacci {

	public static void main(String[] args) {
		 
		int rangeValue = 8; 
		int firstNumber = 0;    
		int secondNumber= 1;
		
		    System.out.println("Fibonacci Series till " + rangeValue+ " terms:");

		    for (int i = 1; i <= rangeValue; ++i) {
		    	
		      System.out.print(firstNumber + ", ");
		     int sum = firstNumber + secondNumber;
		      firstNumber = secondNumber;
		      secondNumber = sum;
		    }
		  }
		}

