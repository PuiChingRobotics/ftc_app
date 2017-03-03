package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.ClassFactory;


@Autonomous(name="TestAuto", group="11052")
public class TestAuto extends LinearOpMode{

    RobotInit robot = new RobotInit();

    double posFirstStraight = 20000;
    double angleTurn = 45;




    @Override
    public void runOpMode(){

        robot.init();
        robot.runModeSet("position");

        waitForStart();

        while (opModeIsActive()){
            robot.left.setPower(1);
            robot.right.setPower(1);
        }


    }
}
