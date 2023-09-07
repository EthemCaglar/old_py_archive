import java.util.Scanner;
public class ParolaKontrol {
    public static void main(String[] args) {
        Scanner input0 = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        String kullanici= "Javadev";
        String sifre= "Pati.Ka23";

        System.out.print("Kullanıcı Adı Giriniz: ");
        String mahlas = input0.nextLine();
        if(mahlas.equals(kullanici)){
            System.out.print("Parola giriniz: ");
            String parola = input0.nextLine();
            
                if(sifre.equals(parola)){
                    System.out.print("Giriş Başarılı");
                }
                else{
                    System.out.print("Şifreniz hatalı değiştirmek için 1 tekrar denemek için 0 giriniz: ");
                    int sifirbir = input0.nextInt();
                    switch (sifirbir) {
                        case 1:
                            while(true){
                                System.out.print("Yeni Parola giriniz: ");
                                String yeniparola = input1.nextLine();
                                if (sifre.equals(yeniparola)){
                                    System.out.print("Yazdığınız Parola eskiyle aynı, ");
                                }
                                else{
                                    System.out.print("Şifre değiştirilmiştir");
                                    break;
                                }
                            }
                            break;
                        case 0:
                            System.out.print("Parolayı Tekrar Deneyiniz: ");
                            String parola1 = input1.nextLine();
                            if(sifre.equals(parola1)){
                                System.out.print("Giriş Başarılı");
                                break;  
                                }   
                            System.out.print("Hatalı giriş hakkınız doldu.");
                            break;
                        default:
                            System.out.print("Hatalı Giriş");
                            break;
                    }
                } // şifre elsei           
        } // mahlas ifi
        else{
            System.out.print("Kullanıcı Adı Hatalı");
        }
    } // main
}