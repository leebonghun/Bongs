package PRC;

public class PRC_20231123_2 {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];
        for(int i=0 ; i<mathScores.length; i++){
            for(int j=0; j<mathScores[i].length; j++){
                System.out.println("mathScores["+i+"]["+j+"]="+mathScores[i][j]);
            }
        }

        int[][] javaScores = {{95,80},{100,78,50}};
        System.out.println(javaScores[0][0]);
        System.out.println(javaScores[0][1]);
        System.out.println(javaScores[1][0]);
        System.out.println(javaScores[1][1]);
        System.out.println(javaScores[1][2]);
        for(int z=0; z<javaScores.length; z++){
            for(int x=0; x<javaScores[z].length; x++){
                System.out.println("JavaScores["+z+"]["+x+"]="+javaScores[z][x]);
            }
        }

    }
}
