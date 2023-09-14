public class AsalSayilar {
 
    public static void main(String[] args) {
    
        //int sayac = 0;
        for(int i = 2 ; i <= 100 ; i++){
            int asallık = 0;   
            for (int j = 2; j < i; j++){
               if (i % j == 0){
                    asallık = 1;
                    break;
                }
            }
            if(asallık==0){
                System.out.print(i + " ");
            }
        }
    }    
}