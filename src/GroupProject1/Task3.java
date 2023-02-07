package GroupProject1;

public class Task3 {
    public static void main(String[] args) {
    int[][] num = {{11, 12, 13, 14, 15}, {1, 2, 3, 4, 5}};
    int sum = 0;
    for (int i = 0; i < num.length; i++) {
        for (int j = 0; j < num[i].length; j++) {
            sum += num[i][j];
        }

    }
    System.out.println("Sum of all numbers is " + sum);
}
}


