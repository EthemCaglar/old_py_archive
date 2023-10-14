import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // FILL ------------------------------------------------------------------------------------

        int[] liste = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(liste, 2);
        System.out.println(Arrays.toString(liste));

        int[] liste2 = {15, 1, 99, 3, 2, -22, 11, 2, -49, 52};

        Arrays.fill(liste2, 3, 5, 7);
        System.out.println(Arrays.toString(liste2));

        // SORT ------------------------------------------------------------------------------------

        int[] listes = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        Arrays.sort(listes);
        System.out.println(Arrays.toString(listes));

        int index = Arrays.binarySearch(listes, 33);
        System.out.println("33'ün indeksi :" + index);

        // COPY ------------------------------------------------------------------------------------

        int[] listec = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        int[] copyArray = Arrays.copyOf(listec, 3);
        System.out.println(Arrays.toString(copyArray));

        int[] copyOfRangeArray = Arrays.copyOfRange(listec, 0,5);
        System.out.println(Arrays.toString(copyOfRangeArray));

        // FOR ----------------------------------------------------------------------------------------

        String[] arabalar = {"BMW", "Mercedes", "Ford", "Ferrari"};
        for (String i : arabalar) {
            System.out.println(i);
        }

        int[][] matris = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
            };

        for (int[] u : matris) {
            for (int elem : u) {
                System.out.println(elem);
            }
        }
    }
}