package GroupProject1;

public class Task5 {
    public static void main(String[] args) {
    int[][] num = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
    int sum1 = 0;
    int sum2 = 0;
    for (int i = 0; i < num.length; i++) {
        for (int j = 0; j < num[i].length; j++) {
            if ((num[i][j]) % 2 == 0) {
                sum1 += num[i][j];
            } else {
                sum2 += num[i][j];
            }
        }
    }
    System.out.println("Sum of even numbers  " + sum1);
    System.out.println("Sum of  odd numbers  " + sum2);

}
}

