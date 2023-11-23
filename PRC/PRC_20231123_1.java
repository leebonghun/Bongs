package PRC;

public class PRC_20231123_1 {
    public static void main(String[] args) {
        int[] score = {10,20,30};
        int sum = 0;
        for(int i=0; i<score.length; i++){
            sum += score[i];
        }
        System.out.println(sum);

        double avg  = (double) sum / score.length;

        System.out.println(avg);
    }
}
