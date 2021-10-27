package varialble.learning;
public class Binary {
    public static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

        public Node root;

        public Binary() {
            root = null;
        }

    public void insert(int data) {
        Node r = new Node(data);

        if (root == null) {
            root = r;
            return;
        } else {
            Node current = root, parent = null;

            while (true) {
                parent = current;

                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = r;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = r;
                        return;
                    }
                }
            }
        }
    }

        public Node x (Node root) {
            if (root.left != null)
                return x(root.left);
            else
                return root;
        }

    public void inorderTraversal(Node node) {


        if(root == null){
            System.out.println("Tree is empty");
            return;
        }
        else {

            if(node.left!= null)
                inorderTraversal(node.left);
            System.out.print(node.data + " ");
            if(node.right!= null)
                inorderTraversal(node.right);

        }
    }


    public static void main(String[] args) {
        Binary a = new Binary();
        a.insert(50);
        a.insert(3);
        a.insert(26);
        a.insert(43);
        a.insert(23);
        a.insert(32);
        a.insert(11);
        System.out.println("Binary search tree after insertion:");

        a.inorderTraversal(a.root);

    }
}



