import java.util.Scanner;

public class operate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int key;
        String str;
        Loop1: do {
            System.out.println("input a String");
            str=sc.next();

            System.out.println("input 1 to use method toUpperCase");
            System.out.println("input 2 to use method toLowerCase");
            System.out.println("input -1 to end this Loop");
            key=sc.nextInt();
            switch(key) {
                case 1: str=str.toUpperCase();break;
                case 2: str=str.toLowerCase();break;
                case -1:break Loop1;
                default: System.out.println("input error");break;
            }
            System.out.println(str);
        }while(true);
    }
}