

public class PrintduplicatesFromtheString {

	public static void main(String[] args) {
		 String input = "I am Java Developer"  ;
		
	      char[] carray = input.toCharArray();
	      System.out.println("The string is:" + input);
	      System.out.print("Duplicate Characters in above string are: ");
	      for (int i = 0; i < input.length(); i++) {
	         for (int j = i + 1; j < input.length(); j++) {
	            if (carray[i] == carray[j]) {
	               System.out.print(carray[j] + " ");
	               break;
	            }
	         }
	      }
	}

}
