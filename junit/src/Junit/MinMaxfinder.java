package Junit;

	import java.lang.reflect.Array;
	import java.util.Arrays;

	 public class MinMaxfinder{
		int a[];
		public MinMaxfinder(int a[])
		{
		this.a=a;

		}
		public int[] getValue() {
		return this.a;
		}

		public static int findMin(int a[] )
		{

		Arrays.sort(a);
		int minimum=a[0];
		return minimum;
		}
	 public static int findMax(int a[] )
		{
		Arrays.sort(a);
		int maximum=a[a.length-1];
		return maximum;
		}
		}
			
			
		
		

