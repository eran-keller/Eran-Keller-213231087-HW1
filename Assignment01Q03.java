
public class Assignment01Q03 {
	
	public static void main(String[] args) {
		int numOfOdd = 0;
		int n = Integer.parseInt(args[0]);
		// *** your code goes here below ***
		System.out.println("The first "+ n +" Fibonacci numbers are:");
		// *** your code goes here below ***
		int k = 1;
		int t = 1;
		String  res1 = "1 1";
		int  odd_cnt = 2;
		for (int i = 1; i < n-1; i++) {
			int tmp = k+t;
			if (tmp % 2 != 0) {
			   odd_cnt = odd_cnt + 1; 
			}
			res1 = res1 + " " + Integer.toString(t+k);	
			int next_t = t+k;
		    k = t;
			t = next_t;
		}
		System.out.println(res1);
		numOfOdd = odd_cnt;

		System.out.println("The number of odd numbers is: "+numOfOdd);

	

}
}