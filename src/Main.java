public class Main {
    public static final int SIZE = 5; //field size
    public static final int EMPTY = 0; //filling empty cells
    public static void main(String[] args) {
        int[][] field = new int[SIZE][SIZE];
        fill(field);

        int[][] agents = { {1, 4}, {0, 1}, {4, 2}, {4, 3}, {4, 3}, {0, 1}, {0, 2}, {4, 3} };
        int[][] result = pandemic(field, agents);

        print(result);
    }
    public static int[][] pandemic(int[][] field, int[][] agents) {
        for (int[] agent : agents) {
            int firstCoordinate = agent[0];
            int secondCoordinate = agent[1];
            if (field[firstCoordinate][secondCoordinate] == EMPTY) {       //method to fill the chart with our data
                field[firstCoordinate][secondCoordinate] = 1;
            } else {
                field[firstCoordinate][secondCoordinate] = field[firstCoordinate][secondCoordinate] * 2;
            }
        }
        return field;
    }
    public static void print(int result[][]){
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {          //method for create a chart and output it
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void fill(int[][] field) {
        for (int i = 0; i < SIZE; i++) {                       //method for filling the chart with initial values
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY;
            }
        }
    }
}