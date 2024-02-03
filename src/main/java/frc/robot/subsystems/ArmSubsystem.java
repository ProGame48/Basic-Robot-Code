package frc.robot.subsystems;

import com.revrobotics.CANSparkMax; //CANSparkMax import, Motor controller import
import edu.wpi.first.wpilibj2.command.SubsystemBase; // Subsystem base connects all substystems (All subsystems extend this one)
import com.revrobotics.CANSparkMaxLowLevel.MotorType; //Motortype import
import src\main\java\frc\robot\Constants.java; //Constants import (Ports are in there)

public class ArmSubsystem extends SubsystemBase{
    private final CANSparkMax Arm_Motor_1; //Initiate the two arm motors, they exist now
    private final CANSparkMax Arm_Motor_2;
    //I made the speed final because I do not plan on changing it, DO NOT DO THIS OR ROBOT WILL MOVE AT ONE SPEED
    private final double speed = OperatorConstants.SPEED; //The SPEED constant is instantiated in the variable 'speed' not to be confused with the parameter 'speed'
    //Constructor sets the ports
    public ArmSubsystem(){
        this.Arm_Motor_1 = new CANSparkMax(Constants.Arm_Motor_1_Port, MotorType.kBrushless); //Set the port and type of the two motors
        this.Arm_Motor_2 = new CANSparkMax(Constants.Arm_Motor_2_Port, MotorType.kBrushless); 
    }
    //set the speeds, HOMEWORK STATED: 1 method sets motor 1, one method sets 2, one method sets both. I know its repetitive, but SHUT UP (It was required)
    public void armMotor1speed(double speed){
        this.Arm_Motor_1.set(speed); //Don't worry about the set() method, it comes with the library
    }
    public void armMotor2speed(double speed){
        this.Arm_Motor_2.set(speed);
    }
    public void armMotorsSpeed(double speed){
        this.Arm_Motor_1.set(speed);
        this.Arm_Motor_1.set(speed);
    }
    //This is where the motors will be called and moved (I think)
    public void ITSALIVE(){
        armMotor1speed(speed);
        armMotor2speed(speed);
        armMotorsSpeed(speed);
    }
}