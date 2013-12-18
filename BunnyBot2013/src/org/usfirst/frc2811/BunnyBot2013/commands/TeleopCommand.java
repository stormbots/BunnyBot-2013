/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2811.BunnyBot2013.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2811.BunnyBot2013.OI;
import org.usfirst.frc2811.BunnyBot2013.Robot;
import org.usfirst.frc2811.BunnyBot2013.RobotMap;

/**
 *
 * @author Kelson
 */
public class TeleopCommand extends Command {
    
    public TeleopCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        OI.MotorSpeedMultiplier = (OI.slowDownButton.get())?RobotMap.slowMotorSpeed:RobotMap.fastMotorSpeed;
        Robot.chassis.JoystickControl(Robot.oi.getJoystick());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
