package org.firstinspires.ftc.team8745;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by rose on 10/7/17.
 */
@TeleOp(name = "TELEOP Color Sensor Test")
public class Autonomous_JewelKnockOff extends OpMode {

    private Robot robot = new Robot();

    @Override
    public void init() {

        robot.init(hardwareMap);
    }

    /*
         * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
         */
    @Override
    public void init_loop() {
        robot.jewelKnockOff.setPosition(0.5);
    }

    @Override
    public void loop() {

        boolean rightBumper = gamepad1.right_bumper;
        //rightBumper is equal to true if the gamepad's right bumper is pressed and false otherwise.

        int redSensorData = robot.colorSensor.red();
        int blueSensorData = robot.colorSensor.blue();

        int greenSensorData = robot.colorSensor.green();

        telemetry.addData("Color Sensor", robot.colorSensor.argb());


        //While the right bumper is pressed repeat the code inside.
        if (rightBumper) {

            if (redSensorData>blueSensorData) {

                robot.right_b.setPower(1);
                robot.right_f.setPower(1);

                robot.left_b.setPower(1);
                robot.left_f.setPower(1);

            }

            if (blueSensorData>redSensorData) {
                robot.right_b.setPower(-1);
                robot.right_f.setPower(-1);

                robot.left_b.setPower(-1);
                robot.left_f.setPower(-1);
            }
        }
    }

}










