public class AmericanFlag {

    public static void main(String[] args) {
        int rows = 9;
        int columns = 30;

        printAmericanFlag(rows, columns);
    }

    public static void printAmericanFlag(int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if ((i < rows/2) && (j<columns/4))
                    System.out.print("* ");
                else if ((i >= rows/2) && (j<columns/3))
                    System.out.print("==");
                else 
                    System.out.print("=");

            }
            System.out.println("");
            //System.out.println("==============================================");
        }

        //for (int i = 0; i < 6; i++) {
        //    System.out.println("==========================================================");
        //}
    }
}
