package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates 
{
	public static void main(String[] args) 
	{
		String str1 = "We learn java basics as part of java sessions in java week1";
		//To change to String Array
		String[] strArr = str1.split(" ");

		//To create List
		Set<String> dupString = new LinkedHashSet<String>();

		//To add String Array elements in a Set, which removes the duplicate values
		for(int i=0; i<strArr.length; i++) 
		{
			dupString.add(strArr[i]);
		}

		//To display the String without duplicate values
		for (String str2 : dupString) 
		{
			System.out.print(str2 + " ");
		}
	}
}
