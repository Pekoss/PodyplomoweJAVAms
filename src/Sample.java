public class Sample {
    public static void main(String[] args) {
        int[][][] array = {{{1},{1,2,3}},{{1,2},{2,6,7,8,9}}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                        System.out.println("[" + i + "][" + j + "][" + k + "], Wartosc: " + array[i][j][k]);
                }
            }
        }
    }
}
