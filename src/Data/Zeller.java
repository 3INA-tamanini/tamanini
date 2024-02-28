package Data;

public class Zeller {

    public static String zellerCongruence(int d, int m, int y) {
        String testo = "";

        if (m == 1 || m == 2) {
            m += 12;
            y--;
        }
        /* if (m == 1) {
            m = 13;
            y--;
        }
        if (m == 2) {
            m = 14;
            y--;
        }*/

        int q = d;
        int k = y % 100;
        int j = y / 100;
        int h = q + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) + 5 * j;
        h = h % 7;
        switch (h) {
            case 0:
                testo = "Saturday";
                break;
            case 1:
                testo = "Sunday";
                break;
            case 2:
                testo = "Monday";
                break;
            case 3:
                testo = "Tuesday";
                break;
            case 4:
                testo = "Wednesday";
                break;
            case 5:
                testo = "Thursday";
                break;
            case 6:
                testo = "Friday";
                break;
        }
        return testo;
    }

    public static void main(String[] args) {
        System.out.println(zellerCongruence(12, 2, 2024));
    }
}
