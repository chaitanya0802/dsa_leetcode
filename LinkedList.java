public class LinkedList {

    Node head = null;

    //define node
    class Node{
        int data;
        Node next;

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    //create head node by initializing linked list
    public LinkedList(int data){
        head = new Node(data, null);
    }


    //to append node
    public void appendNode(int data){
        Node currnode = head;

        while (currnode.next != null){
            currnode = currnode.next;
        }

        Node n1 = new Node(data, null);
        currnode.next = n1;
    }

    //print ll
    void display(){
        Node currnode = head;

        while(currnode.next != null){
            System.out.println(currnode.data);
            currnode = currnode.next;
        }
    }

    // to return the index of data
    int search(int data){
        Node currnode = head;
        int index = 0;

        while (currnode.data != data) {
            currnode = currnode.next;
            index++;
        }

        return index;
    }

    public static void main(String[] args){
        LinkedList l1 = new LinkedList(3);

        l1.appendNode(4);
        l1.appendNode(7);
        l1.appendNode(14);
        l1.appendNode(45);
        l1.appendNode(47);
        l1.appendNode(42);

        l1.display();

        System.out.print("index of 14 is: " + l1.search(14));

    }
}
