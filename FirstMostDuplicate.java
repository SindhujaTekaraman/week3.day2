package week3.day2;

import java.util.Map;
import java.util.HashMap;

public class FirstMostDuplicate 
{
	public static void main(String[] args) 
	{
		String str = "abbaba";

		//To convert String to a Character array
		char[] chrArray = str.toCharArray();

		int val, maxVal;

		//To create HashMap
		Map<Character,Integer> hashMap = new HashMap<Character,Integer>();

		//To find the first most duplicate character
		for(int i=0; i<chrArray.length; i++) 
		{
			char chr = chrArray[i];
			
			//To compare and find the most maximum occurred character
			if(hashMap.containsKey(chr)) 
			{
				val = hashMap.get(chr);
				hashMap.put(chr, val+1);
				maxVal = hashMap.get(chr);
				if (maxVal > val) 
				{
					System.out.println("First most duplicate character: " + chr);
					break;
				}
			}
			else 
			{
				hashMap.put(chr, 1);
			}
		}
	}
}
