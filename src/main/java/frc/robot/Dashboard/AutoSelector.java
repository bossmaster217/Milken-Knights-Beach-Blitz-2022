// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Dashboard;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Autonomous.Commands.Turn;
import frc.robot.Dashboard.AutoDriveChoose.AutoPosition;

/** Add your docs here. */
public class AutoSelector {
    private AutoDriveChoose mAutoDriveChoose = AutoDriveChoose.getInstance();
    
    public Command getSelectedDriveCommand()
    {
        switch(mAutoDriveChoose.getSelected())
        {
            case LEFT:
                return new Turn(90);

            case NOTHING:
                return null;
            
            default:
                return null;
        }
    }
}