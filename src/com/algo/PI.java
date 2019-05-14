package com.algo;

/**
 * ClassName: PI
 * Description: 求PI的值
 * date: 2019\5\15 0015 1:14
 *
 * @author JieKaMi
 * @since JDK 1.8
 */
public class PI {

    public static void main(String[] args) {
        int ck = 500; //长方形的长宽
        int N = 1000000000; //测试数
        getPi(ck,N);


    }
    public static void getPi(int ck,int N){
        int r = ck / 2; //半径
        int yesPoint = 0;   //圆里面的值
        for (int i = 0; i < N; i++) {
            //产生随机坐标
            int x = (int)(Math.random() * ck);
            int y = (int)(Math.random() * ck);
            // 判断该坐标是否在圆里面
            if((Math.pow((x-r),2)+Math.pow((y-r),2) <= Math.pow(r,2))){
                yesPoint++;
//                System.out.println(yesPoint);
            }
            //根据公式计算出P
            double p = (double)yesPoint * 4 /i;
            System.out.println(p);
        }

    }
}
