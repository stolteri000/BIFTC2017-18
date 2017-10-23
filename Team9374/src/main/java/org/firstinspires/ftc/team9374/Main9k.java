package org.firstinspires.ftc.team9374;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by lego7_000 on 10/14/2017.
 */

@TeleOp(name="9k Main Opmode", group="9kMechanum")
public class Main9k extends OpMode {
    public Robot robot;

    public void init() {
        robot.init(hardwareMap);
    }

    public void loop() {
        float xv = -gamepad1.left_stick_x;
        float yv = -gamepad1.left_stick_y;
        float a = -gamepad1.right_stick_x;
        int speed = 3;
        if (gamepad1.a) {
            speed = 2;
        } else if (gamepad1.x) {
            speed = 3;
        } else if (gamepad1.y) {
            speed = 4;
        } else if (gamepad1.b) {
            speed = 1;
        }
        robot.addVector(xv, yv);
        robot.addScalar(a);
        robot.runMotors(robot.getMotors());
    }
}
