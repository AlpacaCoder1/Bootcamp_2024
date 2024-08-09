public class Lasagna {
    int minutesExpected = 40;

    public int expectedMinutesInOven() {
        return minutesExpected;
    }
    public int remainingMinutesInOver(int minutesTakenInOven) {
        return minutesExpected - minutesTakenInOven;
    }
    public int preparationTimeInMinutes (int layers) {
        return 2 * layers;
    }
}