
public class Assignment01Q02 {
	
	public static void main(String[] args) {
		// do not change this part below
		double piEstimation = 0.0;
		int n = Integer.parseInt(args[0]);
		// *** your code goes here below ***
		double t = 1;
        piEstimation = piEstimation + 1;
        for (int i = 1; i < n; i++) {
            t = t + 2;
            //System.out.println(t*Math.pow(-1, i));
            piEstimation = piEstimation + ((1.0 / t)*Math.pow(-1, i)) ;  // Adjusted to calculate the term correctly
        }
        piEstimation = 4 *piEstimation;
		// do not change this part below
		System.out.println(piEstimation + " " + Math.PI);

	}
}