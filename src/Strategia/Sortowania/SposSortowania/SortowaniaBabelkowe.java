package Strategia.Sortowania.SposSortowania;

public class SortowaniaBabelkowe implements SposobSortowania {

    @Override
    public int[] sortuj(int[] doPosortowania) {

        for (int i = 0; i < doPosortowania.length; i++) {
            for (int j = 0; j < doPosortowania.length - 1; j++) {
                if (doPosortowania[j] > doPosortowania[j+1]) {
                    int temp = doPosortowania[j];
                    doPosortowania[j] = doPosortowania[j+1];
                    doPosortowania[j+1] = temp;
                }
            }
        }
        return doPosortowania;
    }
}
