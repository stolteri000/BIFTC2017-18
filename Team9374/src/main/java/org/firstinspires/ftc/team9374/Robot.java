package org.firstinspires.ftc.team9374;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Main robot class
 */

public class Robot {

    public DcMotor frontRightMotor;
    public DcMotor frontLeftMotor;
    public DcMotor backRightMotor;
    public DcMotor backLeftMotor;
    public ColorSensor colorSensor;
    public Servo jewelServo;

    public Robot() {}

    public void init(HardwareMap hardwareMap) {
        frontRightMotor = hardwareMap.dcMotor.get("frontRightMotor");
    }

}
