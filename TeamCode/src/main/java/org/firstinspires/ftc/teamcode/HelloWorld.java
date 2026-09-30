package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;



@Autonomous
@TeleOp
public class HelloWorld extends OpMode {

    @Override
    public void init() {
        telemetry.addData("Hello", "Noah");
    }


    @Override
    public void loop() {

        /*
        1. Hello: world, change the telemetary data to display "Hello: Your name" DONE
        2. Run this code in the Autonomous section of your DS. DONE
         */

    }
}
