// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.


package org.usfirst.frc2811.BunnyBot2013;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder.PIDSourceParameter;
import edu.wpi.first.wpilibj.can.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * AT ALL COSTS: avoid adding code in between the generated code comments.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController chassisDriveMotor1;
    public static SpeedController chassisDriveMotor2;
    public static SpeedController chassisDriveMotor3;
    public static SpeedController chassisDriveMotor4;
    public static RobotDrive chassisRobotDrive41;
  //  public static DoubleSolenoid chassisGearShifter1;
  //  public static DoubleSolenoid chassisGearShifter2;
    public static SpeedController ballShooterShooterSpeedMotor;
    public static Encoder ballShooterShooterSpeedSensor;
    public static SpeedController ballManagerIntakeMotor;
    public static DigitalInput ballManagerIntakeSensor;
    public static Solenoid ballManagerBallBlocker;
    public static SpeedController ballManagerClimberMotor;
    public static DigitalInput ballManagerBallExitSensor;
    public static Encoder towerRotateTowerRotateSensor;
    public static SpeedController towerRotateTowerRotateMotor;
    public static Solenoid rabbitPusher;
    public static DigitalInput limitSwitch;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        rabbitPusher = new Solenoid(1, 6);
        
        chassisDriveMotor1 = new Talon(1, 1);
//	LiveWindow.addActuator("Chassis", "DriveMotor1", (Talon) chassisDriveMotor1);
        
        chassisDriveMotor2 = new Talon(1, 2);
//	LiveWindow.addActuator("Chassis", "DriveMotor2", (Talon) chassisDriveMotor2);
        
        chassisDriveMotor3 = new Talon(1, 3);
//	LiveWindow.addActuator("Chassis", "DriveMotor3", (Talon) chassisDriveMotor3);
        
        chassisDriveMotor4 = new Talon(1, 4);
//	LiveWindow.addActuator("Chassis", "DriveMotor4", (Talon) chassisDriveMotor4);
        
        chassisRobotDrive41 = new RobotDrive(chassisDriveMotor1, chassisDriveMotor2,
              chassisDriveMotor3, chassisDriveMotor4);
	
        chassisRobotDrive41.setSafetyEnabled(true);
        chassisRobotDrive41.setExpiration(0.1);
        chassisRobotDrive41.setSensitivity(0.5);
        chassisRobotDrive41.setMaxOutput(1.0);

      //  chassisGearShifter1 = new DoubleSolenoid(1, 2, 3);      
	
        
     //   chassisGearShifter2 = new DoubleSolenoid(1, 4, 5);      
	
        ballShooterShooterSpeedMotor = new Jaguar(1,8);
    //   try {
    //        ballShooterShooterSpeedMotor = new CANJaguar(1); // ID number of jaguar
    //       
    //    } catch (CANTimeoutException ex) {
           
    //    }
        
        ballShooterShooterSpeedSensor = new Encoder(1, 1, 1, 2, false, EncodingType.k4X);
//	LiveWindow.addSensor("BallShooter", "ShooterSpeedSensor", ballShooterShooterSpeedSensor);
        ballShooterShooterSpeedSensor.setDistancePerPulse(1.0);
        ballShooterShooterSpeedSensor.setPIDSourceParameter(PIDSourceParameter.kRate);
        ballShooterShooterSpeedSensor.start();
        ballManagerIntakeMotor = new Talon(1, 5);
//	LiveWindow.addActuator("BallManager", "IntakeMotor", (Talon) ballManagerIntakeMotor);
        
        ballManagerIntakeSensor = new DigitalInput(1, 3);
//	LiveWindow.addSensor("BallManager", "IntakeSensor", ballManagerIntakeSensor);
        
        ballManagerBallBlocker = new Solenoid(1, 1);
//	LiveWindow.addActuator("BallManager", "BallBlocker", ballManagerBallBlocker);
        
        ballManagerClimberMotor = new Talon(1, 7);
//	LiveWindow.addActuator("BallManager", "ClimberMotor", (Talon) ballManagerClimberMotor);
        
        ballManagerBallExitSensor = new DigitalInput(1, 6);
//	LiveWindow.addSensor("BallManager", "BallExitSensor", ballManagerBallExitSensor);
        
        towerRotateTowerRotateSensor = new Encoder(1, 4, 1, 5, false, EncodingType.k4X);
//	LiveWindow.addSensor("TowerRotate", "TowerRotateSensor", towerRotateTowerRotateSensor);
        towerRotateTowerRotateSensor.setDistancePerPulse(1.0);
        towerRotateTowerRotateSensor.setPIDSourceParameter(PIDSourceParameter.kRate);
        towerRotateTowerRotateSensor.start();
        towerRotateTowerRotateMotor = new Talon(1, 6);
//	LiveWindow.addActuator("TowerRotate", "TowerRotateMotor", (Talon) towerRotateTowerRotateMotor);
        
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
