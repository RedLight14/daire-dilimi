import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int r,a;
        double pi =3.14,sonuc;

        System.out.print("dairenin yarıçapını (r) giriniz : ");
        r=inp.nextInt();

        System.out.print("dairenin merkez açısının ölçüsünü giriniz : ");
        a=inp.nextInt();

        sonuc=(pi*(r*r)*a)/360;

        System.out.print("daire diliminin alanı : "+sonuc);
    }
    }
