package org.firstinspires.ftc.teamcode.roverruckus

import com.qualcomm.robotcore.eventloop.opmode.Autonomous
import com.qualcomm.robotcore.eventloop.opmode.OpMode
import com.qualcomm.robotcore.eventloop.opmode.TeleOp
import com.qualcomm.robotcore.hardware.Servo
import com.qualcomm.robotcore.util.Range

@Autonomous(name = "ServoTesting", group = "roverruckus")
class ServoTesting : OpMode() {
    private lateinit var blServo: Servo
    private lateinit var brServo: Servo
    private lateinit var flServo: Servo
    private lateinit var frServo: Servo
    private val MID_SERVO = 0.5
    private var servoOffset = 0.0

    override fun init() {
        blServo = hardwareMap.get(Servo::class.java, "bl_servo")
        brServo = hardwareMap.get(Servo::class.java, "br_servo")
        flServo = hardwareMap.get(Servo::class.java, "fl_servo")
        frServo = hardwareMap.get(Servo::class.java, "fr_servo")

        blServo.position = 0.0
        brServo.position = 1.0
        flServo.position = 1.0
        frServo.position = 0.0
    }

    override fun start() {
        blServo.position = 1.0
        brServo.position = 0.0
        flServo.position = 0.0
        frServo.position = 1.0
    }

    override fun loop() {

    }

}