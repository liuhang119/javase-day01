/**1.输入学员的考试成绩，输出这学员考试成绩的级别。
        100      A级
        90~99    A级
        80~89    B级
        70~79    C级
        60~69    D级
        < 60     不合格
*/
package switchDeme;

import java.util.Scanner;

public class Text1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入分数：");
        int grades=scan.nextInt();

        switch (grades/10){
            case 10:
                System.out.println("A级");
                break;
            case 9:
                System.out.println("A级");
                break;
            case 8:
                System.out.println("B级");
                break;
            case 7:
                System.out.println("C级");
                break;
            case 6:
                System.out.println("级");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("不及格");
                break;
            default:
                System.out.println("输入错误！");

                break;







        }
    }
}
