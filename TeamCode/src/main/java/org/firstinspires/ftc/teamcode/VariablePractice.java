package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init() {
        int teamNumber = 23014;
        int motorAngle = 100;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        String name = "4890 Aarchive";


        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("moter speed", motorSpeed);
        telemetry.addData("claw closed", clawClosed);
        telemetry.addData("Name", name);
        telemetry.addData("motorAngle",motorAngle);
    }

    @Override
    public void loop() {
        /*
        1. Change  the string variable "name" to your team name. DONE
        2. create an int called "motorAngle" and store an angle between 0-180.
         display this in your init meathod. DONE
         */

    }
}
