
public class Sort {

	public boolean compare(String s1, String s2) {
		
		
		for(int k = 0 ; k < s1.length(); k++) {
			if(s1.charAt(k) > s2.charAt(k)) {
				return true;
			}
			else if(s1.charAt(k) < s2.charAt(k)) {
				return false;
			}
		}
		
		return false;
	}
	
	
	public void sortString(String[] stringArray) {
		String temp;
		boolean check;
		
		for(int i = 0 ; i < stringArray.length ; i++) {
			for(int j = 0 ; j < stringArray.length - i - 1 ; j++) {
				if(stringArray[j].length() > stringArray[j+1].length()) {
					temp = stringArray[j+1];
					stringArray[j+1] = stringArray[j];
					stringArray[j] = temp;
					continue;
				}
				if(stringArray[j].length() == stringArray[j+1].length()) {
					
					check = compare(stringArray[j] , stringArray[j+1]);
					
					if(check) {
						
						temp = stringArray[j+1];
						stringArray[j+1] = stringArray[j];
						stringArray[j] = temp;
						
					}
				} 
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Sort sort = new Sort();
		
		String[] stringArray = {"123", "14", "14", "15", "121"};
		
		sort.sortString(stringArray);
		
		for(String s : stringArray) {
			System.out.print(s + " ");
		}
	}
}
