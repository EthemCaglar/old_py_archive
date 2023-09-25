public class MatrisTranspoz {
    public static void main(String[] args) {
        int[][] matris = {{1,3,5}, // matrisin tanımı
                        {4,6,8}};
        
        int[][] transpoz = new int [3][2]; // transpoz tanımı

        for(int i=0 ; i < matris.length ; i++){ // satırdaki elemansayısı
            for(int j=0 ; j < matris[0].length ; j++){ // sutündaki eleman sayısı
                transpoz[j][i] = matris[i][j]; // satırla sutünun değiştirmek için i-j yerine j-i
            }
        }
        System.out.print("Matris:\n");
        for(int i=0 ; i < matris.length ; i++){ // satırdaki elemansayısı
            for(int j=0 ; j < matris[0].length ; j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\nTranspoz:\n");
        for(int i=0 ; i < transpoz.length ; i++){ // satırdaki elemansayısı
            for(int j=0 ; j < transpoz[0].length ; j++){
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
