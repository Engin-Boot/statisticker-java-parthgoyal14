package statisticker;

import java.util.*;

public class Statistics 
{
    static class Stats{
        public Float min=Float.NaN;
        public Float max=Float.NaN;
        public Float avg=Float.NaN;
    }
    
    public static Stats getStatistics(List<___> numbers) {
        //implement the computation of statistics here
        Statistics.Stats stat = new Stats();
        if(numbers.isEmpty())
        {
            return stat;
        }
        Float s = 0f;
        stat.min = Collections.min(numbers);
        stat.max = Collections.max(numbers);
        for (Float n:numbers)
        {
            s+=n;
        }
        stat.avg = s/numbers.size();
    }
    return stat;
}
