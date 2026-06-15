package vendorTraining.Tree;

public class bsTree {
    static class tree {
        //tree oda template
        int value;
        tree left;
        tree right;

        //user kudukra value ah const la pass panrom
        tree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        //global ah declare panrom
        tree root; //starting position , root la irundhu dha check pannanum

        public void inorder(tree root) {
            if (root == null) {
                return; //sop podlam but , naama first left side traversel mudichitu odane empty nu print aidum, that is right kku poradhuku munnadiye
            }
            inorder(root.left); //method ku ulla kudutha argument
            System.out.print(root.value + "-->");
            inorder(root.right);
            //those three lines called as recursion
        }

        public void preorder(tree root) {
            if (root == null) {
                return;
            }
            System.out.print(root.value + "-->");
            preorder(root.left);
            preorder(root.right);
        }

        public void postorder(tree root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.value + "-->");
        }

        public static void main(String[] args) {
            tree root = new tree(25);
            root.left = new tree(20);
            root.right = new tree(36);
            root.left.left = new tree(10);
            root.left.right = new tree(22);
            root.left.left.left = new tree(5);
            root.left.left.right = new tree(12);
            root.right.left = new tree(30);
            root.right.right = new tree(40);
            root.right.left.left = new tree(28);
            root.right.right.right = new tree(48);
            root.right.right.left = new tree(38);
            root.inorder(root);
            System.out.println();
            root.preorder(root);
            System.out.println();
            root.postorder(root);
        }

    }
}
