package practice.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DifferenceBetweenLowAndHighPriceGoodie {
	
	static int findMinDiff(Map<String, Integer> map, int n,
			int m)
	{
		if (m == 0 || n == 0)
			return 0;


		List<Integer> list = new ArrayList<Integer>(map.values());
		Collections.sort(list);


		if (n < m)
			return -1;

		
		int min_diff = Integer.MAX_VALUE;

		

		for (int i = 0; i + m - 1 < n; i++)
		{
			int diff = list.get(i+m-1) - list.get(i);

			if (diff < min_diff)
				min_diff = diff;
		}
		
		
		return min_diff;
	}

		public static void main(String[] args) {

			Map<String, Integer> map = new LinkedHashMap<>();
			map.put("Fitbit Plus",7980);
			map.put("IPods",22349);
			map.put("MI Band",999);
			map.put("Cult Pass",2799);
			map.put("Macbook Pro",229900);
			map.put("Digital Camera",11101);
			map.put("Alexa",9999);
			map.put("Sandwich Toaster",2195);
			map.put("Microwave Oven",9800);
			map.put("Scale",4999);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the employees numbers ");
			int m = sc.nextInt();
			
			System.out.println("Number of the employees: " +m);
			
			int n= map.size();
	        
	        
	        int x= findMinDiff(map, n, m);
	        
	        List<Integer> list = new ArrayList<Integer>(map.values());
	        Collections.sort(list);
	        
	        int min = 0;
	        int max =0;
	        for(int i=0;i<list.size();i++){
	        	for(int j=i+1;j<list.size();j++){
	        	if(Math.abs(list.get(i)-list.get(j))==x){
	        		min=list.get(i);
	        		max=list.get(j);
	        		};
	        }
	        }

	        Iterator hmIterator = map.entrySet().iterator();
	  
	        while (hmIterator.hasNext()) {
	            Map.Entry mapElement = (Map.Entry)hmIterator.next();
	            int marks = ((int)mapElement.getValue());
	            if(marks>=min && marks<=max)
	            {
	            	System.out.println(mapElement.getKey() + " : " + marks);
	            }
	            
	        }
	        System.out.println("And the difference between the chosen goodie with highest price and the lowest price is "
	                + findMinDiff(map, n, m));
	             
		}

	}



