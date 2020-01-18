/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class ShooterLR extends Command {
  private double pos;

  /**
   * Creates a new ShooterLR.
   */
  public ShooterLR(double pos) {
    this.pos = pos;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    Robot.shooter.LeftRight.set(pos);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end() {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
  @Override
  public void interrupted() {

  }
}
