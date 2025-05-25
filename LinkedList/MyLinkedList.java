public class MyLinkedList {
    // Khai bao
    public static class Node {
        int value;
        Node next;

        Node (int value) {
            this.value = value;
            this.next = null;
        }
    }

    private static Node head;
    private static int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    // print
    public static void printLinkedList() {
        if (head == null) System.out.println("empty");
        else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                if (temp.next != null){
                    System.out.print("->");
                }
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static Node addNode(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        size ++;
        return node;
    }

    public static Node endNode(int value){
        Node newNode = new Node(value);

        if (head == null ){
            head = newNode;
            return newNode;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
        size++;
        return newNode;
    }

    public static void insertNode (int position, int value){
        Node node = new Node(value);

        if (head == null) return;
        Node curr = head;
        for(int i = 0; i < position - 1; i++){
            curr = curr.next;
        }
        node.next = curr.next;
        curr.next = node;
    }
}