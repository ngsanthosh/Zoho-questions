import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String a = "12345*+-+";
		Deque<Integer> q = new LinkedList<>();
		for(int i=0;i<a.length();i++){
		        switch(a.charAt(i)){
		            case '+':
		                q.addFirst(q.remove()+q.remove());
		                break;
		            case '-':
		                q.addFirst(q.remove()-q.remove());
		                break;
		            case '*':
		                q.addFirst(q.remove()*q.remove());
		                break;
		            case '/':
		                q.addFirst(q.remove()/q.remove());
		                break;
		            default:
		                if(a.charAt(i)>=48 && a.charAt(i)<57){
            		        q.addLast(a.charAt(i)-48);
            		    }
		        }
		}
		System.out.println(q.peek());
	}
}