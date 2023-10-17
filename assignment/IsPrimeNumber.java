package week1.day2.assignment;

public class IsPrimeNumber {
	
	public static void main(String[] args) {
		int num = 19;
		boolean isPrime = true;
		for (int i=2;i<=num/2;i++) {
			if(num%i==0) {
				isPrime = false;
				break;
				
			}
			}
		if(isPrime) {
			System.out.println(num+"  is prime");
		}else {
			System.out.println(num+"  is Not prime");
		}
	}
}
