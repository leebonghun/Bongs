package PRC_20231118;

import java.util.Scanner;

public class PRC20231119_3 {
    public static void main(String[] args) throws Exception {
        /*1부터 100까지 3의 배수의 합*/
        int sum = 0;
        for(int i=3; i<=100; i +=3){
            sum +=i;
        }
        System.out.println(sum);
        
        /* while ,math 랜덤 함수 이용 주사위 눈의 합이 5면 멈춤*/
        while(true){
            int x = (int)(Math.random()*5)+1;
            int y = (int)(Math.random()*5)+1;
           if(x+y !=5){
               System.out.println("("+x+"," + y + ")");
               continue;
           }
        }

        /* 별 삼각형*/
    }
}
