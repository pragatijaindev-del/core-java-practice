package ArrayPractice;

public class AverageOfArray {
   public  static void main(String[] args) {
       int[] arr = {10,12,14,67,52};
       int sum = 0;

     for (int i = 0;i< arr.length;i++){
         sum  = sum+arr[i];

 }
double average = (double)sum/arr.length;
       System.out.println(average);
    }
}
