
public class Radio {
    private int currentStation;
    private int value;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            this.currentStation = 0;
        }
        else if (currentStation < 0) {
            this.currentStation = 9;
        }
        else this.currentStation = currentStation;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value > 10) {
            this.value = 10;
        }
        else if (value < 0) {
            this.value = 0;
        }
        else this.value = value;
    }
}
