package Strategia.Sortowania;

import Strategia.Sortowania.SposSortowania.SortowaniaBabelkowe;
import Strategia.Sortowania.SposSortowania.SortowaniePrzezZliczanie;
import Strategia.Sortowania.SposSortowania.SposobSortowania;

public class Sortowania {

    public class Sortowanie {
        private SposobSortowania sposobSortowania;
        private int[] doPosortowania;

        public Sortowanie(int[] doPosortowania) {
            if(sprawdzLiczbyUjemne(doPosortowania)) {
                sposobSortowania = new SortowaniaBabelkowe();
            } else {
                sposobSortowania = new SortowaniePrzezZliczanie();
            }
            this.doPosortowania = doPosortowania;
        }

        public int[] posortuj() {
            return sposobSortowania.sortuj(this.doPosortowania);
        }

        private boolean sprawdzLiczbyUjemne(int[] doPosortowania) {
            for (int i = 0; i < doPosortowania.length; i++) {
                if (doPosortowania[i] < 0) {
                    return true;
                }
            }
            return false;
        }
    }
}
