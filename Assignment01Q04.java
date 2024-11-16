import java.util.Arrays;

public class Assignment01Q04 {

	public static void main(String[] args) {
		int[] primes = new int[20];	
		int primeAmount = 1;
		int numToCheck = 3; 
		primes[0] = 2;
		while (primeAmount < primes.length) {
			boolean isPrime = true;
			double sqrt = Math.sqrt(numToCheck);
			int top = (int) sqrt;
			// issue found in line below, the loop checked if the number is a prime only up to the value of the root of the number , but, didn't include checking for the value of the root
			for (int i = 0; i < primeAmount && primes[i] < top+1; i++) {
				if (numToCheck % primes[i] == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primes[primeAmount] = numToCheck;
				primeAmount++;
			}
			numToCheck += 2;
		}
		System.out.println(Arrays.toString(primes));


	}

}
