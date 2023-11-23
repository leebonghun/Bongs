package PRC;

public class PRC_20231123 {
    public static void main(String[] args) {
        int[] scores = {93,80,91};

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);

        int sum = 0;
        for (int i=0; i<3; i++){
            sum += scores[i];
        }
        System.out.println(sum);

        double avg =(double) sum /3 ;
        System.out.println(avg);


    }
}
