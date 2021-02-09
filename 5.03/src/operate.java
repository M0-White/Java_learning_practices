import java.util.Scanner;

public class operate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String regex = "1(3[0-9] | 5[0-35-9] | 8[05-9])\\d{8}";

        String ph_num;
        do {
            System.out.println("Program:Please input a phone number.");
            ph_num=sc.next();
            if(ph_num.matches(regex)) {
                System.out.println("Program:the phone number you input is right.");
            }
            else if(ph_num.equals("-1")){
                break;
            }
            else {
                System.out.println("Program:the phone number you input is wrong, please input again.");
            }
        }while(true);
    }
}