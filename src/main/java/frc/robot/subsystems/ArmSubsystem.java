package frc.robot.subsystems;

import com.revrobotics.CANSparkMax; //CANSparkMax import, Motor controller import
import edu.wpi.first.wpilibj2.command.SubsystemBase; // Subsystem base connects all substystems (All subsystems extend this one)
import com.revrobotics.CANSparkMaxLowLevel.MotorType; //Motortype import
import frc.robot.Constants.PortConstants;//Constants import (Ports are in there)

public class ArmSubsystem extends SubsystemBase{
    private final CANSparkMax Arm_Motor_1; //Initiate the two arm motors, they exist now
    private final CANSparkMax Arm_Motor_2;
    //Constructor sets the ports
    public ArmSubsystem(){
        this.Arm_Motor_1 = new CANSparkMax(PortConstants.Arm_Motor_1_Port, MotorType.kBrushless); //Set the port and type of the two motors
        this.Arm_Motor_2 = new CANSparkMax(PortConstants.Arm_Motor_2_Port, MotorType.kBrushless); 
    }
    //set the speeds, HOMEWORK STATED: 1 method sets motor 1, one method sets 2, one method sets both. I know its repetitive
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
    public void stopMotors(){
        this.Arm_Motor_1.set(0);
        this.Arm_Motor_2.set(0);
    }
    
}