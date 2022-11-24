
public class Count_the_number_vowel_consonants_special_character_in_the_String {
	
	public static void main(String[] args) {
        	
        	String str="Welcome to Java @Coding! Happy learning";
            
        	int vowels = 0, consonant = 0, specialChar = 0; 
                    
        	
        	 for (int i = 0; i < str.length(); i++) {
                 
                 char ch = str.charAt(i);
           
                 if ( (ch >= 'a' && ch <= 'z') || 
                     (ch >= 'A' && ch <= 'Z') ) {
           
                     
                     ch = Character.toLowerCase(ch);
           
                     if (ch == 'a' || ch == 'e' || ch == 'i' ||
                         ch == 'o' || ch == 'u') 
                     {
                         vowels++;
                     }
                     else {
                         consonant++;
                     }
                 }
                 else if(ch=='@' || ch=='&' || ch=='$' 
                		 || ch=='!' || ch=='#' || ch=='%' || ch=='^' || ch=='{' 
                		 || ch=='(' || ch=='}' || ch=='/' || ch=='[' || ch==']' || ch=='<' 
                		 || ch=='>'  ) {
                     specialChar++;
                 }
             }
               
             System.out.println("Vowels: " + vowels);
             System.out.println("Consonant: " + consonant);
             System.out.println("Special Character: " + specialChar);
		
		
		}

	}


