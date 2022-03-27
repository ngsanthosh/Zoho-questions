
public class Nge {
	
	public int returnMax(int i , int[] a) {
		
		int max = Integer.MAX_VALUE;
		
		for(int j = i + 1 ; j < a.length ; j++) {
			if(a[j] > a[i] && a[j] < max) {
				max = a[j];
			}
		}
		if(max != Integer.MAX_VALUE) {
			return max;
		}
		
		return -1;
		
	} 
	
	public void nextGreaterElement(int[] a) {
		int max; 
		for(int i = 0 ; i < a.length ; i++) {
			max = returnMax(i, a);
			a[i] = max;
		}
		
		for(int j = 0 ; j < a.length ; j++) {
			System.out.print(a[j] + " ");
		}
	}
	
	public static void main(String[] args) {
		Nge n = new Nge();
		
		int[] a = {1,9,7,56,36,91,42};
		
		n.nextGreaterElement(a);
	
	}
}
