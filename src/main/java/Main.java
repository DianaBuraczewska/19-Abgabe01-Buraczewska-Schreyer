
public class Main {

    public static void main(String[] args) {

        // TODO implement your own Calculator Implementation and create a new CalculatorImpl Class
        Calculator calc = new CalculatorImpl();

        calc.addValue(20);	// currently highest number
        calc.addValue(4);	// currently lowest number
        calc.addValue(16);

        // add other integers
        calc.addValue(42);
        calc.addValue(35);
        calc.addValue(12);
        calc.addValue(2);
        calc.addValue(25);
        calc.addValue(8);
        calc.addValue(13);




        // output lowest number
        System.out.println("min: "+calc.getMinimum());
        // output highest number

        // output sum of all numbers
        System.out.println("sum: "+calc.sum());
    }

}
