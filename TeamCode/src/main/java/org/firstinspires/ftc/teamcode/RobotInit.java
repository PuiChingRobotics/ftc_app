package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class RobotInit {

    public DcMotor left;
    public DcMotor right;
    public DcMotor m1;
    public DcMotor m2;
    public DcMotor roll;

    double fast = 1;
    double slow = 0.6;
    double _new = 0.2;
    double _old = 0.8;
    double shootOld = 0.95;
    boolean slowing = false;

    public HardwareMap hw;

    public void RobotInit(){

    }


    public void init(){
        left = hw.dcMotor.get("left");
        right = hw.dcMotor.get("right");
        m1 = hw.dcMotor.get("m1");
        m2 = hw.dcMotor.get("m2");
        roll = hw.dcMotor.get("roll");

        left.setDirection(DcMotor.Direction.REVERSE);
        m2.setDirection(DcMotor.Direction.REVERSE);
    }

}
