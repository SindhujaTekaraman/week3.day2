package week3.day2;

import java.util.Map;
import java.util.LinkedHashMap;

public class PrintDuplicates 
{
	public static void main(String[] args) 
	{
		int[] intArray = {14,12,13,11,15,14,18,16,17,19,18,17,20};

		//To create map
		Map<Integer, Integer> hashMap = new LinkedHashMap<Integer, Integer>();

		//To get the duplicate count from map
		for(int i=0; i<intArray.length; i++)
		{
			hashMap.put(intArray[i], hashMap.getOrDefault(intArray[i], 0)+1);
		}
		System.out.println("Count of values in Array: " + hashMap);

		//To print duplicate values from each set of Map
		System.out.println("Duplicate Values: ");
		for(Map.Entry<Integer, Integer>entryMap:hashMap.entrySet())
		{
			if(entryMap.getValue()>1)
			{
				System.out.println(entryMap.getKey());
			}
		}		

	}
}
