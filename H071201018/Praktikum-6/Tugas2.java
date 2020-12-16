import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String c = input.nextLine();
        String[][] a = new String[4][4];

        if (c.length() >= 16) {
            c = charCodePointAt(c);
            int count = 0;
            int character = chara(c);
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    a[i][j] = "";
                    for (int k = 0; k < character; k++) {
                        if (count < c.length()) {
                            a[i][j] += c.charAt(count);
                        } else {
                            a[i][j] += '?';
                        }
                        count++;
                    }
                }
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    static String charCodePointAt(String a) {
        int ganjil;
        char genap;
        String neu = "";
        for (int i = 0; i < a.length(); i++) {
            if (i % 2 != 0) {
                ganjil = Character.codePointAt(a, i);
                neu += ganjil;
            } else {
                genap = a.charAt(i);
                neu += genap;
            }
        }
        return neu;
    }

    // Menentukan banyak karakter tiap a
    static int chara(String a) {
        int character = 0;
        while ((16 * character) < a.length()) {
            character++;
        }
        return character;
    }

}
