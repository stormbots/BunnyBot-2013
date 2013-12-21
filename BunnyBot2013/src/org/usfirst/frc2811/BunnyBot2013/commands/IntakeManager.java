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
 * @author Penguins
 */
public class IntakeManager extends Command {
    
    private boolean runState;
    
    public void Raise(){
        Robot.ballManager.movePiston(false);
    }
    
    public void Lower(){
        Robot.ballManager.movePiston(true);
    }
    
    public void Toggle(){
        if (RobotMap.ballManagerBallBlocker.get()==true){                   
            Robot.ballManager.movePiston(false);
        } else {
            Robot.ballManager.movePiston(true);
        }
    }
    
    public IntakeManager() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        runState=false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if(runState==false){
            Toggle();
        }
        runState=true;
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
