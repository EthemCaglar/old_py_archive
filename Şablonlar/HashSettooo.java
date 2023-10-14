import java.util.*;

public class HashSettooo {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> hashee = new HashSet();
        String hashure;
        for(int i = 0 ; i < pair_left.length; i++){
            hashure = pair_left[i] + " " + pair_right[i];
            hashee.add(hashure);
            Iterator<String> j=hashee.iterator();
            while(j.hasNext()){  
                System.out.println(j.next());  
            }  
            System.out.println(hashee.size());
        }
        
           
    }
}