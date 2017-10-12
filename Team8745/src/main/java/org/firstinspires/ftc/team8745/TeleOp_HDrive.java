package org.firstinspires.ftc.team8745;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by rose on 10/7/17.
 */
@TeleOp(name = "H-Drive Test Oct. 7")
public class TeleOp_HDrive extends OpMode {

    private Robot robot = new Robot();

    @Override
    public void init() {
        robot.init(hardwareMap);


    }
    //Comment line below.
    boolean wasBumper = false;
    boolean sideMode = false;

    // If one value is greater than another and the first value is greater than the third value, return 1. Otherwise, 0.
    public static int test(float stickL, float stick1, float stick2) {
        int yes = 0;
        if (Math.abs(stickL)>Math.abs(stick1)&&Math.abs(stickL)>Math.abs(stick2)){
            yes = 1;
        }
        else {
            yes = 0;
        }
        return yes;
    }
    @Override
    public void loop() {
        float r_stick = gamepad1.right_stick_y;
        float l_stick = gamepad1.left_stick_y;
        boolean up = gamepad2.dpad_up;
        boolean r_Bumper = gamepad1.right_bumper;
        float l_stick_x = gamepad1.left_stick_x;
        float r_stick_x = gamepad1.right_stick_x;

        float neg_l = l_stick_x*(0-1);
        float neg_r = r_stick_x*(0-1);

        //Comment here
        /*boolean r_click = false;
        r_click = wasBumper&&!r_Bumper;
        wasBumper = r_Bumper;

        if (r_click){
            sideMode = !sideMode;
        }*/
        //To here

        /*
        Python:
        if x==5:
            x=6
        Java:
        if (x==5){
        x=6;
        }
    */

        //Comment line below

        // Basically, if the left stick x value is greater than its y value and the right stick's x value, turn on side mode.
        if (test(l_stick_x,l_stick,r_stick) == 1) {
            sideMode = true;
        }
        else {
            sideMode = false;
        }
        //To here

        //If sidemode is true, the middle motor's power is set to the left stick's x value. It moves the bot left or right.
        if (!sideMode){
            robot.left_b.setPower(l_stick);
            robot.left_f.setPower(l_stick);
            robot.right_b.setPower(r_stick);
            robot.right_f.setPower(r_stick);
        }
        else {
            robot.middle.setPower(l_stick_x);
        }
    }
}