
package org.usfirst.frc2811.BunnyBot2013.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2811.BunnyBot2013.Robot;


public class BallTaken extends Command {
    private boolean previousState;
    private boolean currentState;
    public double pickupTimer;
    Timer timer;
    
    public BallTaken() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.ballManager);
        previousState=false;
        currentState=false;
        //pickupTimer=new BallPickupTimer();
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        currentState=Robot.ballManager.getIntakeSensor();
        if(!previousState&&currentState){
          Robot.ballManager.incrementInternalCountUp();
          pickupTimer=Robot.timer.get();
        }
        previousState=currentState;
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
