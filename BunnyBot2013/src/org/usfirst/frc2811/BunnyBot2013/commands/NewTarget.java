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
 
    private int tracktarget=3;
    private int manual=4;
    public int beta = 0;  //angle variables
    private int oldbeta = 0;//angle variables
    
    
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
            //make the motor go left
           if ((Math.abs(beta)==beta)!= (Math.abs(oldbeta)==(oldbeta))){
           state=tracktarget;
           }
        }
        else if (state==CHANGETARGETRIGHT){
            RobotMap.towerRotateTowerRotateMotor.set(0);
             if ((Math.abs(beta)==beta)!= (Math.abs(oldbeta)==(oldbeta))){
           state=tracktarget;
           if(limitswitch==true){
               RobotMap.towerRotateTowerRotateMotor.set(1); //turn left
               state = WAITFORTARGET;
           }}
            //make the motor go right
        }
        else if(state==manual){
            
        }
        else if (state==WAITFORTARGET){
            if (beta!=5000){}// magic arbtrary number
            
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
