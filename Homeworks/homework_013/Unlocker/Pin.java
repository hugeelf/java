package Unlocker;

public class Pin extends Unlocker {
    private int pin;

    public void setPin(int pin) {
        this.pin = pin;
    }
    public boolean unlock(int userPin){
        return userPin==this.pin;
    }
}
