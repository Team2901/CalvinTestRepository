package org.firstinspires.ftc.teamcode.autonomous;

import java.util.Scanner;
/*
abstract class State {
    static State CURRENT, PARK, DRIVE_TO_POSITION, READY_SHOOTER, RELEASE_PROJECTILE, FIRE_SHOOTER;

    void enter(){}
    void update(){ }
}

class DriveToPosition extends State{
    void enter(){
        System.out.println("In DriveToPosition State");
    }
    void update(){
        System.out.println("1. In position.");
        System.out.println("2. Out of position.");
        Scanner s = new Scanner(System.in);
        String input = s.next();
        switch(input){
            case "1":
                CURRENT = READY_SHOOTER;
                return;
            case "2":
                CURRENT = DRIVE_TO_POSITION;
        }
    }
}
class ReadyShooter extends State{
    void enter(){
        System.out.println("In ReadyShooter State");
    }
    void update(){
        System.out.println("1. Shooter ready.");
        System.out.println("2. Shooter not ready.");
        Scanner s = new Scanner(System.in);
        String input = s.next();
        switch(input){
            case "1":
                CURRENT = RELEASE_PROJECTILE;
                return;
            case "2":
                CURRENT = READY_SHOOTER;
        }
    }
}
class ReleaseProjectile extends State{
    void enter(){
        System.out.println("In ReleaseProjectile State");
    }
    void update(){
        System.out.println("1. Projectile Released.");
        Scanner s = new Scanner(System.in);
        String input = s.next();
        if (input.equals("1")) {
            CURRENT = FIRE_SHOOTER;
        } else {
            System.out.println("\n*** Error, projectile failed to release.");
        }
    }
}
class FireShooter extends State{
    void enter(){
        System.out.println("In FireShooter State");
    }
    void update(){
        System.out.println("1. Shooter Fired.");
        System.out.println("2. Shooter Failed.");
        Scanner s = new Scanner(System.in);
        String input = s.next();
        switch(input){
            case "1":
            case "2":
                CURRENT = PARK;
        }
    }
}
class Park extends State{
    void enter(){
        System.out.println("In Park State");
    }
    void update(){
        System.out.println("1. Haven't Fired.");
        System.out.println("2. Already Fired.");
        Scanner s = new Scanner(System.in);
        String input = s.next();
        switch(input){
            case "1":
                CURRENT = DRIVE_TO_POSITION;
                return;
            case "2":
                CURRENT = PARK;
        }
    }
}

public class CalvinStateMachineTest {

    public static void main(String [] args){
        State.PARK = new Park();
        State.DRIVE_TO_POSITION = new DriveToPosition();
        State.READY_SHOOTER = new ReadyShooter();
        State.RELEASE_PROJECTILE = new ReleaseProjectile();
        State.FIRE_SHOOTER = new FireShooter();
        State.CURRENT = State.PARK;
        while(true){
            State.CURRENT.enter();
            State.CURRENT.update();
        }
    }
}

 */
