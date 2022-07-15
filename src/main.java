import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = 100000, tplm = 0, r = 3, sec;
        String kadi, pass;


        while (r > 0) {

            System.out.print("Kullanıcı adı : ");
            kadi = input.nextLine();
            System.out.print("Parola giriniz : ");
            pass = input.nextLine();


            if (kadi.equals("rem00te") && pass.equals("randoms")) {
                System.out.println("Hoş Geldiniz ");
                do {
                    System.out.println("Lütfen işleminizi belirtin ");
                    System.out.println("1-Para Çek\n" +
                            "2-Para Yatır\n" +
                            "3-Bakiye sorgula\n" +
                            "4-Çıkış");
                    sec = input.nextInt();


                    switch (sec) {
                        case 1:
                            System.out.println("Çekmek istediğiniz miktar :");
                            int cek = input.nextInt();
                            if (cek > b) {
                                System.out.println("Bakiye Yetersiz");
                            } else {
                                b -= cek;
                            }
                            System.out.print("Son Bakiye : " + b);
                            break;
                        case 2:
                            System.out.println("Yatırmak istediğiniz miktar : ");
                            int yat = input.nextInt();
                            b += yat;
                            System.out.println("Son Bakiye : " + b );
                            break;
                        case 3:
                            System.out.println("Bakiye :" + b);
                            break;
                    }
                }while (sec != 4);
                System.out.println("İyi günler ");
                break;
            }

            else {
                r--;
                if (r > 0){
                    System.out.println("Kalan Hakkınız :" + r);
                    System.out.println("Yanlış giriş yaptınız. Tekrar deneyin");
                } else {
                    System.out.print("Hesabınız bloke oldu. Lütfen banka ile iletişime geçin.");
                }
            }
        }
    }
}