package binary;

public class BinarySearch {
    public int binarySearch(int[] array, int item) {
        int lowerBound = 0;
        int upperBound = array.length - 1;

        while (lowerBound <= upperBound) {
            int middleBound = (lowerBound + upperBound) / 2;
            int guessedNumber = array[middleBound];
            if (guessedNumber == item) {
                return middleBound;
            }
            if (guessedNumber > item) {
                upperBound = middleBound - 1;
            } else {
                lowerBound = middleBound + 1;
            }
        }
        return -1;
    }
}
