/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2811.BunnyBot2013.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2811.BunnyBot2013.Robot;

/**
 *
 * @author Kelson
 */
public class DriveBackwardsForTime extends Command {
    private double time;
    public DriveBackwardsForTime(double inputtime) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        //requires(Robot.chassis);
        time = inputtime;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        this.setTimeout(time);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.chassis.manualControl(1.0,0.5);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.chassis.manualControl(0.0,0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        Robot.chassis.manualControl(0.0,0.0);
    }
}
