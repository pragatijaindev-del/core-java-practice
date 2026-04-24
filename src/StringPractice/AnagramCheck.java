package StringPractice;

public class AnagramCheck {
	
	    public static void main(String[] args) {

	        String s1 = "listen";
	        String s2 = "silent";

	       
	        if (s1.length() != s2.length()) {
	            System.out.println("This string is not  anagram");
	            return;
	        }

	        int[] freq = new int[256];   

	        
	        for (int i = 0; i < s1.length(); i++) {

	            freq[s1.charAt(i)]++;   
	            freq[s2.charAt(i)]--;   
	        }

	     
	        for (int count : freq) {
	            if (count != 0) {
	                System.out.println("Not Anagram");
	                return;
	            }
	        }

	        System.out.println("Anagram");
	    }
	}




//public class AnagramCheck {
//    public static void main(String[] args) {
//
//        String s1 = "listen";
//        String s2 = "silent";
//
//        
//        if (s1.length() != s2.length()) {
//            System.out.println("Not Anagram");
//            return;
//        }
//
//        
//        char[] arr1 = s1.toCharArray();
//        char[] arr2 = s2.toCharArray();
//
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//       
//        if (Arrays.equals(arr1, arr2)) {
//            System.out.println("Anagram");
//        } else {
//            System.out.println("Not Anagram");
//        }
//    }
//}
//
