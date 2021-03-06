import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String a = "12345*+-+";
		Deque<Integer> q = new LinkedList<>();
		for(int i=0;i<a.length();i++){
		  //  System.out.println(q);
		    if(a.charAt(i)>=48 && a.charAt(i)<57){
		        q.addLast(a.charAt(i)-48);
		    }
		    else{
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
		        }
		    }
		}
		System.out.println(q.peek());
	}
}
