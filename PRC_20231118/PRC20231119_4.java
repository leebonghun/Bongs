package PRC_20231118;

import java.util.Scanner;

public class PRC20231119_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("모양을 입력해주세요: ");
        String input = sc.next();

        for (int i = 1; i <= 5; i++) {
            for(int j=0; j<i; j++){
                System.out.print(input);
            }
            System.out.println();




        }

    }
}
