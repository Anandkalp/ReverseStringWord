
public class ReverseStringWord3
{
public static void main(String args[])
	{
		String s1="Java Learner";
		System.out.println("Original String is :"+s1);
		
		
		String[] words=s1.split(" ");
		
		for (String word:words)
		{
			String revWord="";
			
			for(int i=word.length()-1; i>=0; i--)
			{
				revWord=revWord+word.charAt(i);
			}
				
			System.out.print(revWord);
		}
	}
}