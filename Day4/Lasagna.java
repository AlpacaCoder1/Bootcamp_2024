public class Lasagna {
    static final int MINUTES_EXPECTED = 40;
// Task #1
    private int expectedMinutesInOven() {
        return MINUTES_EXPECTED;
    }
// Task #2
    private int remainingMinutesInOver(int minutesTakenInOven) {
        return MINUTES_EXPECTED - minutesTakenInOven;
    }
    private int preparationTimeInMinutes (int layers) {
        return 2 * layers;
    }
}