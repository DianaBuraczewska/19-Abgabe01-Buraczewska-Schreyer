import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CalculatorImpl implements Calculator {
    private List<Integer> numbers = new ArrayList<Integer>();

    public CalculatorImpl() {
    }

    public int sum() {
        return 0;
    }

    public int getMaximum() {
        return 0;
    }

    public int getMinimum() {
        return Collections.min(numbers);
    }

    public void addValue(int value) {
        numbers.add(value);
    }

}
