
public class PatternPrinting {	
	
	public void patternPrinting2(int a) {
		int count = 0;
		for(int i = 1 ; i <=  5 ; i++) {
			for(int j = i ; j <= a ; j++) {
				System.out.print(" " + j );
			}
			count += 1;
			for(int k = 1 ; k < count ; k++) {
				System.out.print(" " + k);
			}
			System.out.println();
		}
	}
	
	public void printPattern1(int a) {
		for(int i = 1 ; i <= a ; i++) {
			for(int j = a ; j >= 1 ; j--) {
				if(j <= i) {
					System.out.print(j + " ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		PatternPrinting p = new PatternPrinting();
		
		p.printPattern1(5);
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		p.patternPrinting2(5);
	}
}
