/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2811.BunnyBot2013.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc2811.BunnyBot2013.RobotMap;
import org.usfirst.frc2811.BunnyBot2013.commands.*;
import edu.wpi.first.wpilibj.*;

/**
 *
 * @author Laurel Bingham
 */
public class LaunchSpeedControl extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
       
        
    }
    //variables
    //connstants
    double grav = 386.09; //gravity in inches per second 
    double rad = 4; //radius of wheel
    double hcam = 30; // in inches, hight of camera not real hight
    /*               ____________________________
     *              /    __________h________ 
     *             /     (sin(alpha)cos(alpha)/X - g*cos2(alpha)/2x
     * Velocity= V   
     * 
     */
    /**
     * Returns angular velocity we need to hit target alpha degrees below horizon 
     * @return 
     */
    public double calculate(double theta){
        //maths here
        double alpha=35.0;//degrees, launch angle
        double cosa = Math.cos(Math.toDegrees(alpha));// cosine of alpha
        //double theta = 45.0;// will be called from camera when code is ready, should not be a constant
        double tant = Math.tan(Math.toDegrees(theta));// tangent of theta, first calculation for equations we wrote
        double cosa2 = cosa*cosa;// cosine of alpha squared
        double velocity ;// velocity before calculaion
        double angvelocity;// angular velocity before calculation
        double sina = Math.sin(Math.toDegrees(alpha));
        double equa1 = ((sina*cosa)/(hcam/tant));//sin of alpha times cos of alpha divided by distance (hight of camera/tangent of theta)
        double equa2 = ((grav*cosa2)/(2*(hcam/tant)));//gravity times cos squared divided by two times the distance(hight of camera/tangent of theta)
        velocity = Math.sqrt((hcam)/(equa1-equa2)); 
        angvelocity = velocity/rad;
        System.out.println(angvelocity);
   return angvelocity;
   
    }
}
