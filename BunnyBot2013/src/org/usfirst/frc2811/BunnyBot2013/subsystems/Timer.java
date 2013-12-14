/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2811.BunnyBot2013.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc2811.BunnyBot2013.commands.TimeControl;

/** This subsystem is a factory method timer class.
 ** To use, type in Robot.timer.get();
 * @author Kelson
 */
public class Timer extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private double time;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new TimeControl());
    }
    public void setTime(double inputtime){
        time = inputtime;
    }
    public double get(){
        return time;
    }
}
