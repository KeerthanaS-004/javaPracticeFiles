package strings;

public class rotationOfString {
    static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "cdefab";
        rotate(s1,s2);
    }
    static void rotate(String s1, String s2) {
        String s3 = s1.concat(s1); //abcdefabcdef
        if(s3.contains(s2)){
            System.out.println("Array is rotated");
        }
        else{
            System.out.println("Array is not rotated");
        }
    }
}