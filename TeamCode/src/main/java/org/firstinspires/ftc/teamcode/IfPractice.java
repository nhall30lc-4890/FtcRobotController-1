package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class IfPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        boolean aButton = gamepad1.a;
        double leftY = gamepad1.left_stick_y;
        if (aButton) {
            telemetry.addData("A Button", "Pressed!");
        }
        else {
            telemetry.addData("A button", "Not Pressed");
        }
        if (leftY < 0) {
            telemetry.addData("Left Stick Y", "Is Negative");
        }
        else if (leftY > 0.5) {
            telemetry.addData("Left Stick Y", "Greater Than 50%");
        }
        else if (leftY > 0) {
            telemetry.addData("Left Stick Y", "Is Positive!");
        }
        else {
            telemetry.addData("Left Sick Y", "Is 0");
        }
        if (leftY < 0.1 && leftY > -0.1) {
            telemetry.addData("Left stick Y", "In Dead Zone");
        }
        telemetry.addData("A button State", aButton);
        telemetry.addData("LeftY Value", leftY);
    }
}

/*
1. make a turbo button IF a button is NOT pressed multiple motor speed by 0.5, otherwise use standard speed
 */

/*

AND = && if (leftY < 0.5 && leftY > 0) {}
OR = || if (leftY > 0 || rightY > 0) {}
NOT = ! if (!clawClosed) {}

 */
