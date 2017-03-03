package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="Test", group="11052")
public class Test extends LinearOpMode{

    RobotInit robot = new RobotInit();

    @Override
    public void runOpMode(){

        robot.init();

        while (opModeIsActive()){
            robot.left.setPower(robot.left.getPower() + gamepad1.left_stick_y * robot.slow * robot._new);
            robot.right.setPower(robot.right.getPower() + gamepad1.right_stick_y * robot.slow * robot._new);

            if (gamepad1.a){
                robot.slowing = false;
                robot.m1.setPower(0.6);
                robot.m2.setPower(0.6);
            }

            if (gamepad1.b){
                robot.slowing = true;
            }

            if (robot.slowing){
                robot.m1.setPower(robot.m1.getPower() * robot.shootOld);
                robot.m2.setPower(robot.m1.getPower() * robot.shootOld);
            }

            if (gamepad1.right_trigger > 0){
                robot.roll.setPower(1);
            }else if (gamepad1.left_stick_y>0){
                robot.roll.setPower(1);
            }else robot.roll.setPower(0);

            telemetry.addData("Power",robot.left.getPower());
            telemetry.update();
        }
    }
}
