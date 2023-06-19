import java.util.HashMap;
import java.util.Map;

public class Main {
    public char romanToInt(String s) {
        Map<String, Integer> symbolsValues = new HashMap<>();
        symbolsValues.put("I", 1);
        symbolsValues.put("V", 5);
        symbolsValues.put("X", 10);
        symbolsValues.put("L", 50);
        symbolsValues.put("C", 100);
        symbolsValues.put("D", 500);
        symbolsValues.put("M", 1000);

        return s.charAt(2);

    }
    public static void main(String[] args) {
        Main mainFunc = new Main();
        System.out.println("Hello world!"+ mainFunc.romanToInt("Salut les nazs"));
    }

}