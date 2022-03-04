
public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Ataturk Havalimanina Hosgeldiniz...");
        
        String sartlar = "Yurtdisi Cikis Durumu/n"
                + "Herhangi Siyasi yasaginizin bulunmamasi gerekir/n"
                + "15 TL Harc bedelinizi tam olarak yatirmaniz gerekiyor/n"
                + "Gideceginiz ulkeye vizenizin bulunmasi gerekiyor";
        String message = "Yurtdisi Sertlerinin hepsini saglamaniz gerekir";
        
        while (true) {
            System.out.println("*********************");
            System.out.println(message);
            System.out.println("*********************");
            System.out.println(sartlar);
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harc Bedeli kontrol ediliyor...");
            
            Thread.sleep(3000);
            if(yolcu.yurtdisiHarciKontrol() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(3000);
            
            if(yolcu.siyasiYasakKontrol() == false){
                    System.out.println(message);
                    continue;
            }
            System.out.println("Vize Durumu kontrol ediliyor...");
            Thread.sleep(3000);
            if(yolcu.vizeDurumuKontrol() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("Islemleriniz tamam yurtdisina cikabilirsiniz");
            break;
        }
    }
}
