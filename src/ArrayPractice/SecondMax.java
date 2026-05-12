package ArrayPractice;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {20,40,30,60,50};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
       for(int i = 0;i<arr.length;i++){
           if(arr[i] > max){
    secondMax = max;
    max = arr[i];

           }else if(arr[i] > max && arr[i] != max){
               secondMax = arr[i];
           }
       }
        System.out.println(max + "FOUND MAX ELEMENT");
        System.out.println(secondMax + "FOUND SECOND MAX ELEMENT");
    }
}
