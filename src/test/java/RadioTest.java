import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void valueGetAndSetPositiv() {
        Radio radio = new Radio();
        int expectedValue = 8;
        radio.setValue(expectedValue);
        assertEquals(expectedValue, radio.getValue());
    }

    @Test
    public void valueGetAndSetNextvValue() {
        Radio radio = new Radio();
        int expectedValue = 10;
        radio.setValue(15);
        assertEquals(expectedValue, radio.getValue());
    }

    @Test
    public void valueGetAndSetPreviosvValue() {
        Radio radio = new Radio();
        int expectedValue = 0;
        radio.setValue(-1);
        assertEquals(expectedValue, radio.getValue());
    }

    @Test
    public void stationGetAndSetPositiv() {
        Radio radio = new Radio();
        int expectedStation = 5;
        radio.setCurrentStation(expectedStation);
        assertEquals(expectedStation, radio.getCurrentStation());
    }

    @Test
    public void stationGetAndSetNextStation() {
        Radio radio = new Radio();
        int expectedStation = 0;
        radio.setCurrentStation(10);
        assertEquals(expectedStation, radio.getCurrentStation());
    }

    @Test
    public void stationGetAndSetPreviostStation () {
        Radio radio = new Radio();
        int expectedStation = 9;
        radio.setCurrentStation(-1);
        assertEquals(expectedStation, radio.getCurrentStation());
    }

}
