package L10.ColectiileJava;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        //ordinea este ca la caserie primul venit priml servit
        java.util.Queue<String> coada=new LinkedList<>();
        coada.add("unu");
        coada.add("doi");
        coada.add("trei");
        System.out.println(coada.peek()+"primul element");
        System.out.println(coada.poll()+"sterge primul element");
        System.out.println(coada);

        /*//deque
        As its subclass, the Stack class is synchronized as well.

        On the other hand, the Deque interface is not thread-safe.

        So, if thread-safety is not a requirement, a Deque can bring us better performance than a Stack.

*/
        java.util.Deque<String> coada1=new LinkedList<>();
        coada1.add("unu");
        coada1.add("doi");
        coada1.add("trei");
        System.out.println(coada1.peekFirst()+"primul element");
        System.out.println(coada1.pollLast()+"sterge ultimul element");
        System.out.println(coada1.removeLast()+"sterge ultimul element");
        System.out.println(coada1);



    }
}
