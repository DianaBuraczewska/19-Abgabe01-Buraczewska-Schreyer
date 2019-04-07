import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CalculatorImpl implements Calculator {
    private List<Integer> numbers = new ArrayList<Integer>();

    public CalculatorImpl() {
    }

    public int sum() {
        int sum = 0;
        for (int value : numbers) {
            sum += value;
            
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
