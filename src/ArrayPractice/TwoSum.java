package ArrayPractice;

import java.util.HashMap;

public class TwoSum {
	
	    public static void main(String[] args) {

	        int[] arr = {2, 7, 11, 15};   
	        int target = 9;

	        HashMap<Integer, Integer> map = new HashMap<>(); 

	        for (int i = 0; i < arr.length; i++) {

	            int  req = target - arr[i];  

	        
	            if (map.containsKey(req)) {
	            	System.out.println(req + ", " + arr[i]);      
	               // System.out.println(map.get( req)+ ", " + i);
	                return;
	            }

	            map.put(arr[i], i);   
	        }

	        System.out.println("No pair found");
	    }
	}


