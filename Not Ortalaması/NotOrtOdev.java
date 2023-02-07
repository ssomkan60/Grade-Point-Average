import java.util.Scanner;
public class NotOrtOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz:");
        int mat = input.nextInt();
        System.out.println(mat);

        System.out.print("Fizik Notunuzu Giriniz:");
        int fiz = input.nextInt();
        System.out.println(fiz);

        System.out.print("Kimya Notunuzu Giriniz:");
        int kim = input.nextInt();
        System.out.println(kim);

        System.out.print("Türkçe Notunuzu Giriniz:");
        int tr = input.nextInt();
        System.out.println(tr);

        System.out.print("Müzik Notunuzu Giriniz:");
        int mzk = input.nextInt();
        System.out.println(mzk);

        double ort = (double) (mat + fiz + kim + tr + mzk)/5;
        System.out.println("Ortalamanız:" + ort);

        if( ort > 60){
            System.out.print("Geçti");
        }
        else{
            System.out.println("Kaldı");
        }
    }
}
