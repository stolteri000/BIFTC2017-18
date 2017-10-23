package org.firstinspires.ftc.team8745;

        import com.qualcomm.robotcore.eventloop.opmode.OpMode;
        import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
        import com.qualcomm.robotcore.hardware.DcMotor;
        import com.qualcomm.robotcore.hardware.DcMotorSimple;
        import com.qualcomm.robotcore.hardware.HardwareMap;
        import com.qualcomm.robotcore.util.Range;

/**
 * Created by rose on 10/15/17.
 */
@TeleOp(name = "Omni Drive Test Oct. 7")

public class TeleOp_OmniDrive extends OpMode{


    private OmniDriveRobot robot = new OmniDriveRobot();

    @Override
    public void init() {
        robot.init(hardwareMap);

    }

    @Override
    public void loop() {



        float rightStickY = gamepad1.right_stick_y;
        float leftStickY = gamepad1.left_stick_y;
        boolean dpadUp = gamepad2.dpad_up;
        boolean rightBumper = gamepad1.right_bumper;
        float leftStickX = gamepad1.left_stick_x;
        float rightStickX = gamepad1.right_stick_x;

        float BD = Range.clip(.5f*(leftStickX+leftStickY), -1, 1);
        float AC = Range.clip(.5f*(leftStickY-leftStickX), -1, 1);


        float negLeftStickX = leftStickX*(0-1);
        float negRightStickX = rightStickX*(0-1);


            robot.D.setPower(BD);
            robot.B.setPower(BD);
            robot.A.setPower(AC);
            robot.C.setPower(AC);

    }
}