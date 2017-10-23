package org.firstinspires.ftc.team9374;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by lego7_000 on 10/14/2017.
 */

public class Robot {
    /******************************************\
    |*****************Definitions**************|
    \******************************************/
    private DcMotor frontLeft;
    private DcMotor frontRight;
    private DcMotor backLeft;
    private DcMotor backRight;

    public double xVelocity;
    public double yVelocity;
    public double angular;
    public int speed;

    public int stopwatch;

    public void init(HardwareMap hardwareMap) {
        /******************************************\
        |*************Initializations**************|
        \******************************************/
        //Motors
        frontLeft = hardwareMap.dcMotor.get("DriveFrontLeft");
        frontRight = hardwareMap.dcMotor.get("DriveFrontRight");
        backLeft = hardwareMap.dcMotor.get("DriveBackLeft");
        backRight = hardwareMap.dcMotor.get("DriveBackRight");

        frontRight.setDirection(DcMotor.Direction.REVERSE);
        backRight.setDirection(DcMotor.Direction.REVERSE);
        speed = 3;
    };

    public void addVector(double h, double l) {
        xVelocity = h/3/(speed-1);
        yVelocity = l/3/(speed-1);
    }

    public void addScalar(double a) {
        angular = a/3/(speed-1);
    }

    public void setSpeed(int speedSetting) {
        speed = speedSetting;
    }

    public double[] getMotors() {
        double fl;
        double fr;
        double bl;
        double br;
        if (speed > 1) {
            fl = yVelocity - xVelocity + angular;
            fr = yVelocity + xVelocity - angular;
            bl = yVelocity + xVelocity + angular;
            br = yVelocity - xVelocity - angular;
        } else {
            fl = yVelocity *3;
            fr = yVelocity *3;
            bl = yVelocity *3;
            br = yVelocity *3;
        }
        double[] res;
        res = new double[4];
        res[0] = fl;
        res[1] = fr;
        res[2] = bl;
        res[3] = br;
        return res;
    }

    public void runMotors(double[] motors) {
        frontLeft.setPower(motors[0]);
        frontRight.setPower(motors[1]);
        backLeft.setPower(motors[2]);
        backRight.setPower(motors[3]);
    }

    public void stopwatch() {
        stopwatch++;
    }

    public void stopwatchReset() {
        stopwatch = 0;
    }
>>>>>>> 3b8d20f1e086b983467785bfe2607f53c890fca6
}
