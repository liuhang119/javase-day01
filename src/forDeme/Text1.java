/**
三种循环求1~100的偶数和。
*/
package forDeme;

public class Text1 {
    public static void main(String[] args) {

        int sum1=0;
        for(int i1=1;i1<=100;i1++){
            if (i1%2==0){
                sum1+=i1;
            }
        }
        System.out.println("结果是："+sum1);

        System.out.println("==================================");



int sum2=0;
   int i2=1;
   while(i2<=100){
       if (i2%2==0){
           sum2+=i2;
       }
       i2++;
   }


        System.out.println("结果是："+sum2);

        System.out.println("==================================");

        int sum3=0;
        int i3=1;
        do {
            if (i3%2==0){
                sum3+=i3;
            }
            i3++;
        }while(i3<=100);

        System.out.println("结果是："+sum3);
    }
}
