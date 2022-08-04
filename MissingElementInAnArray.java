package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray 
{
	public static void main(String[] args) 
	{
		int[] intArray = { 1, 2, 3, 4, 7, 6, 8 };

		//To create Integer List
		List<Integer> intList = new ArrayList<Integer>();

		//To add array elements to List
		for (int i=0; i<intArray.length; i++) 
		{
			intList.add(intArray[i]);
		}

		//To sort the List
		Collections.sort(intList);

		//To find the missing elements in array
		System.out.println("Missing elements in array: ");
		for (int j=1; j<intList.size(); j++)
		{
			if (!intList.contains(j)) 
			{
				System.out.println(j);
			}
		}
	}
}
