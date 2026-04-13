package StringPractice;

public class RemoveDuplicate { // time complexity is 0(n) bcz we are checkingnstring single time
	public static void main(String[] args) {
		String str = "aabbcdfefs";
		String result = "";
		boolean[] seen = new boolean[256];//ASCII character
// Optimized approachO(n) time complexity, O(1) space - boolean array for constant-time lookup
// seen[ch] directly checks if character already exists, faster than nested loops
		for (int i =0;i< str.length();i++) {
			char ch= str.charAt(i);
			
			if (!seen[ch]) {
				seen[ch]= true;
				result += ch;
				
			}
		}
		System.out.println(result);
		
	}


}
// less optimized approach as string concatination is happning each time


//for (int i = 0; i < str.length(); i++) {
//	char ch = str.charAt(i);
//	
//	if (result.indexOf(ch) == -1) { // if character is not found return -1
//		result += ch;
//	}
//}



// using in built feature


//String str = "aabbcdfefs";
//StringBuilder result = new StringBuilder();
//
//// Using StringBuilder - faster than String concatenation
//// O(n²) time due to indexOf(), but better memory handling
//for (int i = 0; i < str.length(); i++) {
//	char ch = str.charAt(i);
//	
//	// stringbuilder ka indexOf method direct string le skta h but charcter nh,
//	//so valueOf()ka use krke hume issse string m change kr rh  h
//	if (result.indexOf(String.valueOf(ch)) == -1) {
//		result.append(ch);
//	}
//}
//
//System.out.println(result.toString());
//}
//}
//    