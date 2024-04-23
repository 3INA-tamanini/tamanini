public class Mcm {

    private String num;

    public Mcm(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int calcolaMcm() {
        int mag2 = 0;
        int mag3 = 0;
        int mag5 = 0;
        int mag7 = 0;
        int mcm = 1;

        String numeriStringhe[] = num.split(", ");

        int[] array2 = new int[numeriStringhe.length];
        int[] array3 = new int[numeriStringhe.length];
        int[] array5 = new int[numeriStringhe.length];
        int[] array7 = new int[numeriStringhe.length];

        int[] arrayDiInteri = new int[numeriStringhe.length];

        for (int p = 0; p < numeriStringhe.length; p++) {
            arrayDiInteri[p] = Integer.parseInt(numeriStringhe[p]);
        }

        for (int i = 0; i < arrayDiInteri.length; i++) {

            while (arrayDiInteri[i] % 2 == 0) {
                array2[i]++;
                arrayDiInteri[i] /= 2;
                if (array2[i] > mag2) {
                    mag2 = array2[i];
                }
            }

            while (arrayDiInteri[i] % 3 == 0) {
                array3[i]++;
                arrayDiInteri[i] /= 3;
                if (array3[i] > mag3) {
                    mag3 = array3[i];
                }
            }

            while (arrayDiInteri[i] % 5 == 0) {
                array5[i]++;
                arrayDiInteri[i] /= 5;
                if (array5[i] > mag5) {
                    mag5 = array5[i];
                }
            }

            while (arrayDiInteri[i] % 7 == 0) {
                array7[i]++;
                arrayDiInteri[i] /= 7;
                if (array7[i] > mag7) {
                    mag7 = array7[i];
                }
            }

            mcm = (int) (((Math.pow(2, mag2)) * (Math.pow(3, mag3))) * (Math.pow(5, mag5)) * (Math.pow(7, mag7)));

          

        }
          return mcm;

    }
}


