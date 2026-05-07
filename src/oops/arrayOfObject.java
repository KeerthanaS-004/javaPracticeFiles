package oops;

class students{
    int marks;
    String name;
}

public class arrayOfObject {
    static void main(String[] args) {
        students s1 =  new students();
        s1.name = "conrad";
        s1.marks = 86;

        students s2 =  new students();
        s2.name = "jeremey";
        s2.marks = 90;

        students s3 =  new students();
        s3.name = "lily";
        s3.marks = 80;

        students arr[] = new students[3];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
/*        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i].name + " : " + arr[i].marks);
        }*/
        for(students s: arr){
            System.out.println(s.name + " : " + s.marks);
        }
    }

}
