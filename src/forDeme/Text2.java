/**
 * 猜数字的游戏(GuessNumber)
 * 游戏运行时产生一个1－100之间的随机整数，要求用户从控制台输入数字，
 * 若输入的数字比产生的数字小，则输出：“太小了，再大一点！”；
 * 若输入的数字比产生的数字大，则输出：“太大了，再小一点！”，
 * 若输入的数字和产生的数字相等，则输出：“恭喜你猜对了！”，
 * 若用户猜了7次还未猜对，则输出：“你太笨了，下次再来吧！”然后退出程序。
 * 提示：
 * (1)、int num=(int)(Math.random()*100); //java.lang.Math;
 * (2)、Scanner scan=new Scanner(System.in); // java.util.Scanner;
 * int a = scan.nextInt();
 */

package forDeme;

import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < 7; i++) {
            System.out.println("请输入一个数：");
            int a = scan.nextInt();
            int num = (int) (Math.random() * 100);
            System.out.println("随机数" + num);
            if (a < num) {
                System.out.println("太小了，在大一点！");
            } else if (a > num) {
                System.out.println("太大了，在小一点！");
            } else {
                System.out.println("恭喜你猜对了");
            }

        }
        System.out.println("你太笨了，下次再来吧！");


    }
}
