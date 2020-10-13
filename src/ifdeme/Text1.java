/**
 * 1.需求：if示例,从键盘接收两个数字,再接收一个符号,然后进行运算
 * -------请输入第一个数字:8
 * -------请输入第二个数字:9
 * -------请输入运算符号:+
 * -------8+9=17
 */


package ifdeme;

import java.util.Scanner;

public class Text1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("请输入第一个数：");
        int a=scan.nextInt();
        System.out.println("请输入第二个数：");
        int b=scan.nextInt();
        System.out.println("请输入运算符：");
       String str=scan.next();

       if(str.equals("+")){
           System.out.println("a+b="+(a+b));
       }else if(str.equals("-")){
           System.out.println("a-b="+(a-b));
       }else if(str.equals("*")){
           System.out.println("a*b="+(a*b));
       }else if(str.equals("/")){
           System.out.println("a/b="+(a/b));
       }else if(str.equals("%")){
           System.out.println("a%b="+(a%b));
       }




    }

}
