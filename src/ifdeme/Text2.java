/**
 * 2.需求：飞机票在淡季是有优惠政策的,而放假期间是没有优惠的，
 * 假设在元旦三天（1.01---1.03），
 * 五一三天（5.01---5.03），
 * 十一七天（10.01---10.07）无任何优惠，
 * 除了以上13天，都打8折， 请输入您哪天订票，以及票价（自己设定一个吧），
 * 输出应付多少钱？
 */


package ifdeme;

import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入订票日期：");
        double date=scan.nextDouble();
        System.out.println("请输入票价：");
        double price=scan.nextDouble();

        if((date>=1.01&&date<=1.03)||(date>=5.01&&date<=5.03)||(date>=10.01&&date<=10.07)){
            System.out.println("票价为："+price+"￥");
        }else{
            System.out.println("票价为："+0.8*price+"￥");
        }

    }
}
