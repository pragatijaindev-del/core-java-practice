package ArrayPractice;

public class CheckingNumber {
   public  static void main(String[] args) {
       int [] arr = {1,2,3,-1,-2,4,5,-6};
       for(int i = 0; i<arr.length;i++){
           if(arr[i] >0){
               System.out.println("this is positive number" + arr[i]);
           } else {
               System.out.println("this is negative number"+ arr[i]) ;
           }
       }

    }
}
