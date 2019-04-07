import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CalculatorImpl implements Calculator {
    private List<Integer> numbers = new ArrayList<Integer>();

    public CalculatorImpl() {
    }

    public int sum(ArrayList<Integer>numbers) {
        int sum;
        for(int i=0, i<+numbers.size-1,i++){
          sum += numbers.get(i);
        }
        return sum;
    }

    public int getMaximum() {
        return Collections.max(numbers);
    }

    public int getMinimum() {
        return Collections.min(numbers);
    }

    public void addValue(int value) {
        numbers.add(value);
    }

}
