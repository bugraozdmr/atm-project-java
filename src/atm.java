public class atm {
    private String kadi;
    private String ksifre;
    private int bakiye;

    //const.
    public atm(){
        this.bakiye=0;
        this.kadi="belirtilmedi";
        this.ksifre="belirtilmedi";
    }

    public int giris(String a,String b) {       //int bu
        if (kadi.equals("grant") && ksifre.equals("1234")) {
            System.out.println("Giriş başarılı yönlendiriliyorsunuz ...");
            return 1;
        } else if (kadi.equals("grant") && !ksifre.equals("1234")) {
            System.out.println("Kullanıcı adı doğru şifre hatalı tekrar dene.");
            return 0;
        } else if (!kadi.equals("grant") && ksifre.equals("1234")) {
            System.out.println("Kullanıcı adı hatalı şifre doğru tekrar dene.");
            return 0;
        } else {
            System.out.println("Girilen bilgiler hatalı !");
            return 0;
        }
    }

    public void para_yatir(double miktar){
        this.bakiye+=miktar;
        System.out.println("Yeni bakiye :"+this.bakiye);
    }
    //para çek
    public void para_cek(double miktar){
        if(miktar>1500){
            System.out.println("bakiye çekme limiti 1500 TL");
        }else{
            this.bakiye-=miktar;
            if(this.bakiye<=0){
                this.bakiye+=miktar;        //eski haline gelsin
                System.out.println("bu kadar para çekemezsin !");
            }else {

                System.out.println("Yeni bakiye :"+this.bakiye);
            }
        }
    }

    public String getKadi() {
        return kadi;
    }

    public void setKadi(String kadi) {
        this.kadi = kadi;
    }

    public String getKsifre() {
        return ksifre;
    }

    public void setKsifre(String ksifre) {
        this.ksifre = ksifre;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
}
