package Q74;

import java.util.Random;

public class Probability {

    public static void main(String[] args) {
        Random random = new Random();
        // to store random numbers
        int[] nums = new int[12];
        int r;
        // minimum and maximum value to genrate random number
        int min = 1;
        int max = 12;
        for (int i = 0; i < 20; i++) {
            r = random.nextInt(max - min + 1) + min;
            // store number at there index i.e r-1
            // because indexing starts from 0 to 11
            // and random number are generated from 1 to 12
            nums[r - 1] += 1;
        }

        // loop in array to print success or failures
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                System.out.println((i + 1) + " " + nums[i] + " Success");
            else
                System.out.println((i + 1) + " " + nums[i] + " Failure");

        }

    }

}