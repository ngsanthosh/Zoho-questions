public class Main
{
	public static void main(String[] args) {
		int a=5; 
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
}
