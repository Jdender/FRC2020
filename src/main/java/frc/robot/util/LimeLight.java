package frc.robot.util;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class LimeLight {
    NetworkTable camera;
    NetworkTableEntry x, y, a;

    public LimeLight() {
        camera = NetworkTableInstance.getDefault().getTable("limelight");
        x = camera.getEntry("tx");
        y = camera.getEntry("ty");
        a = camera.getEntry("ta");

    }

    public void LEDon() {
        camera.getEntry("ledMode").setNumber(3);
    }

    public void LEDoff() {
        camera.getEntry("ledMode").setNumber(1);
    }

    public LimeLightTarget read() {
        LimeLightTarget retval = new LimeLightTarget();
        retval.x = x.getDouble(0.0);
        retval.y = y.getDouble(0.0);
        retval.area = a.getDouble(0.0);
        return retval;
    }

    public double getx() {
        return x.getDouble(0.0);
    }

    public double gety() {
        return y.getDouble(0.0);
    }

    public static class LimeLightTarget {
        double x;
        double y;
        double area;
    }
}
