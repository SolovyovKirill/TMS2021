public class Homework4 {

    public static void main(String args[]) {

        int arr[] = {1,2,10,3,100,-2};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
