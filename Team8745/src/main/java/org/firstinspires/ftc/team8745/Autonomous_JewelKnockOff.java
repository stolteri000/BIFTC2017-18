package org.firstinspires.ftc.team8745;

//DISABLED!!!!!!!!!!!!!!!!!!!!!!!

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by rose on 10/7/17.
 */
@Disabled
@TeleOp(name = "TELEOP Color Sensor Test")
public class Autonomous_JewelKnockOff extends OpMode {

    private HDrive_BadRobot HDriveBadRobot = new HDrive_BadRobot();

    @Override
    public void init() {

        HDriveBadRobot.init(hardwareMap);
    }

    /*
         * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
         */
    @Override
    public void init_loop() {
        HDriveBadRobot.jewelKnockOff.setPosition(0.5);
    }

    @Override
    public void loop() {

        boolean rightBumper = gamepad1.right_bumper;
        //rightBumper is equal to true if the gamepad's right bumper is pressed and false otherwise.

        int redSensorData = HDriveBadRobot.colorSensor.red();
        int blueSensorData = HDriveBadRobot.colorSensor.blue();

        int greenSensorData = HDriveBadRobot.colorSensor.green();

        telemetry.addData("Color Sensor", HDriveBadRobot.colorSensor.argb());


        //While the right bumper is pressed repeat the code inside.
        if (rightBumper) {

            if (redSensorData>blueSensorData) {

                HDriveBadRobot.right_b.setPower(1);
                HDriveBadRobot.right_f.setPower(1);

                HDriveBadRobot.left_b.setPower(1);
                HDriveBadRobot.left_f.setPower(1);

            }

            if (blueSensorData>redSensorData) {
                HDriveBadRobot.right_b.setPower(-1);
                HDriveBadRobot.right_f.setPower(-1);

                HDriveBadRobot.left_b.setPower(-1);
                HDriveBadRobot.left_f.setPower(-1);
            }
        }
    }

}










