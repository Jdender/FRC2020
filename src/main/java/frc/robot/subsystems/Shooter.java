package frc.robot.subsystems;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.util.NEO;
import frc.robot.commands.ShooterControl;

public class Shooter extends SubsystemBase {
    /**
     * Creates a new Shooter2.
     */
    public NEO LeftRight;
    public NEO UpDown;
    // private int Count;

    // public Shooter() {
    // LeftRight = new Servo(0);
    // UpDown = new Talon(1);
    // testTalon = new AnalogPotentiometer(1);
    // }
    public Shooter() {
        LeftRight = new NEO(Constants.RobotConstants.TurretMotorID, MotorType.kBrushless);
        // UpDown = new NEO(0, MotorType.kBrushless);
        setDefaultCommand(new ShooterControl(this)); // temporary commented out to see if solves null pointer exceptions

    }

    public void moveShooter(final double Speed) {

        // if (joyValy > -0.01 && joyValy < 0.01)
        // UpDown.set(0.0);
        // else if (joyValy > 0) {
        // if (UpDown.getPosition() <= 50) {
        // UpDown.set(1 * Scale * joyValy);
        // }
        // else {
        // UpDown.set(0.0);
        // }
        // }
        // else if (UpDown.getPosition() >= -50) {
        // UpDown.set(1 * Scale * joyValy);
        // }
        // else {
        // UpDown.set(0.0);
        // }

        if (Speed > -0.01 && Speed < 0.01)
            LeftRight.set(0.0);
        else if (Speed > 0) {
            if (LeftRight.getPosition() <= 35) {
                LeftRight.set(1 * Speed);
            } else {
                LeftRight.set(0.0);
            }
        } else if (LeftRight.getPosition() >= -25) {
            LeftRight.set(1 * Speed);
        } else {
            LeftRight.set(0.0);
        }
    }
}
