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
       double[] distance;
                    
         distance = new double[19];
          
         distance[0] = .05;
         distance[1] = .1;
         distance[2] =.15;
         distance [3] =.2;
         distance [4] = .25;
         distance [5] = .3;
         distance [6] = .35;
         distance [7] = .4;
         distance [8] = .45;
         distance [9] = .5;
         distance [10] = .55;
         distance [11] = .60;
         distance [12] = .65;
         distance [13] = .70;
         distance [14] = .75;
         distance [15] = .80;
         distance [16] = .85;
         distance [17] = .90;
         distance [18] = .95;
         distance [19] = 1.00;
                 
                            
    }
    
                 
    //variables
//    //connstants
//    double grav = 386.09; //gravity in inches per second 
//    double rad = 4; //radius of wheel
//    double hcam = 30; // in inches, hight of camera not real hight
//    /*                 ____________________________
//     *               /    __________h________ 
//     *              /     (sin(alpha)cos(alpha)/X - g*cos2(alpha)/2x
//     * Velocity = V   
//     * 
//     */
//    /** t
//     * Returns angular velocity we need to hit target alpha degrees below horizon IN INCHES and SECONDS!!!!!!!!!
//     * @return 
//     */
//    public double calculate(double theta){
//        //maths here
//        double alpha=35.0;//degrees, launch angle, not real value
//        double cosa = Math.cos(Math.toDegrees(alpha));// cosine of alpha
//        //double theta = 45.0;// will be called from camera when code is ready, should not be a constant
//        double tant = Math.tan(Math.toDegrees(theta));// tangent of theta, first calculation for equations we wrote
//        double cosa2 = cosa*cosa;// cosine of alpha squared
//        double velocity ;// velocity before calculaion
//        double angvelocity;// angular velocity before calculation
//        double sina = Math.sin(Math.toDegrees(alpha));
//        double equa1 = ((sina*cosa)/(hcam/tant));//sin of alpha times cos of alpha divided by distance (hight of camera/tangent of theta)
//        double equa2 = ((grav*cosa2)/(2*(hcam/tant)));//gravity times cos squared divided by two times the distance(hight of camera/tangent of theta)
//        
//        velocity = Math.sqrt((hcam)/(equa1-equa2)); 
//        angvelocity = velocity/rad;
//        System.out.println(angvelocity);
//   return angvelocity;
   
 //   }
}
