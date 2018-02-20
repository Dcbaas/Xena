package org.usfirst.frc.team2771.robot;

import org.usfirst.frc.team2771.libs.HID.*;

public class KeyMap {

    // GAMEPADS
    private final HID gp1 = new HID(0);
    private final HID gp2 = new HID(1);
    private final int gamepad1 = 0;
    private final int gamepad2 = 1;

    // MANAGEMENT BOOLEANS
    private boolean singleControllerMode = false;

    // CONTROLLER 0
    private final HID.Axis swerveXAxis = LogitechF310.STICK_LEFT_X;
    private final HID.Axis swerveYAxis = LogitechF310.STICK_LEFT_Y;
    private final HID.Axis swerveRotAxis = LogitechF310.STICK_RIGHT_X;
   
    
    private final HID.Axis liftAxis = LogitechF310.STICK_LEFT_Y;
    private final HID.Axis armAxis = LogitechF310.STICK_RIGHT_Y;
    //private final HID.Axis clawIntakeAxis = LogitechF310.TRIGGER_LEFT_AXIS;
    //private final HID.Axis clawEjectAxis = LogitechF310.TRIGGER_RIGHT_AXIS;

    
    // CONTROLLER 1
    private final HID.Button clawOpenButton = LogitechF310.X;
    private final HID.Button gotoLiftFloor = LogitechF310.A;
    private final HID.Button gotoLiftSwitch = LogitechF310.B;
    private final HID.Button gotoLiftScale = LogitechF310.Y;
    private final HID.Button activateIntake = LogitechF310.BUMPER_RIGHT;
    private final HID.Button dropCube = LogitechF310.BUMPER_LEFT;
    
    
    //private final HID.Button clawCloseButton = LogitechF310.X;
    
    
    public KeyMap() {

    }

    private HID getHID(int gamepad) { 
        if (!singleControllerMode) {
            switch (gamepad) {
                case gamepad1:
                    return gp1;
                case gamepad2:
                    return gp2;
                default:
                    return null;
            }
        } else {
            return gp1;
        }
    }

    public double getSwerveXAxis() {
        return getHID(gamepad1).axis(swerveXAxis);
    }

    public double getLiftAxis() {
    	return getHID(gamepad2).axis(liftAxis);
    }
    
    public double getArmAxis() {
    	return getHID(gamepad2).axis(armAxis);
    }
    
    public double getSwerveYAxis() {
        return getHID(gamepad1).axis(swerveYAxis);
    }

    public double getSwerveRotAxis() {
        return getHID(gamepad1).axis(swerveRotAxis);
    }
    
    public boolean openClaw() {
    	return getHID(gamepad2).button(this.clawOpenButton);
    }
    
    public boolean gotoLiftFloor(){
    	return getHID(gamepad2).button(gotoLiftFloor);
    }
    
    public boolean gotoLiftSwitch(){
    	return getHID(gamepad2).button(gotoLiftSwitch);
    }
    
    public boolean gotoLiftScale(){
    	return getHID(gamepad2).button(gotoLiftScale);
    }
    
    public boolean activateIntake(){
    	return getHID(gamepad2).button(activateIntake);
    }
    
    public boolean dropCube() {
    	return getHID(gamepad2).button(dropCube);
    }
    
}