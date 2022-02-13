//================== CLL class =========================
class CLL {
    // ----------------------- Node --------------------
    private class Node {
        private int element;
        private Node next;

        // constructor
        public Node(int data) {
            element = data;
            next = null;
        }

        // link a new node to this node
        public void link(Node newNode) {
            next = newNode;
        }

        // return next node
        public Node getNextNode() {
            return next;
        }

        // return element of this node
        public int getElement() {
            return element;
        }
    }
    // --------------------- End Node --------------------

    // CLL properties and methods
    private Node tail = null;
    private int size = 0; // SLL's size

    public void addFirst(int data) {

        Node newNode = new Node(data);

        if (size == 0)
        {
            tail = newNode;

        }

        else
        {
            newNode.link(tail.getNextNode());
        }

        tail.link(newNode);
        size++;


    }

    public void addLast(int data) {

        Node newNode = new Node(data);

        if (size == 0)
        {
            tail = newNode;

        }

        else
        {
            newNode.link(tail.getNextNode());
        }

        tail.link(newNode);
        tail = newNode;
        size++;


    }

    public void removeFirst() {


        if(size == 1)
        {

            tail = null;

        }

        else
        {
            Node pointer = tail.getNextNode();

            tail.link(pointer.getNextNode());
            pointer.link(null);
        }

        size--;


    }

    public void removeLast() {

        if(size == 1)
        {
            tail = null;
            size--;
        }

        else if(size > 1)
        {
            Node pointer = tail.getNextNode();

             while (pointer.getNextNode() != tail)
                {
                    pointer = pointer.getNextNode();
                }               
                pointer.link(tail.getNextNode());
                tail.link(null);
                tail = pointer;
                size--;
        }


    }

    public void rotate() {

        if(size>1)	{
            tail	=	tail.getNextNode();
        }


    }

    public void print() {

        if (size == 0) {
            System.out.println("Empty linked list");
        }

        else {

            Node pointer = tail.getNextNode();

            System.out.print("->");

            while ( pointer != tail)
            {
                System.out.print(pointer.getElement() + "->");
                pointer = pointer.getNextNode();
            }

            System.out.println(tail.getElement()+ "->");

//            System.out.println("");
        }


    }
}
