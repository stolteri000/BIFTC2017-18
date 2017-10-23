package org.firstinspires.ftc.team8745;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;


/**
 * Created by rose on 10/8/17.
 */

public class HDrive_BadRobot {

    public ColorSensor colorSensor;
    public Servo jewelKnockOff;
    public DcMotor left_b;
    public DcMotor left_f;
    public DcMotor right_b;
    public DcMotor right_f;

    public DcMotor middle;

    public void init(HardwareMap hardwareMap) {

        //Front Motors
        left_f = hardwareMap.dcMotor.get("motor-left");
        right_f = hardwareMap.dcMotor.get("motor-right");

        //Back Motors
        left_b = hardwareMap.dcMotor.get("motor-leftBACK");
        right_b = hardwareMap.dcMotor.get("motor-rightBACK");

        middle = hardwareMap.dcMotor.get("motor-MIDDLE");

        //Reverse Mode
        left_b.setDirection(DcMotorSimple.Direction.REVERSE);
        left_f.setDirection(DcMotorSimple.Direction.REVERSE);


    }
}
