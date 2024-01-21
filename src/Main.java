import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.00, toplam;
        double armute, elmae, domatese, muze, patlıcane;

        System.out.print("Armut Kilosunu Giriniz :");
        armute = input.nextDouble();

        System.out.print("Elma Kilosunu Giriniz :");
        elmae = input.nextDouble();

        System.out.print("Domates Kilosunu Giriniz :");
        domatese = input.nextDouble();

        System.out.print("Muz Kilosunu Giriniz :");
        muze = input.nextDouble();

        System.out.print("Patlıcan Kilosunu Giriniz :");
        patlıcane = input.nextDouble();

        toplam = (armut * armute) + (elma * elmae) + (domates * domatese) + (muz * muze) + (patlıcan * patlıcane);


        System.out.print("Toplam Tutar :" + toplam);

    }
}