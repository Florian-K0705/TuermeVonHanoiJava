package Cryptography;

public class CaesarSchiffre
{
	
	private static final String[] alphabet = 
	{
		" ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",",
		"-", ".", "/", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
		":", ";", "<", "=", ">", "?", "@", "A", "B", "C", "D", "E", "F", "G", 
		"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
		"U", "V", "W", "X", "Y", "Z", "[", "\\", "]", "^", "_", "`", "a", 
		"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", 
		"o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "{",
		"|", "}", "~"
	};

	
	public static void main(String[] args)
	{
	}
	
	public static String encode(String text, int key)
	{
		StringBuilder chiffre = new StringBuilder();
		text = text.toUpperCase();
		
		for (int i=0; i < text.length(); i++)
		{
			int current_pos = searchChar(alphabet, String.valueOf(text.charAt(i)));
			chiffre.append(alphabet[(current_pos + key + alphabet.length) % alphabet.length]);
		}
		
		return chiffre.toString();
	}
	
	
	public static String decode(String chiffre, int key)
	{	
		StringBuilder text = new StringBuilder();
		chiffre = chiffre.toUpperCase();
		
		
		for (int i=0; i < chiffre.length(); i++)
		{
			int current_pos = searchChar(alphabet, String.valueOf(chiffre.charAt(i)));
			text.append(alphabet[(current_pos - key + alphabet.length) % alphabet.length]);
		}
		
		return text.toString();
	}
	
	public static void decodeBruteForce(String chiffre)
	{
		
		for (int i=0; i <= alphabet.length; i++)
		{
			System.out.println(decode(chiffre, i));
			System.out.println();
		}
		
	}
	
	public static int searchChar(String[] alpha, String b)
	{
		boolean isIn = false;
		int pos = 0;
		
		for (int i=0; i <= alpha.length; i++)
		{
			if (alpha[i].equals(b))
			{
				isIn = true;
				pos = i;
				break;
			}
		}
		
		if (!isIn)
		{
			return 0;
		}
		
		return pos;
	}

}
