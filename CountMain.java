package Practice_2;

/**
 * Created by jarek on 02.07.2017.
 */
public class CountMain {
    public static void main(String[] args) {

        Count c1 = new Count(72);
        Count c2 = new Count(46);

        System.out.println("Add: " + c1.add(c2));
        System.out.println("Multiply: " + c1.multiply(c2));
        System.out.println("Subtract: " + c1.subtract(c2));
    }
}
