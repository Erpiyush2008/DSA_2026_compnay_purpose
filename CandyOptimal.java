import java.util.Arrays;

public class CandyOptimal {

    public static int candy(int[] ratings) {

        int n = ratings.length;

        int[] candies = new int[n];

        // Step 1 : Give 1 candy to everyone
        Arrays.fill(candies, 1);

        // Step 2 : Left -> Right
        for (int i = 1; i < n; i++) {

            if (ratings[i] > ratings[i - 1]) {

                candies[i] = candies[i - 1] + 1;
            }
        }

        // Step 3 : Right -> Left
        for (int i = n - 2; i >= 0; i--) {

            if (ratings[i] > ratings[i + 1]) {

                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Step 4 : Total Candies
        int sum = 0;

        for (int candy : candies) {
            sum += candy;
        }

        return sum;
    }

    public static void main(String[] args) {

        int ratings[] = {1,0,2};

        System.out.println(candy(ratings));
    }
}