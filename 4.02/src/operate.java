import java.util.Scanner;

public class operate
{
    public static void main(String[] args) //主方法
    {
        Scanner sc = new Scanner(System.in); //输入设置
        
        String graph; //定义用于构成菱形的符号
        int lnNum; //定义变量棱形行数lnNum
        System.out.println("Program:请输入一个字符作为构成棱形元素"); //输出提示
        System.out.print("User:");
        graph = sc.next();
        System.out.println("Program:请输入一个奇数作为棱形的行数"); //输出提示
        System.out.print("User:");
        do { //对输入的lnNum进行判断并且报错后重新输入
            lnNum = sc.nextInt(); //控制台输入变量lnNum
            if(lnNum >= 1 && lnNum % 2 != 0) //当输入的lnNum合法时跳出当前循环
            {
                break;
            }
            System.out.println("Program:您输入的数字有误，请重新输入"); //当输入的lnNum不合法是报错
            System.out.print("User:");
        }while(lnNum < 1 || lnNum % 2 == 0); //当输入的lnNum不合法是不断执行此循环

        for(int i = 1; i <= (lnNum-1) / 2; i++) //for循环输出菱形前面的一半
        {
            for(int j = 1; j <= (lnNum+1) / 2 - i; j++)
            {
                System.out.print("  "); //输出数量为(lnNum+1)/2-i的“  ”
            }
            for(int k = 1; k<= (i-1) * 2 + 1; k++) //输出数量为(i-1)*2+1的“* ”
            {
                System.out.print(graph+" ");
            }
            System.out.println(); //每输出一行进行一次换行
        }

        for(int i = 1; i <= lnNum; i++) //输出棱形最长的一行
        {
            System.out.print(graph+" ");
        }
        System.out.println(); //换行

        for(int i = 1; i <= (lnNum - 1) / 2; i++) //输出棱形的下半部分
        {
            for(int j = 1; j <= i; j++) //输出数量为i“  ”
            {
                System.out.print("  ");
            }
            for(int k = 1; k <= lnNum - 2 * i; k++) //输出数量为lnNum-2*i的“* ”
            {
                System.out.print(graph+" ");
            }
            if(i == (lnNum - 1) / 2)
            {
                break; //防止在最后输出多余的空行
            }
            System.out.println(); //换行
        }
    }
}
