public class Operation {
	
	public void operation1(String s) {
		
		int sum = s.charAt(0) - 48;

		
		int mid = (s.length() / 2) + 1 , end = s.length();
		int j = mid;
		
		for(int i = 1 ; i < mid && j < end ; i++ , j++) {
		    switch(s.charAt(j)){
    			case '+' :{
    				sum = sum + (s.charAt(i) - 48);
    				break;
    			}
    			case '-' :{
    				sum = sum - (s.charAt(i) - 48);
    				break;
    			}
    			case '*' :{
    				sum = sum * (s.charAt(i) - 48);
    				break;
    			}
    			case '/' :{
    				sum = sum / (s.charAt(i) - 48);
    				break;
    			}
		    }
			
		}
		
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		String s = "12345*+-+";
		
		Operation o = new Operation();
		
		o.operation1(s);
		
	}
}