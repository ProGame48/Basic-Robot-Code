// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other purpose. All constants
 * should be declared globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
	public static class OperatorConstants {
		public static final int DRIVER_CONTROLLER_PORT = 0;
		//Motor Ports
		public static final int Arm_Motor_1_Port = 1;
		public static final int Arm_Motor_2_Port = 2;
		//Set Speed (for both), ONLY ONE VALUE, I AIN'T TAKING TOO MUCH TIME
		public static final double SPEED = 0.2; //I capitalized the constant, do not confuse with parameter "speed"
	}
}
