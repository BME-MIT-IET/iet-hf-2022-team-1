// Part of Cosmos by OpenGenus Foundation
package code.sorting.src.comb_sort;

import java.util.Scanner;

public class comb_sort
{
    public static void main(String[] args)
    {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no elements you want (Size):");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Please enter the " + size + " elements:");
        for (i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Sorted array is :");
        comb_sort cs = new comb_sort(a);
        for (i = 0; i < size; i++)
        {
            System.out.printf("%d\t", a[i]);
        }
    }
    private final int[] a;

    public comb_sort(int[] b)
    {
        this.a = b;
        combSort(a.length);
    }

    private void combSort(int size)
    {
        float shrink = 1.3f;
        int swap;
        int i, gap = size;
        boolean swapped = false;
        while ((gap > 1) || swapped)
        {
            if (gap > 1)
            {
                gap = (int) ((float) gap / shrink);
            }
            swapped = false;
            for (i = 0; gap + i < size; ++i)
            {
                if (a[i] - a[i + gap] > 0)
                {
                    swap = a[i];
                    a[i] = a[i + gap];
                    a[i + gap] = swap;
                    swapped = true;
                }
            }
        }
    }
}
