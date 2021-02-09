import java.util.Scanner;

public class operate {
    public static Scanner sc = new Scanner(System.in);
    static String[] Str_arr;

    public static void main(String[] args)
    {
        input();
        handle();
        output();
    }

    public static void input()
    {
        System.out.println("Program:Please input array.");
        System.out.print("User:");
        Str_arr = String_input();

        /*//测试String_input()方法能否正常输入
        System.out.println("!test start!");
        for(String s:Str_arr)
        {
            System.out.print(s+" ");
        }
        System.out.println("\n!test end!");
        //*/
    }

    public static String[] String_input()//这是一个不需要先给定字符串数组长度就能直接输入字符串数组的方法
    {
        String Str = sc.nextLine();//输入字符串Str
        Str = Str.trim();//去掉字符串Str首尾的空格
        //System.out.println(Str);
        return Str.split("\\s+");//根据空白字符分割字符串Str
    }

    public static void handle()
    {
        Str_arr[2] = "bb";
    }

    public static void output()
    {
        for(String s:Str_arr)
        {
            System.out.print(s+" ");
        }
    }
}

