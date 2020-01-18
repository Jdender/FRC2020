/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.NEO;
import frc.robot.OI;
import frc.robot.Robot;
import frc.robot.commands.ConveyerController;

public class Conveyer extends SubsystemBase {
  public NEO conveyerMotor;
  /**
   * Creates a new Conveyer.
   */
  public Conveyer() {
    conveyerMotor = new NEO(1, MotorType.kBrushless);
  }

  @Override
  public void periodic() {
    System.out.println(Robot.m_oi.controller1.getRawAxis(2));
    Robot.conveyer.conveyerMotor.set(Robot.m_oi.controller1.getRawAxis(2));
    // This method will be called once per scheduler run
  }

 //@Override
  //public void initDefaultCommand() {
    //setDefaultCommand(new ConveyerController());
  //}
}
