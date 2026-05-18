package ArrayPractice;

public class EvenOrOdd {
    public static void main(String[] args) {
        int[] arr = {10, 12, 13, 14, 15, 16, 17, 18, 19, 20};


        for (int i = 0; i < arr.length; i++) {


            if (arr[i] % 2 == 0) {
                System.out.println("printing even numbers :" + arr[i]);

            } else {
                System.out.println("printing odd numbers :" + arr[i]);
            }

        }
    }
}

