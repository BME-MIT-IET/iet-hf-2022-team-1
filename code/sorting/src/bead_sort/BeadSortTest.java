import java.util.Arrays;

public class BeadSortTest {
    public static void main(String[] args) {
        // UsabilityTest();
        PerformanceTest();
    }

    public static void UsabilityTest() {
        int[] arrayToSort = new int[] { 4, 1, 6, 2, 40, 5, 3, 8, 7 };
        System.out.println(Arrays.toString(BeadSort.beadSort(arrayToSort)));
    }

    public static void PerformanceTest() {
        long timeBeforeTest, timeAfterTest;
        int[] arrayToSort = new int[] { getRandomNumber() };
        for (int i = 1; i < 500; i++) {
            arrayToSort = addNewElement(i, arrayToSort, getRandomNumber());
        }

        for (int i = 0; i < 10; i++) {

            timeBeforeTest = System.currentTimeMillis();

            BeadSort.beadSort(arrayToSort);

            timeAfterTest = System.currentTimeMillis();

            System.out.println(timeAfterTest - timeBeforeTest);
            for (int j = 0; j < 500; j++) {
                arrayToSort = addNewElement(arrayToSort.length, arrayToSort, getRandomNumber());
            }
        }
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 10000);
    }

    public static int[] addNewElement(int n, int arr[], int x) {
        int i;

        int newarr[] = new int[n + 1];

        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }
}