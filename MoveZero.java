public class MoveZero {

    public static void main(String[] args) {

        int arr[] = {0, 1, 2, 0, 12};

        int i = 0;
        int index = 0;

        while (i < arr.length) {

            if (arr[i] != 0) {

                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;

                index++;
            }

            i++;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}