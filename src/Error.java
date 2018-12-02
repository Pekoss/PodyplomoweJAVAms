public class Error {

    public static void main(String[] args) {
        int i = 9999999;
        try {
            long[][][] arr = new long[i][i][i];
        }catch (OutOfMemoryError error){
            System.out.println("ERROR");
            System.out.println(error.getMessage());
        }

    }
}
