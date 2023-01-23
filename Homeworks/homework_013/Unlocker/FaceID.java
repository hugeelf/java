package Unlocker;

public class FaceID extends Unlocker{
    private String faceID;

    public void setFaceID(String faceID) {
        this.faceID = faceID;
    }

    public boolean unlock(String userFaceID){
        return userFaceID.equals(this.faceID);
    }
}
