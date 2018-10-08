/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3019.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import org.usfirst.frc.team3019.robot.subsystems.*;
import org.usfirst.frc.team3019.util.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends IterativeRobot {
	public static Drivetrain driveTrain;
	public static Climber climber;
	public static ClawRotator clawRotator;
	public static IntakeSystem intakeSystem;
	public static ArmRotator armRotator;
	public static OI oi;

	SendableChooser<String> station = new SendableChooser<String>();
	SendableChooser<Boolean> shouldRecord = new SendableChooser<Boolean>();
	SendableChooser<String> switchSide = new SendableChooser<String>();
	// SendableChooser<String> scaleSide = new SendableChooser<String>();
	Recorder recorder;
	Playback auto;
	String gameMessage;

	/**
	 * This function is run when the robot is first started up and should be used
	 * for any initialization code.
	 */
	@Override
	public void robotInit() {
		driveTrain = new Drivetrain();
		climber = new Climber();
		clawRotator = new ClawRotator();
		intakeSystem = new IntakeSystem();
		armRotator = new ArmRotator();
		oi = new OI();

		// Add in auto
	}

	/**
	 * This function is called once each time the robot enters Disabled mode. You
	 * can use it to reset any subsystem information you want to clear when the
	 * robot is disabled.
	 */
	@Override
	public void disabledInit() {
		
	}

	@Override
	public void disabledPeriodic() {

		Scheduler.getInstance().run();
	}

	/**
	 * <p>
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons to
	 * the switch structure below with additional strings & commands.
	 */
	
	@Override
	public void autonomousInit() {
		// Add in auto

	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		oi.xbox.setPlaybackMode(false);
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}
