public class CiftSayilarKupToplami {

    public static void main(String[] args) {

        int toplam = 0;

        for (int sayi = 1; sayi <= 20; sayi++) {

            if (sayi % 2 == 0) {
                toplam += sayi * sayi * sayi;
            }
        }

        System.out.println("Çift sayıların küplerinin toplamı: " + toplam);
    }
}
