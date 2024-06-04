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
        for (int i = 0 ; i < str.length() ; i++) {
            if (str.charAt(i) == character) {
                c.increment();
            }
        }
    }

    /** Returns the number of characters in the string.
     *  MUST use the updateCounterFromString method. */
    public static int countOccurrences(String str, char character) {
       CountCharacters.Counter c =new CountCharacters.Counter();
        updateCounterFromString(str,character,c);
        return c.getN();
    }

    /** Returns the number of characters in the string.
     *  MUST use the updateCounterFromString method.
     *  MUST do the computation in a new thread.
     *  */
    public static int countOccurrencesInThread(String str, char character) {
        throw new RuntimeException("not implemented");
    }

    /** Returns the total number of characters in all strings.
     *  MUST use the updateCounterFromString method.
     *  MUST use a single counter
     * */
    public static int countOccurrencesSequential(List<String> strings, char character) {
        int result=0;

        return result;
    }

    /** Returns the total number of characters in all strings.
     *  MUST use the updateCounterFromString method.
     *  MUST use a single counter
     *  MUST process each string concurrently with the others.
     * */
    public static int countOccurrencesParallel(List<String> strings, char character) {
        throw new RuntimeException("not implemented");
    }
}
