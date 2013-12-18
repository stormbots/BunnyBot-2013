/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2811.BunnyBot2013.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2811.BunnyBot2013.RobotMap;
    
/**
 *
 * @author Laurel Bingham
 */
public class NewTarget extends Command {
    //define states
    private int state;
    private int CHANGETARGETLEFT=0;
    private int CHANGETARGETRIGHT=1;
    private int WAITFORTARGET=2;
    private int limitdetected=3;
    private int tracktarget=4;
    private int manual=5;
    
    
    public NewTarget() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        //Set initial state
        state=WAITFORTARGET;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        //State machine!
        if(state==CHANGETARGETLEFT){
           RobotMap.towerRotateTowerRotateMotor.set(1); 
            //make motor go left
        }
        else if (state==CHANGETARGETRIGHT){
            RobotMap.towerRotateTowerRotateMotor.set(0);
        }
        else if(state==manual){
            
        }
        else if (state==limitdetected){
        }
        else if (state==tracktarget){
        }
        else{
            //ugh oh, something went wrong, go back
            state=WAITFORTARGET;
        } 
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
