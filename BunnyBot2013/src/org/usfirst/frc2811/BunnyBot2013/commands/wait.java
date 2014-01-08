/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2811.BunnyBot2013.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 * @author Kelson
 */
public class wait extends Command {
    private double m_timeout;
    
    public wait(double timeout) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        m_timeout = timeout;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        this.setTimeout(m_timeout);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        System.out.println("Timed out!");
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
