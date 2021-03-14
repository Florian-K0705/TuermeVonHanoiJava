package Strings;

public class PrintNumberInWords {

	public static void main(String[] args) 
	{
		String s = "2130";
		
		//System.out.println(s.substring(1, 4));
		
		// Zahlen von 0-999999
		System.out.println(pronounceUntilMillion(87254));
	}
	
	private static String pronounceUntilTen(int x)
	{
		String ans = "-";

		switch (x)
		{
		case 0:
			ans = "null";
		case 1:
			ans = "eins";
			break;
		case 2:
			ans = "zwei";
			break;
		case 3:
			ans = "drei";
			break;
		case 4:
			ans = "vier";
			break;
		case 5:
			ans = "fünf";
			break;
		case 6:
			ans = "sechs";
			break;
		case 7:
			ans = "sieben";
			break;
		case 8:
			ans = "acht";
			break;
		case 9:
			ans = "neun";
			break;
		case 10:
			ans = "zehn";
			break;
		case 11:
			ans = "elf";
			break;
		case 12:
			ans = "zwölf";
			break;
		}
		
		return ans;
	}
	
	private static String getDecimals(int x)
	{
		String ans = "-";
		
		switch (x)
		{
		case 20:
			ans = "zwanzig";
			break;
		case 30:
			ans = "dreißig";
			break;
		case 60:
			ans = "sechzig";
			break;
		case 70:
			ans = "siebzieg";
			break;
		default: 
			ans = pronounceUntilTen(x/10).concat("zig");
			break;
		}
		
		return ans;
	}
	
	
	private static String pronounceUntilHundret(int x)
	{
		String ans = "-";
		String number = String.valueOf(x);
		
		
		if (number.length() < 2)
		{
			ans = pronounceUntilTen(x);
		}
		else
		{
			if (x==11 || x==12 || x==10)
			{
				ans = pronounceUntilTen(x);
			}
			else
			{
				if (x%10 == 0)
				{
					ans = getDecimals(x);
				}
				else
				{
					if (String.valueOf(number.charAt(1)).equals("1"))
					{
						ans = "einund".concat(getDecimals(Integer.valueOf(String.valueOf(number.charAt(0))) * 10));
					}
					else
					{
						ans = pronounceUntilTen(Integer.valueOf(String.valueOf(number.charAt(1)))).concat("und").concat(getDecimals(Integer.valueOf(String.valueOf(number.charAt(0))) * 10));
					}
				}
			}
		}
		
		
		return ans;
	}
	
	private static String pronounceUntilThousand(int x)
	{
		String ans = "-";
		String number = String.valueOf(x);
		
		if (number.length() < 3)
		{
			ans = pronounceUntilHundret(x);
		}
		else
		{
			if (String.valueOf(number.charAt(0)).equals("1"))
			{
				ans = "einhundert";
				
				if (!(x%100 == 0))
				{
					if (String.valueOf(number.charAt(1)).equals("0"))
					{
						ans = ans.concat(pronounceUntilTen(Integer.valueOf(String.valueOf(number.charAt(2)))));
					}
					else
					{
						ans = ans.concat(pronounceUntilHundret(Integer.valueOf(number.subSequence(1, 3).toString())));
					}
				}
				
			}
			else
			{
				ans = pronounceUntilTen(Integer.valueOf(String.valueOf(number.charAt(0)))).concat("hundert");
				
				if (!(x%100 == 0))
				{
					if (String.valueOf(number.charAt(1)).equals("0"))
					{
						ans = ans.concat(pronounceUntilTen(Integer.valueOf(String.valueOf(number.charAt(2)))));
					}
					else
					{
						ans = ans.concat(pronounceUntilHundret(Integer.valueOf(number.subSequence(1, 3).toString())));
					}
				}
			}
			
		}
		
		return ans;
	}
	
	private static String pronounceUntilMillion(int x)
	{
		// Zahlen von 0 - 999999
		
		String ans = "-";
		String number = String.valueOf(x);
		
		
		if (number.length() < 4)
		{
			ans = pronounceUntilThousand(x);
		}
		else if (number.length() == 4)
		{
			if (number.charAt(0) == '1')
			{
				ans = "eintausend";
				
				if (x % 1000 != 0)
					ans = ans.concat(pronounceUntilThousand(x%1000));
			}
			else
			{
				ans = pronounceUntilTen(Integer.valueOf(String.valueOf(number.charAt(0)))).concat("tausend").concat(pronounceUntilThousand(x%1000));
			}
		}
		else if (number.length() == 5)
		{
			ans = pronounceUntilThousand(Integer.valueOf(number.subSequence(0, 2).toString())).concat("tausend");
			
			if (x % 1000 != 0)
				ans = ans.concat(pronounceUntilThousand(x%1000));
		}
		else if (number.length() == 6)
		{
			ans = pronounceUntilThousand(Integer.valueOf(number.subSequence(0, 3).toString())).concat("tausend");
			
			if (x % 1000 != 0)
				ans = ans.concat(pronounceUntilThousand(x%1000));
		}
		
		return ans;
	}
	
	
}
