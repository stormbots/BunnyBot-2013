/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2811.BunnyBot2013.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2811.BunnyBot2013.Robot;
import org.usfirst.frc2811.BunnyBot2013.RobotMap;
import org.usfirst.frc2811.BunnyBot2013.commands.BallTaken;


/**
 *
 * @author 128925
 */
public class BallManagerCommand extends Command {
    int ballcount;
    boolean previousSwitchState;
    boolean currentSwitchState;
    public BallManagerCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.ballManager);
        ballcount=0;
        previousSwitchState=false;
        currentSwitchState=false;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        
        currentSwitchState = Robot.ballManager.getIntakeSensor();
        if (previousSwitchState==false&&currentSwitchState==true){
           //disable ball capture
            double liftTime; 
            liftTime = Timer.get();
           Robot.ballManager.movePiston(true); //true = retracted
           if(liftTimer-pickupTimer>=3){
                   RobotMap.ballManagerIntakeMotor.set(0); //Turn off intake motors
           }
               
                
            
            }
            previousSwitchState=currentSwitchState;
        
        //if (ballcount>0){
            //int targetTime=?
            /*if (pickUpTime-cRioTime==targetTime){
                  
            }*/
        
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
