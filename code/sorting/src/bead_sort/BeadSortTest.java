import java.util.Arrays;

public class BeadSortTest{
    public static void main(String[] args){
        UsabilityTest();
    }

    public static void UsabilityTest(){
        int[] arrayToSort = new int[]{4, 1, 6, 2, 40, 5, 3, 8, 7};
        System.out.println(Arrays.toString(BeadSort.beadSort(arrayToSort)));
    }

    public static void PerformanceTest(){

    }
}