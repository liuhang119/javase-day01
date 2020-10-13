/**
 * 3.需求：应征入伍： 条件：男，身高170厘米以上，20--26周岁
 * 女，身高162厘米以上，20---22周岁之间
 * 从键盘输入性别，年龄以及身高，判断是否可以应征入伍！
 */
package ifdeme;

import java.util.Scanner;

public class Text3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入性别：");
        String sex=scan.next();
        System.out.println("请输入年龄：");
        int age=scan.nextInt();
        System.out.println("请输入身高：");
        double height=scan.nextDouble();

        if (sex.equals("男")){
            if(age>=20&&age<=26){
                if(height>=170.0){
                    System.out.println("可以入伍！");
                }else{
                    System.out.println("不可以入伍！");
                }


            }else{
                System.out.println("不可以入伍！");
            }
        }else{

                if (age>=20&&age<=22){
                    if(height>=162.0){
                        System.out.println("可以入伍！");
                    }else{
                        System.out.println("不可以入伍！");
                    }
                }else{
                    System.out.println("不可以入伍！");
                }
            }

    }
}
