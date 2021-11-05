package ca.medavieassessment;

public class CeilingFan {
    private final int[] speedSettings = {0, 1, 2, 3};
    private int speed;
    private boolean isReverse;

    public CeilingFan() {
        speed = speedSettings[0];
        isReverse = false;
    }

    public void pullSpeedCord() {
        if (speed == 3) {
            speed = speedSettings[0];
        } else {
            speed = speedSettings[++speed];
        }
    }

    public void pullDirectionCord() {
        isReverse = !isReverse;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getReverse() {
        return isReverse;
    }

    @Override
    public String toString() {
        return "CeilingFan{ " +
                "speed = " + speed +
                ", isReverse = " + isReverse +
                " }";
    }
}
