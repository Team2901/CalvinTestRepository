package org.firstinspires.ftc.teamcode.teleop;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.hardware.TestHardware;
@TeleOp (name = "TestTeleopV1")
public class TestTeleop extends OpMode {
    public TestHardware robot = new TestHardware();

    @Override
    public void init() {
        robot.init(this.hardwareMap);
    }

    @Override
    public void loop() {
        double yLeft = -gamepad1.left_stick_y;
        double yRight = -gamepad1.right_stick_y;

        robot.backRight.setPower(yRight);
        robot.frontRight.setPower(yRight);
        robot.frontLeft.setPower(yLeft);
        robot.backLeft.setPower(yLeft);

        telemetry.addData("Left Joystick", yLeft);
        telemetry.addData("Right Joystick", yRight);
    }
}
