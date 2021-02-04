import java.util.Scanner;

public class operate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Program:input " + '"' + "end" + '"' + " if you want to end this loop");
        String str1,str2;
        do {
            System.out.println("Program:please input String1");
            str1=sc.next();
            if(str1.equals("end")) {
                break;
            }
            System.out.println("Program:please input String2");
            str2=sc.next();
            if(str1.compareTo(str2)==0) {
                System.out.println("Program:String1 and String2 are the same.");
            }
            else if(str1.compareTo(str2)!=0) {
                System.out.println("Program:String1 and String2 are not the same.");
            }
        }while(true);
    }
}