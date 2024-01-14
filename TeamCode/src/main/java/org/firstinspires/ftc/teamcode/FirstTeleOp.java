package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "First_TeleOp")
public class FirstTeleOp extends OpMode{
    @Override
    public void init() {
        //happens once on init
    }

    @Override
    public void init_loop() {
        super.init_loop();
        //happens repeatedly on init
    }

    @Override
    public void start() {
        super.start();
        //happens once after program starts
    }

    @Override
    public void loop() {
        //happens repeatedly until program stops
    }

    @Override
    public void stop() {
        super.stop();
        //happens once after stop
    }
}
