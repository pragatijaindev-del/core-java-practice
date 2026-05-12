package StringPractice;

import java.util.HashMap;

public class FirstLongestSubString {
	
	
	    public static void main(String[] args) {
	        String str = "abcabcbb";
	        int maxLength = LongestSubstring(str);
	        System.out.println(maxLength); 
	    }
	    
	    public static int LongestSubstring(String str) {
	        HashMap<Character, Integer> hs = new HashMap<>();
	        int left = 0;
	        int maxLength = 0;
	        
	        for (int right = 0; right < str.length(); right++) {  
	            char ch = str.charAt(right);
	            
	            
	            if (hs.containsKey(ch)) {
	                left = Math.max(left, hs.get(ch) + 1);
	            }
	            
	            hs.put(ch, right);
	            maxLength = Math.max(maxLength, right - left + 1);
	        }
	        
	        return maxLength;
	    }
	}


