import java.util.List;

public class CountCharacters {


    public static class Counter {
        private int n = 0;

        public int getN() {
            return n;
        }

        public void increment() {
            this.n++;
        }
    }

    public static void updateCounterFromString(String str, char character, Counter c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                c.increment();
            }
        }
    }


}