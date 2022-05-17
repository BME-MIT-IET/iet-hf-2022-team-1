import java.util.Arrays;

public class CocktailSortTest {
    public static void main(String[] args) {
        // UsabilityTest();
        PerformanceTest();
    }

    public static void UsabilityTest() {
        CocktailSort cocktail = new CocktailSort();
        int[] arrayToSort = new int[] { 4, 1, 6, 2, 40, 5, 3, 8, 7 };
        cocktail.sort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
    }

    public static void PerformanceTest() {
        CocktailSort cocktail = new CocktailSort();
        long timeBeforeTest, timeAfterTest;

        for (int i = 1; i <= 10; i++) {
            int[] tmp = generateArray(i * 10000);

            timeBeforeTest = System.currentTimeMillis();
            cocktail.sort(tmp);

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
