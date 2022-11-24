
public class Panagram_Checking {

	public static void main(String[] args) {
		
		boolean con=false;
		String s1="TWO DRIVEN JOCKS HELP FAX MY BIG QUIZ";
		s1=s1.replace(" ", "");
		
		char[] ch=s1.toCharArray();
		
		int[] ar=new int[26];
		
		for(int i=0;i<ch.length;i++)
		{
			int index=ch[i]-65;
			ar[index]++;  
		}
		for(int i=0; i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				System.out.println("It's not pangram");
				con=true;
			}
		}
		if(con==false)
		{
		System.out.println("It's pangram");
		}

	}

}
