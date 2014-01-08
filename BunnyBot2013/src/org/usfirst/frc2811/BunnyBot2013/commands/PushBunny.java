/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2811.BunnyBot2013.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2811.BunnyBot2013.Robot;
import org.usfirst.frc2811.BunnyBot2013.subsystems.RabbitPusher;

/**
 *
 * @author Kelson
 */
public class PushBunny extends Command {
    boolean hi;
    public PushBunny(boolean input) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        //requires(Robot.rabbitPusher);
        hi = input;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.rabbitPusher.pushRabbit(hi);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
