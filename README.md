BunnyBot-2013
=============

Robot code for the 2013 BunnyBot Competition

OI:         declares joysticks and joystick buttons
Robot:      runs robot in Autonomous and Teleop
RobotMap:   declares all motors and sensors
Commands:   determine robot behaviour
Subsystems: interface with the motors and sensors

FLOWCHART

RobotMap declares sensors > Commands determine what needs to be done > Subsystems tell motors what to do

Remember: commands can call other commands using Command(), but in CommandGroup it's different:

this.addSequential( new Command());
this.addParallel( new Command2());

also, avoid using the same name for things even if it's in a different class and a different type

Accessing the Robot and Testbenches
===================================

Configure your modem as a static IP. (need guide here)

Set the IP as 10.28.81.15

For the Subnet Mask, set it to 255.0.0.0

Useful IPs to note, if you're communicating on this network:

10.28.11.3 cRio
10.28.11.3 webcam connected to cRio
