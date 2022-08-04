package week3.day2;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FindNumberOccurances 
{
	public static void main(String[] args) 
	{
		int[] intArray = {2,3,5,6,3,2,1,4,2,1,6,-1};

		//To sort the elements in array
		Arrays.sort(intArray);

		int mapKey, mapValue;

		//To create TreeMap
		Map<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();

		//To add array elements to map
		//To find number occurances
		for (int i = 0; i<intArray.length; i++) 
		{
			mapKey = intArray[i];
			if(treeMap.containsKey(mapKey))
			{
				mapValue = treeMap.get(mapKey);
				treeMap.put(mapKey, mapValue+1);
			}
			else 
			{
				treeMap.put(mapKey, 1);
			}
		}
		System.out.println("Number occurances: " + treeMap);
	}
}
