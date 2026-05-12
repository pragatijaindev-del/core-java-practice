package ArrayPractice;

public class SumOfArray {
   public  static void main(String[] args) {
       int[] arr = {10,23,42,19,20};
       int sum = 0;
       for(int i = 0;i<arr.length;i++){
           sum = sum+arr[i];
       }
       System.out.println(sum);

    }
}
