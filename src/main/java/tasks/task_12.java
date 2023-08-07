package tasks;

/*
 * 12. Определить наличие цикла в односвязном списке.
 * */
public class task_12 {
    public static void main(String[] args) {
        Node<Integer> first = new Node<>();
        Node<Integer> two = new Node<>();
        Node<Integer> third = new Node<>();
        Node<Integer> four = new Node<>();
        Node<Integer> five = new Node<>();

        first.next = two;
        two.next = third;
        third.next = four;
        four.next = five;
        //five.next = third;

        System.out.println(hasCycle(first));
    }

    private static class Node<T> {
        T value;
        Node<T> next;
    }

    public static boolean hasCycle(Node first) {
        Node turtle = first;
        Node hare = first;

        while (hare != null && hare.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;
            if (turtle == hare) {
                return true;
            }
        }
        return false;
    }
}
