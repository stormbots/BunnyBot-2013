/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2811.BunnyBot2013.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc2811.BunnyBot2013.RobotMap;

/**
 *
 * @author 128925
 */
public class RabbitPusher extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Solenoid rabbitPusher = RobotMap.rabbitPusher;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void pushRabbit(boolean input){
        rabbitPusher.set(input);        
    }
}
