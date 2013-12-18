
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.commands.newCommandGroup;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
   
public class OI {
    //atk3 is the Attack 3 joystick
    //da is the Dual Action controller
    //public static Joystick atk3 = new Joystick(1);
    public static Joystick da;
    public static Button b1;
    public static Button b2 = new JoystickButton(da, 2);
    public static Button b3 = new JoystickButton(da, 3);
    public static Button b4 = new JoystickButton(da, 4);
    public static Button b5 = new JoystickButton(da, 5);
    public static Button b6 = new JoystickButton(da, 6);
    public static Button b7 = new JoystickButton(da, 7);
    public static Button b8 = new JoystickButton(da, 8);
    public static Button b9 = new JoystickButton(da, 9);
    public static Button b10 = new JoystickButton(da, 10);
    
    // Button button = new JoystickButton(stick, buttonNumber);
   //atk3 buttons
   //public static Button trigger = new JoystickButton(atk3, 1);
   
   //da buttons
   
    
  //must have public static or it will not work!
   public static SpeedController motor1 = new Victor (1,1);
   public static SpeedController motor2 = new Jaguar (1,2);
   public static SpeedController motor3 = new Jaguar (1,3);
   public static SpeedController motor4 = new Jaguar (1,4);
   public static SpeedController motor5 = new Jaguar (1,5);
   public static SpeedController motor6 = new Jaguar (1,6);
   public static SpeedController motor7 = new Jaguar (1,7);
   public static SpeedController motor8 = new Jaguar (1,8);
   public static SpeedController motor9 = new Jaguar (1,9);
    
   public OI(){
    //declare the buttons here
    da = new Joystick(1);
    b1 = new JoystickButton(da, 1);
    b2 = new JoystickButton(da, 2);
    b3 = new JoystickButton(da, 3);
    b4 = new JoystickButton(da, 4);
    b5 = new JoystickButton(da, 5);
    b6 = new JoystickButton(da, 6);
    b7 = new JoystickButton(da, 7);
    b8 = new JoystickButton(da, 8);
    b9 = new JoystickButton(da, 9);
    b10 = new JoystickButton(da, 10);
    
    //what the buttons do
    //b1.whenPressed(new newCommandGroup());
    b1.whenPressed(new newCommandGroup());
    
    
   }
    
    
    
    
    
}
    
    
    

