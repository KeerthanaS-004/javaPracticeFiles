package vendorTraining.Tree;

public class bsl {
    static class bsTree {
        int value;
        bsTree left;
        bsTree right;

        bsTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
        bsTree root;
        public bsTree insert(bsTree root, int value) {
            if (root == null) {
                return new bsTree(value);
            }
            if (value < root.value) {
                root.left = insert(root.left, value);
            } else if (value > root.value) {
                root.right = insert(root.right, value);
            }
            return root;
        }

        public void inorder(bsTree root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.value + "->");
            inorder(root.right);
        }
        public boolean search(bsTree root, int value) {
            /* recursive approach
            if (root == null) {
                return false;
            }
            if (value == root.value) {
                return true;
            }
            if (value < root.value) {
                return search(root.left, value);
            }
            return search(root.right, value);*/
            //iterative approach
            while(root != null) {
                if (value == root.value) {
                    return true;
                } else if (value < root.value) {
                    root = root.left;
                } else {
                    root = root.right;
                }
            }
            return false;
        }

        public void travel_leaf(bsTree root) {
            if (root == null) {
                return;
            }
            if(root.left == null && root.right == null) {
                System.out.print(root.value + " ");
            }
            travel_leaf(root.left);
            travel_leaf(root.right);
        }
        public int countLeaf(bsTree root) {
            if (root == null) {
                return 0;
            }
            if(root.left == null && root.right == null) {
                return 1;
            }
            return countLeaf(root.left) + countLeaf(root.right);
        }
        public int min_leaf(bsTree root) {
            int min = root.value;
            while(root.left != null) {
                min = root.left.value;
                root = root.left;
            }
            return min;
        }
        public bsTree del(bsTree root, int pos) {
            if (root == null) {
                return null;
            }
            if(pos < root.value){
                root.left = del(root.left, pos);
            }
            else if(pos > root.value){
                root.right = del(root.right, pos);
            }
            else{
                if(root.left == null && root.right == null) {
                    return null;
                }
                if(root.left == null){
                    return root.right;
                }
                if(root.right == null){
                    return root.left;
                }
                int successor = min_leaf(root.right);
                root.value = successor;
                root.right = del(root.right, successor);
            }
            return root;
        }

    }
        public static void main(String[]args){
            bsTree root = new bsTree(8);
            root.insert(root, 3);
            root.insert(root, 10);
            root.insert(root, 1);
            root.insert(root, 6);
            root.insert(root, 7);
            root.insert(root, 14);
            root.inorder(root);
            System.out.println();
            root.travel_leaf(root);
            System.out.println();
            System.out.println("Count of leaf nodes : "+ root.countLeaf(root));
            root.del(root, 6);
            System.out.println();
            root.inorder(root);
            System.out.println();
            System.out.println(root.search(root, 7));
        }
}
