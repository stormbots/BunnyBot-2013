/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
public class ManualBallAdvancer extends Command {
    private 
    public ManualBallAdvancer() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.ballManager);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (OI.BallAdvanceButton.get()){
            Robot.ballManager.moveBalls(1.0);//assuming 1 is forwards
        } else if (OI.BallReverseButton.get()){
            Robot.ballManager.moveBalls(-1.0);
        } else {
            Robot.ballManager.moveBalls(0.0);
        }
        RobotMap.BallShooterMotor.set();
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
