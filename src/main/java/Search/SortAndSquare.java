package Search;

public class SortAndSquare {


    //Sort and square

    public int[] sortedSquares(int[] numbers) {

        int temp;
        boolean notSwapped = false;
        while (!notSwapped) {
            notSwapped = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (Math.abs(numbers[i]) > Math.abs(numbers[i + 1])) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    notSwapped = false;
                }
            }
        }
        for (int k = 0; k < numbers.length; k++) {
            numbers[k] = numbers[k] * numbers[k];
        }
        return numbers;

    }
}
