

/**
 * @author Giovanni
 *
 * * @@ codigo InsertionSort basado en:
 * 
 * http://courses.cs.washington.edu/courses/cse373/01wi/slides/Measurement/sld010.htm
 * 
 */
public class InsertionSort {
	
	public InsertionSort() {
		// TODO Auto-generated constructor stub
	}
	public static void intInsertionSort (int [] a) {
		for (int i = 1; i< a.length; i++){
			int temp = a[i];
			int j;

			for (j = i - 1; j >= 0 && temp < a[j]; j--)
				a[j + 1] = a[j];

			a[j + 1] = temp;		
		}
	}
}
