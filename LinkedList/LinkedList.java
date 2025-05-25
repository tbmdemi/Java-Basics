import java.util.Scanner ;

public class LinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng nốt : ");
        int num = sc.nextInt();

        System.out.print("Nhập số node :");
        for(int i = 0; i < num; i++){
            int value = sc.nextInt();
            list.endNode(value);
        }

        System.out.print("Vẽ Linked List : ");
        list.printLinkedList();

        System.out.print("Nhập vị trí :");
        int pos = sc.nextInt();
        System.out.print("Nhập giá trị :");
        int val = sc.nextInt();

        if (pos > num) System.out.println("Lỗi");
        else {
            list.insertNode(pos, val);
            System.out.print("Vẽ Linked List :");
            list.printLinkedList();
        }

    }
}
