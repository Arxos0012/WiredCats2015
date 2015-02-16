package org.usfirst.frc.team2415.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	
	//TODO: Set correct port values once systems are finished!
	
	public static final int LEFT_TALON = 0;
	public static final int RIGHT_TALON = 9;
	
	public static final int[] MJ_TALONS = {1,8};
	
	public static final int[] ELEVATOR_CAN_TALONS = {10,11};		//CAN module
	
	public static final int[] LEFT_ENCODER = {9,8};
	public static final int[] RIGHT_ENCODER = {7,6};
	
	public static final int EVELATOR_HALL_EFFECT = 3;	//DIO port
	
	public static final int[] ELEVATOR_ENCODER = {5,4};
	
	public static final int[] ELEVATOR_BREAK_SOLENOID = {0,0};
	
	public static final int[] ELEVATOR_PUSH_SOLENOID = {0,0};
	
	public static final int[] LEFT_CHEEK = {0,0};
	public static final int[] RIGHT_CHEEK = {0,0};
	
	public static final int GYRO = 0;
}
