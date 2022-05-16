package code.manual_testing;

import code.sorting.src.cocktail_sort.*;
import code.selection_algorithms.src.*;
import code.randomized_algorithms.src.shuffle_an_array.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class cocktail_quick_test {
    @Test
    public void test(){
        int[] array = { 4876, 4089, 5695, 5448, 1510, 4461, 4633, 381, 1358, 1274, 791, 2380, 
            -119, 3724, 29, 2918, 5364, 1545, 4495, 1133, 4503, 427, 272, 4569, 1062, 
            1406, 711, 1495, 2787, 3635, 5233, 1048, 3479, 1916, 137, 1200, 15, 5029, 5369, 
            3827, 5237, 3222, 3074, 5201, 5712, 5206, 5520, 2244, 1809, -367, 1966, 1138, 4182, 
            5151, 123, 813, 3433, 3270, 2708, 4272, 4278, 2542, 3108, 5900, 2647, 1925, 4421, 1898, 
            3465, 5322, 3773, 1371, 1062, 5025, 2035, 5412, 1671, 1478, 2165, 5808, 331, 2256, 2513, 
            4615, 3443, 2239, 5198, 2900, 3030, 3532, 3863, 4888, 925, 1088, 2712, 923, 2220, 10, 2991, 2492};
        for(int i = 0; i < 1000; i++) {
            shuffle_an_array.randomizing(array, array.length);
            cocktail_sort.sort(array);
            quick_select qs = new quick_select();
            int x = qs.findKthLargest(array, 1);
            assertEquals(5900, x);
        }
    }
}
