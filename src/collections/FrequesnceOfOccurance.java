package collections;

import java.util.Arrays;
import java.util.HashMap;

public class FrequesnceOfOccurance {

	public static void main(String[] args) {
		
		int ar[] = {1,1,2,3,4,5,66,7,66,99,1,3};
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for ( int i : ar) {
			if ( map.containsKey(i))
				map.put(i, map.get(i)+1);
			else
				map.put(i, 1);			
				
		}
		
		System.out.println("Given array -> "+Arrays.toString(ar));
		System.out.println("Result -> " + map);

	}

}
