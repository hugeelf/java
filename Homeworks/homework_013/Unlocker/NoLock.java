package Unlocker;

public class NoLock extends Unlocker{
    private boolean isUnlock = true;
    public boolean unlock(){
        return this.isUnlock;
    }
}
