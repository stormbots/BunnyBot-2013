/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2811.BunnyBot2013.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2811.BunnyBot2013.Robot;

/** This command will find the timer, set it to run, then every update, set the value inside subsystem Timer.
 *
 * @author Kelson
 */
public class TimeControl extends Command {
    private Timer Timer;
    double time;
    
    public TimeControl() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        Timer = new Timer();
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        Timer.start();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.timer.setTime(Timer.get());
        
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
