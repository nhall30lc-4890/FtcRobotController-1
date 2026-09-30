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

        telemetry.addData("x leftstick", gamepad1.left_stick_x);
        telemetry.addData("y leftstick",speedForward);
        telemetry.addData("a button", gamepad1.a);
        telemetry.addData("b button", gamepad1.b)
        telemetry.addData("x rightstick", gamepad1.right_stick_x);
        telemetry.addData("y rightstick", gamepad1.right_stick_y);
        telemetry.addData("Differnce of X", gamepad1.left_stick_x - gamepad1.right_stick_x );
        telemetry.addData("Sum of triggers", gamepad1.left_trigger + gamepad1.right_trigger);
    }

    /*
    1. add telemetry for the right joystick. DONE
    2. add telemetry for the B button. DONE
    3. add telemetry data to report the DIFFERNCE between X left joystick and X right joystick. DONE
    4. add telemetry data to report the sum of both rear triggers. DONE
     */
}
