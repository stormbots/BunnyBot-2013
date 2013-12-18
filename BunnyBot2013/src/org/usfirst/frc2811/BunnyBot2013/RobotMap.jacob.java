package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedController;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // declare SpeedControllers here
    public static SpeedController motor1;
    public static SpeedController motor2;
    public static SpeedController motor3;
    public static SpeedController motor4;
    public static SpeedController motor5;
    public static SpeedController motor6;
    public static SpeedController motor7;
    public static SpeedController motor8;
    public static SpeedController motor9;
    
    
    //public static boolean bvtrigger;
    public static DigitalOutput light;
    public static void init(){
       
        
        //bvtrigger = OI.trigger.get();
        light = new DigitalOutput(7);
    }
}
