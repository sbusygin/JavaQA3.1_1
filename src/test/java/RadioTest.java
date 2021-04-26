import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void nextValueChange() {
        Radio radio = new Radio();
        int expectedValue = 1;
        radio.nextValue();
        assertEquals(expectedValue, radio.getCurrentValue());
    }

    @Test
    public void previousValueChange() {
        Radio radio = new Radio();
        int expectedValue = 0;
        radio.previousValue();
        assertEquals(expectedValue, radio.getCurrentValue());
    }

    @Test
    public void nextStationChange() {
        Radio radio = new Radio();
        int expectedStation = 1;
        radio.nextStation();
        assertEquals(expectedStation, radio.getCurrentStation());
    }

    @Test
    public void allStationChange() {
        Radio radio = new Radio();
        int expectedStation = 0;
        for (int i = 0; i < 10; i++) {
            radio.nextStation();
        }
        assertEquals(expectedStation, radio.getCurrentStation());
    }

    @Test
    public void allValueChange() {
        Radio radio = new Radio();
        int expectedValue = 10;
        for (int i = 0; i < 12; i++) {
            radio.nextValue();
        }
        assertEquals(expectedValue, radio.getCurrentValue());
    }

    @Test
    public void NextAndPreviousStation() {
        Radio radio = new Radio();
        int expectedStation = 2;
        for (int i = 0; i < 3; i++) {
            radio.nextStation();
        }
        radio.previousStation();
        assertEquals(expectedStation, radio.getCurrentStation());
    }

    @Test
    public void NextAndPreviousValue() {
        Radio radio = new Radio();
        int expectedValue = 2;
        for (int i = 0; i < 3; i++) {
            radio.nextValue();
        }
        radio.previousValue();
        assertEquals(expectedValue, radio.getCurrentValue());
    }
}
