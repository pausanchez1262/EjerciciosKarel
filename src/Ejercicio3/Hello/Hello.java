package Ejercicio3.Hello;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

public class Hello {
    private Robot H;
    private Robot E;
    private Robot L;
    private Robot LL;
    private Robot O;
    private City unal;
    
    public Hello(){
    this.unal = new City(9,22);
    this.H = new Robot(unal, 2,2, Direction.SOUTH,11);
    this.E = new Robot(unal, 2,8, Direction.WEST,11);
    this.L = new Robot(unal, 2,10, Direction.SOUTH,7);
    this.LL = new Robot(unal, 2,14, Direction.SOUTH,7);
    this.O = new Robot(unal, 2,18, Direction.SOUTH,12);   
    }
    
    public void makeH(){
        for(int i=1; i<=5; i++){
           this.H.putThing();
           this.H.move();
        }
        this.H.turnLeft();
        this.H.move();
        this.H.move();
        this.H.turnLeft();
        for(int i=1; i<=5; i++){
           this.H.move();
           this.H.putThing();
        }
        for(int i=1; i<=2; i++){
           this.H.turnLeft();
            this.H.move();
        }
        this.H.move();
        this.H.putThing();
    }
    public void makeE(){
        for(int i=1; i<=2; i++){
           this.E.putThing();
           this.E.move();
        }
        this.E.turnLeft();
        for(int i=1; i<=4; i++){
           this.E.putThing();
           this.E.move();
        }
        this.E.turnLeft();
        for(int i=1; i<=3; i++){
           this.E.putThing();
           this.E.move();
        }
        this.E.turnLeft();
        this.E.move();
        this.E.move();
        this.E.turnLeft();
        for(int i=1; i<=2; i++){
           this.E.move();
           this.E.putThing();
        }
    }
    public void makeL(){
        for(int i=1; i<=4; i++){
           this.L.putThing();
           this.L.move();
        }
        this.L.turnLeft();
        for(int i=1; i<=3; i++){
           this.L.putThing();
           this.L.move();
        }
    }
    public void makeLL(){
        for(int i=1; i<=4; i++){
           this.LL.putThing();
           this.LL.move();
        }
        this.LL.turnLeft();
        for(int i=1; i<=3; i++){
           this.LL.putThing();
           this.LL.move();
        }
    }
    public void makeO(){
        for(int i=1; i<=4; i++){
           this.O.putThing();
           this.O.move();
        }
        this.O.turnLeft();
        for(int i=1; i<=2; i++){
           this.O.putThing();
           this.O.move();
        }
        this.O.turnLeft();
        for(int i=1; i<=4; i++){
           this.O.putThing();
           this.O.move();
        }
        this.O.turnLeft();
        for(int i=1; i<=2; i++){
           this.O.putThing();
           this.O.move();
        }
    }
}

