package StringPractice;

public class FirstNonReaptingCharacter {
	public static void main(String[] args) {
		String str = "aabbcde";
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = 0;  //  Har character ke liye count reset hoga ,
			//agar loop ke bahar rkha th reset nh hoga
			
			
			for (int j = 0; j < str.length(); j++) { 
				if (str.charAt(j) == ch) {
					count++;
				}
			}
			
			
			if (count == 1) {
				System.out.println(ch);
				return; 
			}
		}
		
		System.out.println("No non-repeating character found");
	}
}


 //Optimized appraoch


//package StringPractice;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//public class FirstNonReaptingCharacter {
//	public static void main(String[] args) {
//		String str = "aabbcde";
//		
//		
//		Map<Character, Integer> frq = new LinkedHashMap<>();
//		
//		//counting frequency
//		for (char ch : str.toCharArray()) {
//			frq.put(ch, frq.getOrDefault(ch, 0) + 1);
//		}
//		
//		
//		for (char ch : str.toCharArray()) {
//			if (frq.get(ch) == 1) {
//				System.out.println(ch);
//				return;
//			}
//		}
//		
//		System.out.println("No non-repeating character found");
//	}
//}