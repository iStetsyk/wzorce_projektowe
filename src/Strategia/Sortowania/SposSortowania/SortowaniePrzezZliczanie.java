package Strategia.Sortowania.SposSortowania;

public class SortowaniePrzezZliczanie implements SposobSortowania {

    @Override
    public int[] sortuj(int[] doPosortowania) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < doPosortowania.length; i++) {
            if (max < doPosortowania[i]) {
                max = doPosortowania[i];
            }
        }

        int[] tablicaZliczen = new int[max + 1];
        for (int i = 0; i < doPosortowania.length; i++) {
            tablicaZliczen[i]++;
        }

        int[] tablicaPosortowana = new int[doPosortowania.length];
        int licznik = 0;

        for (int i = 0; i < tablicaZliczen.length; ) {
            if (tablicaZliczen[i] > 0) {
                tablicaPosortowana[licznik] = i;
                licznik++;
                tablicaZliczen[i]--;
            } else {
                i++;
            }
        }
        return tablicaPosortowana;
    }
}
