/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.commands.ExampleCommand;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends IterativeRobot {

    Command autonomousCommand;
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        // instantiate the command used for the autonomous period
        autonomousCommand = new ExampleCommand();
        // Initialize all subsystems
        CommandBase.init();
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
        autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
	// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        autonomousCommand.cancel();
        
        
        
        
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        
    
        //if it isn't broken, don't fix it!
        //declare the motor axis here; this makes the motors run    AAAA
        //OI.motor1.set(OI.stick.getRawAxis(1));
       
        //atk3
        //OI.motor1.set(OI.atk3.getRawAxis(1));
       //OI.motor2.set(OI.atk3.getRawAxis(1));
       //OI.motor3.set(OI.atk3.getRawAxis(2));
       //OI.motor4.set(OI.atk3.getRawAxis(2));
        
        //da
        OI.motor1.set(OI.da.getRawAxis(1));
        OI.motor2.set(OI.da.getRawAxis(1));
        OI.motor3.set(OI.da.getRawAxis(1));
        OI.motor4.set(OI.da.getRawAxis(1));
        OI.motor5.set(OI.da.getRawAxis(1));
        OI.motor6.set(OI.da.getRawAxis(2));
        OI.motor7.set(OI.da.getRawAxis(2));
        OI.motor8.set(OI.da.getRawAxis(2));
        OI.motor9.set(OI.da.getRawAxis(2));
        //if it isn't broken, don't fix it!
        
        //RobotMap.light.set(false);
        
        
       
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
