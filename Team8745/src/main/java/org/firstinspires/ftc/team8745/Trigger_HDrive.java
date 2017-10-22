package org.firstinspires.ftc.team8745;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


/**
 * Created by rose on 10/11/17.
 */
@Disabled
@TeleOp(name = "Trigger H-Drive Test Oct. 11")
public class Trigger_HDrive extends OpMode {

    private HDrive_BadRobot HDriveBadRobot = new HDrive_BadRobot();

    @Override
    public void init() {
        HDriveBadRobot.init(hardwareMap);


    }
    //Comment line below.
    boolean wasBumper = false;
    boolean sideMode = false;

    // If one value is greater than another and the first value is greater than the third value, return 1. Otherwise, 0.
    public static int test(float stickL, float stick1, float stick2) {
        int yes = 0;
        if (Math.abs(stickL)!=0&&Math.abs(stickL)>Math.abs(stick1)&&Math.abs(stickL)>Math.abs(stick2)){
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
        float r_trigger = gamepad1.right_trigger;
        float l_trigger = gamepad1.left_trigger;
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

            if(r_trigger>l_trigger){
            HDriveBadRobot.middle.setPower(r_trigger);
            }
            else{
            HDriveBadRobot.middle.setPower(-l_trigger);
            }

            HDriveBadRobot.left_b.setPower(l_stick);
            HDriveBadRobot.left_f.setPower(l_stick);
            HDriveBadRobot.right_b.setPower(r_stick);
            HDriveBadRobot.right_f.setPower(r_stick);


    }
}