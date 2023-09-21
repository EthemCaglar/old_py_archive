import java.util.Arrays;

public class ArrayClosest {
    public static void main(String[] args) {
        int[] numbers = {15,12,788,1,-1,-778,2,0};
        int chosen = 5;
        int[] numbersBackup = Arrays.copyOf(numbers,8);
        int closestLeft;
        int closestRight;

        Arrays.sort(numbersBackup);

        for(int u = 0 ; u < numbers.length-1 ; u++){
            if (numbersBackup[u] > chosen){
                closestRight = numbersBackup[u];
                closestLeft = numbersBackup[u-1];
                System.out.println("Girilen sayıdan küçük en yakın sayı : " + closestLeft);
                System.out.println("Girilen sayıdan büyük en yakın sayı : " + closestRight);
                break;
            }
        }
    }
}