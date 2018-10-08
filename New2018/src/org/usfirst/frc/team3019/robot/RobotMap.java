/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3019.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static int xbox1port = 1;  
	
	// This value is here in case when you try to move forward, 
	// you are moving backwards. If this happens, change to true
	public static boolean orientForward = false;
	
	//Use these to change how fast each system moves
	public static double DRIVE_SCALE_FACTOR = 1.0;
	public static double CLAW_ROTATE_SCALE_FACTOR = 0.4;
	public static double CLIMB_SCALE_FACTOR = 1.0;
	public static double ARM_ROTATE_SCALE_FACTOR = 0.8;//0.4
	public static double INTAKE_SCALE_FACTOR = 1.0;
	public static double TURN_SCALE_FACTOR = 1.0;
	
	// Drive
	public static int leftFront = 2;
	public static int leftBack = 1;
	public static int rightFront = 3;
	public static int rightBack = 4;
	
	// PWM Ports ("Claw" is the intake)
	public static int climbMotor = 4;
	public static int clawRotateMotorOne = 2;
	public static int leftIntakeMotor = 0;
	public static int rightIntakeMotor = 1;
	public static int rotateArmMotorOne = 6;
	public static int rotateArmMotorTwo = 7;
	
	// DigitalInput
	public static int clawSwitch = 6;
	public static int intakeStopSwitch = 3;
	public static int armRotateSwitch = 4;
}
