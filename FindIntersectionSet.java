package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindIntersectionSet 
{
	public static void main(String[] args) 
	{
		int[] arrList1 = {3,2,11,4,6,7};
		int[] arrList2 = {1,2,8,4,9,7};

		//To create HashMap
		Map<Integer, Integer> hashMap = new HashMap<Integer,Integer>();

		//To assign two arrays to a map
		for(int i=0; i<arrList2.length; i++) 
		{
			hashMap.put(arrList1[i], arrList2[i]);
		}

		//To compare the values in two arrays through map and find intersection set
		System.out.println("Intersection set: ");
		for(Entry<Integer, Integer>entry:hashMap.entrySet()) 
		{
			if(entry.getValue() == entry.getKey())
			{
				System.out.println(entry.getKey());
			}
		}
	}
}
