package javahw_week6;
/* Write a Java program to display the following pattern.
Sample Pattern :
J a v v a
J a a v v a a
J J aaaaa V V aaaaa
J J a a V a a
 */
public class Program11 {
    public static void main(String[] args) {
        Program11 obj = new Program11();
        obj.javaPattern();
        System.out.println("________________________________");
    }

    //Printing the JAVA pattern
    public void javaPattern(){
        System.out.println("J a v v a");
        System.out.println("J a a v v a a");
        System.out.println("J J aaaaa V V aaaaa");
        System.out.println("J J a a V a a");
    }
}
