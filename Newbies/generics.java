import java.util.ArrayList;

class Dabba<Y> {
    ArrayList<Y> StackList = new ArrayList<>();
    public void kudu(Y element) {
        StackList.add(element);
    }

    public void edu(Y element) {
        StackList.remove(element);
    }

    public void lastlaEduu() {
        StackList.remove(StackList.size() - 1);
    }
}

class QueueeVarusai<Y> {
    ArrayList<Y> QueueList = new ArrayList<>();

    public void nillu(Y element) {
        QueueList.add(element);
    }

    public void vaa() {
        Y aal = QueueList.get(0);
        QueueList.remove(0);
        System.out.println("The item came out is "+aal);
    }
}

public class generics<Y> {

    public static void main(String[] args) {
        Dabba<String> object = new Dabba<String>();
        object.kudu("puffs");
        object.kudu("Nabati");
        object.kudu("Too Yumm");
        // object.eduu("puffs");
        object.lastlaEduu();
        System.out.println(object.StackList);
        QueueeVarusai<Integer> object2 = new QueueeVarusai<Integer>();
        object2.nillu(2);
        object2.nillu(3);
        object2.nillu(4);
        object2.nillu(5);
        // object2.lastlaEduu();
        object2.vaa();
        System.out.println(object2.QueueList);

    }
}
