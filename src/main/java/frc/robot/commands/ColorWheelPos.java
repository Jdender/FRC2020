/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ColorWheel;
import frc.robot.subsystems.ColorWheel.ArmPosition;

public class ColorWheelPos extends CommandBase {
    private ColorWheel colorWheel;
    private ArmPosition pos;

    /**
     * Creates a new ColorWheelSpin.
     */
    public ColorWheelPos(ColorWheel colorWheel, ColorWheel.ArmPosition pos) {
        this.colorWheel = colorWheel;
        this.pos = pos;
        // Use addRequirements() here to declare subsystem dependencies.
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        colorWheel.resetArmState();
        if (pos == ColorWheel.ArmPosition.Down) {
            colorWheel.stopSpinState();
            colorWheel.stopSpinning();
        }
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return colorWheel.colorWheelState(pos);
    }
}
