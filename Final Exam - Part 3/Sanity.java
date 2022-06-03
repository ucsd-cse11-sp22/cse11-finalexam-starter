import tester.*;
import java.util.*;

class FinalPart3_SanityExam {
    void testSumAt(Tester t) {
        Sum ln = new Sum();

        List< List<Integer> > il = new ArrayList();
        il.add(Arrays.asList(new Integer[] {1, 2, 3}));
        il.add(Arrays.asList(new Integer[] {3, 3, 3}));

        t.checkExpect(9, ln.sumAt(il, new IntsSumAt(),1));
        
    }
}

class IntsSumAt implements SumAt< List<Integer> > {
    public int getSum(List<Integer> l) {
        int sum = 0;
        for (Integer li : l) {
            sum += li;
        }
        return sum;
    }
}

// java OccurrenceSum data_1.csv data_2.csv data_3.csv
// occasion, 170