/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drive;

public class AutoRight extends SequentialCommandGroup {
    /**
     * Creates a new AutoRight.
     */
    public AutoRight(Drive drive) {
        // DriveForward command = new DriveForward(16.2, true, drive);
        DriveTurn command = new DriveTurn(45, drive);
        command.drivepower = .1;
        addCommands(command);
        System.out.println("Right");

    }
}
