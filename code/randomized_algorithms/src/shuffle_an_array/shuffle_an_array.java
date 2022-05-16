// Part of Cosmos by OpenGenus Foundation 
package code.randomized_algorithms.src.shuffle_an_array;

import java.util.Random;

public class shuffle_an_array
{
  public static void randomizing(int array[], int n)
  {
	  Random r  = new Random();
	  for(int i = n-1;i>0;i--)
	  {
		  int j = r.nextInt(i);
		  int temp = array[i];
		  array[i] = array[j];
		  array[j] = temp;
	  }
	  //System.out.println(Arrays.toString(array));
  }
public static void main(String[]args)
{
	   int[] A = {1,2,3,4,5,6,7,8};
	   int n = A.length;
	   randomizing(A,n);
 }
}
			
