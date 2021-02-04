import java.util.Scanner;

public class operate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Program:please input a String, then I will add number to it.");
        StringBuilder str=new StringBuilder(sc.next());
        for(int i=1;i<=10;i++) {
            str.append(i);
            System.out.println(str);
        }
    }
}