package quick;

public class QuickSort {

    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public void quickSort(int[] array, int startIndex, int endIndex) {
        if (endIndex - startIndex > 1) {
            int rightIndex = partition(array, startIndex, endIndex);

            quickSort(array, startIndex, rightIndex - 1);

            quickSort(array, rightIndex + 1, endIndex);
        }
    }

    public int partition(int[] array, int startIndex, int endIndex) {
        int leftIndex = startIndex;
        int rightIndex = endIndex;

        int pivot = array[startIndex];

        while (rightIndex > leftIndex) {
            while (array[leftIndex] <= pivot && leftIndex <= endIndex && rightIndex > leftIndex) {

                leftIndex++;
            }
            while (array[rightIndex] > pivot && rightIndex >= startIndex && rightIndex >= leftIndex) {

                rightIndex--;
            }
            if (rightIndex > leftIndex) {
                swap(array, leftIndex, rightIndex);
            }
        }

        swap(array, startIndex, rightIndex);

        return rightIndex;
    }

    public void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
