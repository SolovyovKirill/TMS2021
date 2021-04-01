public class Homework3 {

    public static void main(String[] args) {
        int nums[] = {2,3,4,5,6};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            count += nums[i];
        }

        System.out.println(count/ nums.length);
    }

}


