import java.util.Scanner;

public class operate
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x;
        do {
            System.out.println("请输入一个整数x");
            x=sc.nextInt();

            if(x%2==0) System.out.println("x是偶数");
            else if(x%2==1) System.out.println("x是奇数");
        }while(x!=-1);
    }
}
