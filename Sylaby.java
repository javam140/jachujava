import java.util.Scanner;

public class Sylaby {
    static public int iloscsylab;
    static void wypisz(String x) {
        System.out.println(x);
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        wypisz("wprowadz tekst");
        String tekst = in.nextLine();
        String[] tablica = tekst.split(" ");
        int i = 0;
        while (i<=tablica.length-1) {
            String slowo = tablica[i];
            int ilosc_a = 0;
            char tym;
            int ilosc_e = 0;
            int ilosc_i = 0;
            int ilosc_o = 0;
            int ilosc_u = 0;
            int ilosc_y = 0;

            for (int j=0;j<slowo.length(); j++) {
                tym = slowo.charAt(j);
                if (tym=='a') {
                    ilosc_a++;
                }
                if (tym=='e') {
                    ilosc_e++;
                }
                if (tym=='i') {
                    ilosc_i++;
                    if (slowo.charAt(j-1)=='n'||slowo.charAt(j-1)=='s') {
                        ilosc_i--;
                    }
                }
                if (tym=='o') {
                    ilosc_o++;
                }
                if (tym=='u') {
                    ilosc_u++;
                }
                if (tym=='y') {
                    ilosc_y++;
                }
            }
            iloscsylab += ilosc_a+ilosc_e+ilosc_i+ilosc_o+ilosc_u+ilosc_y;
            i++;
        }
        wypisz("ilosc sylab w tekscie to "+iloscsylab);
        in.close();
    }
}
