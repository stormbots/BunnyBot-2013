/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2811.BunnyBot2013.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc2811.BunnyBot2013.Robot;

/**
 *
 * @author Kelson
 */
public class BallBusterGROUP extends CommandGroup {
    private final boolean bustBalls = false;
    public BallBusterGROUP() {
    //requires(Robot.chassis);
        this.addSequential(new wait(2));
        if (!Robot.chassis.getShiftDirection()){
        this.addSequential(new ShiftToggle());
        }
        this.addSequential(new wait(0.2));
        this.addSequential(new DriveBackwardsForTime(bustBalls?3.0:4.0));
        this.addSequential(new wait(0.5));
        this.addSequential(new PushBunny(true));
    }
}
