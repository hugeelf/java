package Unlocker;

public class Fingerprint extends Unlocker{
    private String fingerprint;

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }
    public boolean unlock(String userFingerprint){
        return userFingerprint.equals(this.fingerprint);
    }
}
