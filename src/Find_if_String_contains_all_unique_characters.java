import java.util.Arrays;

class Solution{
	boolean uniqueCharacters(String str)
    {
        char[] chArray = str.toCharArray();
 
        Arrays.sort(chArray);
 
        for (int i = 0; i < chArray.length - 1; i++) {
            if (chArray[i] != chArray[i + 1]) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
}

public class Find_if_String_contains_all_unique_characters {

	public static void main(String[] args) {
		 Solution su = new Solution();
		 String input = "Ayush@123";
		 if (su.uniqueCharacters(input)) {
	            System.out.println("The String " + input + " has all unique characters");
		 }
	        else {
	            System.out.println("The String " + input + " has duplicate characters");
	        }

	}

}
