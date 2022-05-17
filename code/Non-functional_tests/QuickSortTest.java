import java.util.Arrays;

public class QuickSortTest {
    public static void main(String[] args) {
        // UsabilityTest();
        PerformanceTest();
    }

    public static void UsabilityTest() {
        QuickSort qso = new QuickSort();
        int[] arrayToSort = new int[] { 4, 1, 6, 2, 40, 5, 3, 8, 7 };
        qso.sort(arrayToSort, 0, arrayToSort.length - 1);
        System.out.println(Arrays.toString(arrayToSort));
    }

    public static void PerformanceTest() {
        QuickSort qso = new QuickSort();
        long timeBeforeTest, timeAfterTest;

        for (int i = 1; i <= 10; i++) {
            int[] tmp = generateArray(i * 10000);

            timeBeforeTest = System.currentTimeMillis();
            qso.sort(tmp, 0, tmp.length - 1);

            timeAfterTest = System.currentTimeMillis();

            System.out.println(timeAfterTest - timeBeforeTest);

        }
    }

    public static int[] generateArray(int num) {
        int[] arrayToSort = new int[num];
        for (int i = 1; i < num; i++) {
            arrayToSort[i] = i;
        }
        Shuffle_An_Array.randomizing(arrayToSort, arrayToSort.length);
        return arrayToSort;
    }
}
