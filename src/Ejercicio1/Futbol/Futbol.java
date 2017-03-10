package Ejercicio1.Futbol;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

public class Futbol {
    private Robot joe;
    private City unal;
    private Thing balon;
    
    public Futbol(){
        this.unal = new City(10,10);
        this.balon = new Thing(this.unal, 9,9);
        this.joe = new Robot(unal, 9,9, Direction.WEST);
    }
    public void advance(){
        this.joe.pickThing();
        this.joe.move();
        this.joe.move();
        this.joe.putThing();
    }
    public void advanceLeft(){
        this.joe.pickThing();
        this.joe.turnLeft();
        this.joe.move();
        for(int i=1; i<=3; i++){
           this.joe.turnLeft(); 
        }
        this.joe.move();
        this.joe.move();
        this.joe.putThing();
    }
    public void advanceRight(){
        this.joe.pickThing();
        this.joe.move();
        this.joe.move();
        for(int i=1; i<=3; i++){
           this.joe.turnLeft(); 
        }
        this.joe.move();
        this.joe.turnLeft(); 
        this.joe.putThing();
    }
}
