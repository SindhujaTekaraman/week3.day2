package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest 
{
	public static void main(String[] args) 
	{
		int[] intArray = {3,2,11,4,6,7};

		//To create Integer List
		List<Integer> intList = new ArrayList<Integer>();

		//To add array elements to list
		for (int i=0; i<intArray.length; i++) 
		{
			intList.add(intArray[i]);
		}

		//To sort elements in list
		Collections.sort(intList);

		//To get size of the list
		int listSize = intList.size();
		
		//To find the second largest value
		int secValue = intList.get(listSize-2);

		System.out.println("Second largest number: " + secValue);
	}
}
