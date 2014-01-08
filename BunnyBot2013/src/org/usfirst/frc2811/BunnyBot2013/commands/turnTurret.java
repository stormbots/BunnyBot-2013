/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2811.BunnyBot2013.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2811.BunnyBot2013.OI;
import org.usfirst.frc2811.BunnyBot2013.Robot;

/**
 *
 * @author Kelson
 */
public class turnTurret extends Command {
    Joystick a;
    boolean joystickcontrol;
    public turnTurret() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.ballShooter);
        a = Robot.oi.getJoystick2();
        joystickcontrol = false;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (joystickcontrol) {
            Robot.ballShooter.manualTurretRotate(a.getRawAxis(2));
            
        } else {
            if (OI.turretLeft.get()) {
                Robot.ballShooter.turnTurretLeft();
            } else if (OI.turretRight.get()){
                Robot.ballShooter.turnTurretRight();
            } else {
                Robot.ballShooter.turnTurretStop();
            }
        }
        if (!OI.reverseShooter.get()){
            Robot.ballShooter.manualSpeedontrol(0.2+(-a.getRawAxis(3)+1)/2*(OI.overVoltShooter.get()?0.8:0.3));

        } else {
            Robot.ballShooter.manualSpeedontrol(-0.75);
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
