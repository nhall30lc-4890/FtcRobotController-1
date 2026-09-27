package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init() {
        int teamNumber = 23014;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        String name = "Noah";


        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("moter speed", motorSpeed);
        telemetry.addData("claw closed", clawClosed);
        telemetry.addData("Name", name);
    }

    @Override
    public void loop() {
        /*
        1. Change  the string variable "name" to your team name
        2. create an int called "motorAngle" and store an angle between 0-180.
         display this in your init meathod.
         */

    }
}
