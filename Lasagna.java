public class Lasagna {
    static final int MINUTES_EXPECTED = 40;
// Task #1
    public int expectedMinutesInOven() {
        return MINUTES_EXPECTED;
    }
// Task #2
    public int remainingMinutesInOver(int minutesTakenInOven) {
        return MINUTES_EXPECTED - minutesTakenInOven;
    }
    public int preparationTimeInMinutes (int layers) {
        return 2 * layers;
    }
// Task #3
    public int TotalTimeInMinutes(int layers, int minutesTakenInOven) {
        return preparationTimeInMinutes(layers) + minutesTakenInOven;
    }
}
