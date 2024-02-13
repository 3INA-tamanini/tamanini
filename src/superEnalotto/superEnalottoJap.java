パッケージ superEnalotto;

をインポートします。 java.util.Random;

パブリック クラス SuperEnalottoJap {

    public SuperEnalotto() {
    }

    public String superEnalotto() {
        文字列 testo = "";
        内部リス;
        ランダム r = 新しいランダム();
        for (int i = 0; i < 6; i++) {
            ris = (int) r.nextInt(10);
            テストー += " " + リス;
        }

        テストを返します。
    }

    public String superEnalottoNoNumeriRipetuti() {
        文字列 testo = "";
        int n1、n2、n3、n4、n5、n6;
        ランダム r = 新しいランダム();
        する {
            n1 = (int) r.nextInt(9) + 1;
            n2 = (int) r.nextInt(9) + 1;
            n3 = (int) r.nextInt(9) + 1;
            n4 = (int) r.nextInt(9) + 1;
            n5 = (int) r.nextInt(9) + 1;
            n6 = (int) r.nextInt(9) + 1;
        while (n1 == n2 || n1 == n3 || n1 == n4 || n1 == n5 || n1 == n6
                || n2 == n3 || n2 == n4 || n2 == n5 || n2 == n6
                || n3 == n4 || n3 == n5 || n3 == n6
                || n4 == n5 || n4 == n6
                || n5 == n6);

        testo += n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6 + " ";

        テストを返します。
    }
}