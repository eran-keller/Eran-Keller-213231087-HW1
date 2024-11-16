public class Assignment01Q01 {
	
	public static void main(String[] args) {
        // Check if the args are not empty
        for (String str : args) {
            if (str.length() > 0 && (str.charAt(0) % 5 == 0)) {
                System.out.println(str.charAt(0));
            }
        }
    }
    
}