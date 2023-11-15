package frc.robot.commands.autonomous_commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.DriveDistance;
import frc.robot.commands.TurnDegrees;
import frc.robot.subsystems.Drivetrain;

public class AutonomousSquare extends SequentialCommandGroup{
    
    private final Drivetrain drivetrain;
    
    public AutonomousSquare(Drivetrain drivetrain){
        this.drivetrain = drivetrain;

        addCommands(
            new DriveDistance(-0.5, 10, drivetrain),
            new TurnDegrees(-0.5, 90, drivetrain),
            new DriveDistance(-0.5, 10, drivetrain),
            new TurnDegrees(-0.5, 90, drivetrain),
            new DriveDistance(-0.5, 10, drivetrain),
            new TurnDegrees(-0.5, 90, drivetrain),
            new DriveDistance(-0.5, 10, drivetrain)
        );
    }
}
