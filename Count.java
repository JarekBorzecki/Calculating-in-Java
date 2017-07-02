package Practice_2;
import java.text.DecimalFormat;

/**
 * Created by jarek on 02.07.2017.
 */
public class Count {
    private int number;

    public Count(int a) {
        this.number = a;
    }

    public int add(Count p) {
        int score = this.number + p.number;
        return score;
    }

    public int multiply(Count q) {
        int score = this.number * q.number;
        return score;
    }

    public int subtract(Count z) {
        int result = this.number - z.number;
        return result;
    }
}
