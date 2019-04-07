
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

<<<<<<< HEAD



=======
        
>>>>>>> 8484ed782999f071eab63fbec82c8fe1fb5fac3a
        // output lowest number
        System.out.println("min: "+calc.getMinimum());
        // output highest number
        System.out.println("max: " + calc.getMaximum());
        // output sum of all numbers
<<<<<<< HEAD
        System.out.println("sum: "+calc.sum());
=======
        System.out.println("sum: " + calc.sum());
        

>>>>>>> 8484ed782999f071eab63fbec82c8fe1fb5fac3a
    }

}
