package frc.robot.commands;

import frc.robot.subsystems.ArmSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
import java.lang.Math;

public class TestArmCommand extends CommandBase{
    private final ArmSubsystem arm;
    private int ticks;
    public TestArmCommand(ArmSubsystem arm){
        this.arm = arm;
        addRequirements(arm);
    }
    @Override
    public void initialize() {
        System.out.println("Begin test arm command");
        int ticks = 0;
    }
    @Override
    public void execute(){
        ticks++;
        arm.armMotor1speed(Math.cos(ticks));
        arm.armMotor2speed(Math.sin(ticks));
    }
    @Override
    public boolean isFinished(){
        return ticks > 600;
    }
    @Override
    public void end(boolean interrupted){
        arm.armMotorsSpeed(0);
    }
}
