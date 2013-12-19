package org.usfirst.frc2811.BunnyBot2013.subsystems;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc2811.BunnyBot2013.SocketPi;
//import org.usfirst.frc3946.UltimateAscent.commands.PrintPiData;

/**
 *
 * @author Gustave Michel
 */
public class RaspberryPi extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    SocketPi raspberryPi;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
//        setDefaultCommand(new PrintPiData());
    }
    public SocketPi getPi() {
        return raspberryPi;
    }
    
    public RaspberryPi() {
        super();
//        raspberryPi = new SocketPi();
        System.out.println(this.getClass().getName()+" Initialized");
    }
}
