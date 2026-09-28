package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class GamePadPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        // runs 50x a second
        double speedForward = -gamepad1.left_stick_y / 2.0;

        telemetry.addData("x", gamepad1.left_stick_x);
        telemetry.addData("y",speedForward);
        telemetry.addData("a button", gamepad1.a);
    }

    /*
    1 add telemetry for the right joystick.
    2. add telemetry for the B button.
    3. add telemetry data to report the DIFFERNCE between X left joystick and X right joystick.
    4. add telemetry data to report the sum of both rear triggers.
     */
}
