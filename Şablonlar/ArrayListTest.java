import java.util.*;

public class ArrayListTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();
        ArrayList<ArrayList<Integer> > arrayo = new ArrayList<ArrayList<Integer> >();
        int column;
        int japartize;
        for(int i = 0 ; i < line; i++){
            arrayo.add(new ArrayList<Integer>());
            column = input.nextInt();
            for(int j = 0 ; j < column; j++){
                japartize = input.nextInt();
                arrayo.get(i).add(j, japartize);
            }
        }
        int l;
        int c;
        line = input.nextInt();
        
        for(int i = 0 ; i < line; i++){
            try{
                l = input.nextInt();
                c = input.nextInt();
                System.out.println(arrayo.get(l-1).get(c-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
