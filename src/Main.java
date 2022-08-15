import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, passWord, cevap,sifre;
        String kuserName = "patika", kpassWord = "Jawa123";
        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız: ");
        userName = inp.nextLine();

        System.out.println("Şifreniz :");
        passWord = inp.nextLine();

        if(userName.equals(kuserName) && passWord.equals(kpassWord)){
            System.out.println("Giriş Yaptınız");

        }
        else
        {
            System.out.println("Bilgileriniz Hatalı !");
            if (userName.equals(kuserName)){
                System.out.println("Şifrenizi Değiştirmek ister misiniz (E/H) :");
                cevap = inp.nextLine();
                switch (cevap) {
                    case "E": {
                        System.out.println("Yeni şifrenizi giriniz: ");
                        sifre = inp.nextLine();
                        if (sifre.equals(passWord) | sifre.equals(kpassWord)) {
                            System.out.println("Lütfen farklı bir şifre giriniz");
                        }
                        else{
                            System.out.println("Şifreniz değiştirilmiştir");
                            kpassWord = sifre;
                        }
                        break;
                    }
                    case "H":{ System.out.println("Sistemden çıkılmıştır");
                        break;
                    }
                    default: System.out.println("E veya H");
                             break;
               }
            }

        }





    }
}
