package Assesment;

import java.util.List;

public class SortedArray {

    /*
     * Complete the 'moves' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY serialNumber as parameter.
     * Company - CO
     */
    public static int moves(List<Integer> arr) {

      int[] a = new int[arr.size()];
      for(int i=0;i<arr.size();i++)
      {
          a[i]=arr.get(i);
      }


        int left = 0;
        int right = a.length - 1;
        int temp = 0;
        int count = 0;
        while(left < right) {
            if(a[left] % 2 != 0) {
                while(a[right] % 2 != 0 && right > left) {
                    right--;
                }
                if(left != right) {
                    temp = a[right];
                    a[right] = a[left];
                    a[left] = temp;
                    right--;
                    left++;
                    count++;
                }
            }else {
                left++;
            }
        }
        return count;
    }
}
