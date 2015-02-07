package org.usfirst.frc.team2415.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team2415.robot.Robot;

/**
 *
 */
public class ToggleMakeItClapCommand extends Command {

    public ToggleMakeItClapCommand() {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.bootySubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	if(Robot.bootySubsystem.getCheeks()[0] == Robot.bootySubsystem.CLENCH) Robot.bootySubsystem.unclench();
    	else Robot.bootySubsystem.SSclench();
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
