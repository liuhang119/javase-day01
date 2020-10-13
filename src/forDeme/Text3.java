/**
 * 在屏幕上打印出n行的金字塔图案，如，若n=5,则图案如下：
 *         *
 *        ***
 *       *****
 *      *******
 *     *********
 * 拓展：打印输出
 * 			A
 * 		   BBB
 * 		  CCCCC
 * 	     DDDDDDD
 * 	    EEEEEEEEE
 *
 */

package forDeme;

import java.util.Scanner;

public class Text3 {
    public static void main(String[] args) {
        System.out.println("请输入金字塔行数");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int a;   /**当前行数*/
        int b;   /**字符个数*/
        int c;   /**空格个数*/

        for (a = 1; a <= n; a++) {
            for (c = 1; c <= n-a; c++) {
                System.out.print(" ");
            }


            for (b = 1; b <= 2 * a - 1; b++) {
                //System.out.print("*");  输入*号
                char ch=(char)(64+a);
                System.out.print(ch);    /** ASCII码*/


            }
            System.out.print("\n");
        }
    }
}