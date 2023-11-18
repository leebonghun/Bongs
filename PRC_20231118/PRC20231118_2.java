package PRC_20231118;

import java.util.Scanner;

public class PRC20231118_2 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;

        /*if (num == 1) {
            System.out.println("주사위 1");
        } else if (num == 2) {
            System.out.println("주사위 2");
        } else if (num == 3) {
            System.out.println("주사위 3");
        } else if (num == 4) {
            System.out.println("주사위 4");
        } else if (num == 5) {
            System.out.println("주사위 5");
        } else {
            System.out.println("주사위 6");
        }*/
        switch(num){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("6");
                break;
        }

        int lotto[] = new int[6]; //6개의 집을 생성
        System.out.print("로또번호: ");
        for (int i = 0; i < lotto.length; i++) {
            int lottoNum = (int) (Math.random() * 45) + 1; //로또번호 6자리 생성
            lotto[i] = lottoNum; //6개의 집에 6개 숫자 각각 랜덤으로 집어넣기
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) { //6 5 4 3  순으로 오다가 0이되면 break;
                    i--;
                    break;
                }
            }
            System.out.print(lotto[i] + " ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 작성해주세요: ");
        String name = sc.next();

        System.out.println("이름은 : "+name+"입니다");





    }
}
