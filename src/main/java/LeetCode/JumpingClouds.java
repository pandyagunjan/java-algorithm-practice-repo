package LeetCode;

public class JumpingClouds {

    static int jumpingOnClouds(int[] c) {
        int count = 0;
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == 0) i++;
            count++;
        }
        return count;

    }

}
