package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by user on 14/12/2016.
 */

@TeleOp(name = "Test", group = "11052")
public class Test extends LinearOpMode
{
    private DcMotor Left;
    private DcMotor Right;

    public void runOpMode() throws  InterruptedException{
        Left = hardwareMap.dcMotor.get("Left");
        Right = hardwareMap.dcMotor.get("Right");
        Left.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();
        while (opModeIsActive()){
            Left.setPower(-gamepad1.left_stick_y);
            Right.setPower(-gamepad1.right_stick_y);
        }
        idle();
    }

}