import java.util.Scanner;

public class KDV_Tutar
{
    public static void main(String[] args)
    {
        double tutar, kdvTutar1 = 0.18, kdvTutar2 = 0.08, kdvTutar;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen ücret tutarını giriniz => ");
        tutar = input.nextDouble();

        kdvTutar = tutar * kdvTutar1;
        if(tutar>=1000)
        {
            kdvTutar = tutar * kdvTutar2;
        }
        System.out.println("KDV = " + kdvTutar);
        System.out.println("Toplam Tutar = " + (tutar + kdvTutar));

    }
}
