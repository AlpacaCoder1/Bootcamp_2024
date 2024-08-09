public class Lasagna {
    int minutesExpected = 40;
// Task #1
    public int expectedMinutesInOven() {
        return minutesExpected;
    }
// Task #2
    public int remainingMinutesInOver(int minutesTakenInOven) {
        return minutesExpected - minutesTakenInOven;
    }
    public int preparationTimeInMinutes (int layers) {
        return 2 * layers;
    }
}