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


/**
 *
 * @author 128925
 */
public class BallManagerCommand extends Command {
    public int ballcount;
    boolean previousSwitchState;
    boolean currentSwitchState;
    private boolean previousState;
    private boolean currentState;
    public double pickupTimer;
    Timer timer;
    
    public BallManagerCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.ballManager);
        ballcount=0;
        previousSwitchState=false;
        currentSwitchState=false;
        requires(Robot.ballManager);
        previousState=false;
        currentState=false;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    private void checkintake(){
        currentSwitchState = Robot.ballManager.getIntakeSensor();
        currentState=Robot.ballManager.getIntakeSensor();
        if(!previousState&&currentState){
          Robot.ballManager.incrementInternalCountUp();
          pickupTimer=Robot.timer.get();
        }
        previousState=currentState;
        //Checks intake. edge detection, marks timer for when ball is grabbed 
    }
    protected void execute() {
        checkintake();                   
        if (previousSwitchState==false&&currentSwitchState==true){
           //disable ball capture
            double liftTimer; 
            liftTimer = Robot.timer.get();//amount of time ball has climbed tower
           Robot.ballManager.movePiston(true); //true = retracted
        if(3==liftTimer-pickupTimer){
            RobotMap.ballManagerIntakeMotor.set(0); //Turn off intake motors
        } 
    }
            previousSwitchState=currentSwitchState;
        
              
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
