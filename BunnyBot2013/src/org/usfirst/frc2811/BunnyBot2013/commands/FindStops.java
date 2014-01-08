/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2811.BunnyBot2013.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2811.BunnyBot2013.Robot;
import org.usfirst.frc2811.BunnyBot2013.RobotMap;

/**
 *
 * @author Kelson
 */
public class FindStops extends Command {
    
    public FindStops() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (RobotMap.hallEffectSensor.get()){
            Robot.ballShooter.turnTurretLeft();
        } else {
            Robot.ballShooter.turnTurretStop();
            RobotMap.encoderZeroAngle = RobotMap.towerRotateTowerRotateSensor.getDistance();
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return RobotMap.hallEffectSensor.get();
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.ballShooter.turnTurretStop();
        
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
