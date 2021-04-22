package JavaBasic1;

public class TwoDarrayPractice {
    public static void main(String[] args) {
        int[][] lotteryCard = { {20 , 15, 7},
                {8, 7, 19},
                {7, 13, 47}
        };

        int [][] lotteryCard2 = new int[3][3];
        lotteryCard2[0][0] = 20;
        lotteryCard2[0][1] = 15;

        for(int i = 0; i<3 ; i++){
            for (int j = 0; j<3; j++){
                System.out.println(lotteryCard[i][j]);
            }
        }
    }
}
