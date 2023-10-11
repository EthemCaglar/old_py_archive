import java.util.Scanner;
public class Try_Catch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] Arrayo = {1,3,4,6,8,13,15,18,25,29};

        try{
            while(true){
                int g = input.nextInt();
                System.out.println(Arrayo[g]);
            }
        }catch(Exception e){
            System.out.println("Sınırı aşma...");
        }
    }
}
