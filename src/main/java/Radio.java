
public class Radio {
    private int currentStation;
    private int currentValue;
    private int amountStation = 10;

    public void setCurrentStation(int currentStation) {
        if (currentStation > amountStation) {
            return;
        } else if (currentStation < 0) {
            return;
        } else this.currentStation = currentStation;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public int getAmountStation() {
        return amountStation;
    }

    public void nextStation() {
        ++this.currentStation;
        if (this.currentStation > amountStation) {
            this.currentStation = 0;
        }

    }

    public void previousStation() {
        --this.currentStation;
        if (this.currentStation < 0) {
            this.currentStation = amountStation;
        }

    }

    public void nextValue() {
        ++this.currentValue;
        if (this.currentValue > amountStation) {
            this.currentValue = amountStation;
        }
    }

    public void previousValue() {
        --this.currentValue;
        if (this.currentValue < 0) {
            this.currentValue = 0;
        }
    }

    public Radio (int amountStation) {
        this.amountStation = amountStation;
    }
}
