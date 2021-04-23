
public class Radio {
    private int currentStation;
    private int currentValue;

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
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


    public void nextStation() {
        ++this.currentStation;
        if (this.currentStation > 9) {
            this.currentStation = 0;
        }

    }

    public void previousStation() {
        --this.currentStation;
        if (this.currentStation < 0) {
            this.currentStation = 9;
        }

    }

    public void nextValue() {
        ++this.currentValue;
        if (this.currentValue > 10){
            this.currentValue = 10;
        }
    }

    public void previousValue() {
        --this.currentValue;
        if (this.currentValue < 0){
            this.currentValue = 0;
        }
    }
}
