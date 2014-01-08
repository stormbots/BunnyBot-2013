/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2811.BunnyBot2013.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2811.BunnyBot2013.OI;

/**
 *
 * @author Kelson
 */
public class AxisToggle extends Command {
    
    public AxisToggle() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        this.setTimeout(4);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (this.isTimedOut() || !OI.toggleForeBackStick.get());
    }

    // Called once after isFinished returns true
    protected void end() {
        if (OI.toggleForeBackStick.get()){
            OI.FORE_BACK_STICK = (OI.FORE_BACK_STICK == OI.FORE_BACK_STICK_CONTROLLER)?OI.FORE_BACK_STICK_JOYSTICK:OI.FORE_BACK_STICK_CONTROLLER;
        }
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
