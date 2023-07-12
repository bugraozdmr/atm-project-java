import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        //değişkenler
        String u,l;
        int y;
        double miktar;


        atm atm1=new atm();
        System.out.println("Giriş yap :");

        System.out.println("---------");
        for(int i=5;i>0;i--){
            System.out.print("Kullanıcı adı :");
            u=scanner.nextLine();
            atm1.setKadi(u);
            System.out.print("Şifre :");
            l=scanner.nextLine();
            atm1.setKsifre(l);
            if(atm1.giris(u,l)==1) break;       //zaten her seferinde yazacak
            if(i==1){
                System.out.println("kartına el konuldu...");
                java.lang.System.exit(1);
            }
            System.out.println((i-1)+" hakkın kaldı.\n---------");

        }

        //hazır kullanım gerçekçi olsun
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print("\n\n\nTOSUNCUK-ATM\n1.Para çek\t\t2.Para yatır\n3.Bakiye sorgula\t4.Kart iade\n\nişlem :");
        y=scanner.nextInt();

        while(true){
            switch (y){
                case 1:
                    System.out.print("Çekilecek miktar :");
                    miktar=scanner.nextDouble();
                    atm1.para_cek(miktar);
                    break;
                case 2:
                    System.out.print("Yatırılacak miktar :");
                    miktar=scanner.nextDouble();
                    atm1.para_yatir(miktar);
                    break;
                case 3:
                    System.out.println("mevcut bakiye :"+atm1.getBakiye());
                    break;
                case 4:
                    java.lang.System.exit(1);
                    break;
                default:
                    System.out.println("geçersiz işlem !");
                    break;
            }
            System.out.print("işlem :");
            y=scanner.nextInt();
        }
    }
}
