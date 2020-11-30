package geeksForGeeks.greedy.classroom.knapsack;

import java.util.Comparator;

public class KnapComparator implements Comparator<KnapSack> {
    @Override
    public int compare(KnapSack o1, KnapSack o2) {
        return (o2.value/o2.weight)-(o1.value/o1.weight);
    }
}
