/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2811.BunnyBot2013.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author Kelson
 */
public class AutonomousGROUP extends CommandGroup {
    
    public AutonomousGROUP() {
        //this.addSequential(new GetTurretBoundsGROUP());
        this.addParallel(new BallBusterGROUP());
    }
}
