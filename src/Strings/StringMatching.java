package Strings;

public class StringMatching 
{
	/**
	 * 
	 * @param w the word that is sought
	 * @param text the text in which w is searched for
	 * @return The position of the first match or -1 if there is no match.
	 */
	public static int match(String w, String text)
	{
		int tmp = 0;
		int n = text.length();
		int m = w.length();
		
		int i=0;
		
		while (i < n)
		{
			if (text.charAt(i) == w.charAt(tmp))
				tmp = tmp + 1;
			else
				tmp = 0;
			
			if (tmp == m)
				return i - (m-1);
			i++;
		}
		
		return -1;
	}
}