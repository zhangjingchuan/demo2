package com.example.demo2;

public class PrimeTest {

    public static void main(String[] args) {
        prime3(2);
    }

    private static void prime3(int mun){
        boolean isPrime = true;
        //小于等于1的数不是素数
        if ( mun <= 1) {
            isPrime = false;
        }
        //2是素数，从2开始判断
        for( int i = 2; i< mun; i++) {
            //没有余数即不是素数
            if(mun % i ==0) {
                isPrime = false;
                break;
            }
        }
        if( isPrime) {
            System.out.println(mun +"是素数");
        }
        else {
            System.out.println(mun+ "不是素数");
        }
    }

    private static void prime2(int num){
        boolean isPrime = true;
        if (num > 0) {
            int k = (int) Math.sqrt(num);//k为num的正平方根，取整数
            for (int i = 2; i <= k; i++) {
                if (num % i == 0) {
                    isPrime = false;//不是素数
                    break;
                }
            }
        }else{
            System.out.println("负数不为素数");
            return;
        }
        if (isPrime) {
            System.out.println(num + "是素数");
        } else {
            System.out.println(num + "不是素数");
        }

    }

    /**
     * 求质数100以内
     */
    private static void prime(){
        //1不是质数
        for(int i=2;i<=1000;i++){
            boolean flag = true;
            for(int j = 2;j < i;j++){
                if(i % j==0){
                    flag = false;
                    break;//到了1000内的质数，就跳出循环，并输出结果。
                }
            }
            if(flag){
                System.out.println(" "+i);
            }
        }
    }
}
