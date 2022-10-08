import java.util.Scanner;

public class Potegi {
    public static Scanner in = new Scanner(System.in);
    public static String[] tablica = new String[10];
    static int wynik;
    public static void main(String args[]) {
        String cos = in.nextLine();
        int i = Integer.parseInt(cos);

        int j = 0;
        while (j<i) {
            tablica[j] = in.nextLine();
            j++;
        }
        j = 0;
        while (i>j) {
            String[] tablicaa = tablica[j].split(" ");
            int a = Integer.parseInt(tablicaa[0]);
            int b = Integer.parseInt(tablicaa[1]);
            wynik =1;
            while (b>0) {
                wynik *= a;
                b--;
            }
            j++;
            System.out.println(wynik);
        }
        
        in.close();
    }
}
