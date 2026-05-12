package ArrayPractice;

public class BinarySearch {

    public static void main(String[] args) {


        int[] arr = {10, 20, 30, 40, 50};

        int target = 10;

        int start = 0;

        int end = arr.length - 1;

        while (start <= end) {


            int mid = start + (end - start) / 2;


            if (target == arr[mid]) {

                System.out.println(mid + " FOUND THE TARGET" + target+ "target");
                return;
            }


            if (target > arr[mid]) {

                start = mid + 1;

            } else {

                end = mid - 1;
            }
        }

        System.out.println("TARGET NOT FOUND");
    }
}