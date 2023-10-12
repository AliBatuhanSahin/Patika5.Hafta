import java.util.Scanner;

public class Main {

    public static int Array(int[] dizi , int index){
        if (index < 0 || index >= dizi.length)
            throw new ArrayIndexOutOfBoundsException("İndeksin dışında olamaz!");
        return dizi[index];
    }


    public static void main(String[] args) {

        int [] dizi = {1,2,3,4,5,6,7,8,9,10};

        Scanner input = new Scanner(System.in);
        System.out.print("Diziden bir eleman seçiniz :");
        int select = input.nextInt();

        try {
            int secilen = Array(dizi,select);
            System.out.println("Seçilen indeks elemanı : " + secilen);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("HATA!!, DİZİNİN BOYU AŞILDI.");
            System.out.println(a.getMessage());
        } finally {
            System.out.println("Her Zaman Çalışacak");
        }

        System.out.println("Program bitti.");


    }
}