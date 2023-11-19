package PRC_20231118;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class PRC20231119_1 {
    public static void main(String[] args) {
        /* 1부터 100까지 덧셈*/
        int sum  =0 ;

        /*for(int i=1; i<=100; i++){
            sum += i;
        }
        System.out.println(sum);
 */
        /*int i=1;

        while(i<=100){
            sum += i;
            i++;
        }
        System.out.println("1부터 "+(i-1) +" 까지의 합: "+sum);*/

        /* 구구단*/
      /*  for(int n=2; n<=9; n++){
            System.out.println(n + " 단");
            for(int m=1; m<=9; m++){
                System.out.println(n + " * " + m + " = " + n*m );
            }
        }*/

        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 q를 입력하세요");
        
        Scanner sc = new Scanner(System.in);
        String input;
       /* do{
            System.out.print(">");
            input = sc.next();
            System.out.println(input);
        } while (! input.equals("q"));*/
        while(true){
            System.out.print(">");
            input = sc.next();
            System.out.print(input);
            System.out.println();

            if(input.equals("q")){
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
