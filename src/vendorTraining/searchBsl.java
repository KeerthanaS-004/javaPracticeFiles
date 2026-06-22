package vendorTraining;
import java.util.*;
public class searchBsl {
    static class tree {
        int value;
        tree left;
        tree right;

        public tree(int value) {
            this.value = value;
            left = right = null;
        }

        public tree insert(tree root, int value) {

            if (root == null) {
                return new tree(value);
            }
            tree current = root;

            while (true) {
                if (value < current.value) {
                    if (current.left == null) {
                        current.left = new tree(value);
                        break;
                    }
                    current = current.left;
                }
                else {
                    if (current.right == null) {
                        current.right = new tree(value);
                        break;
                    }
                    current = current.right;
                }
            }
            return root;
        }
        public boolean search(tree root, int key) {
            tree current = root;
            while (current != null) {
                if (current.value == key) {
                    return true;
                }
                if (key < current.value) {
                    current = current.left;
                } else {
                    current = current.right;
                }
            }
            return false;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tree helper = new tree(0); // just to call methods
        tree root = null;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            root = helper.insert(root, value);
        }
        int x = sc.nextInt();
        if (helper.search(root, x)) {
            System.out.println("FOUND");
        } else {
            System.out.println("NOT FOUND");
        }
    }
}
