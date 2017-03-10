package Ejercicio4.Histograma;

import becker.robots.*;

public class Histograma {
    private City Ciudad;
    private Robot Karel;
    
    public Histograma(int[] Datos){       
        int Mayor = 0;
        int Sumatoria = 0;
        for (int Dato : Datos) {
            if(Dato>Mayor){
                Mayor = Dato;
            }
            Sumatoria += Dato;
        }
        this.Ciudad = new City(Datos.length+3, Mayor+2);
        Ciudad.showThingCounts(true);
        this.Karel = new Robot(Ciudad, 0, 1, Direction.SOUTH);
        Thing[] Cosas = new Thing[Sumatoria];
        int k = 0;
        for(int i=1;i<Datos.length+1;i++){
            for(int j=0;j<Datos[i-1];j++){
                Cosas[k] = new Thing(Ciudad, i, 1);
                k++;
            }
        }
    }
    
    public void Siguiente(){
        Karel.move();
    }
    
    public int Recoger(){
        while(Karel.canPickThing())
            Karel.pickThing();
        return Karel.countThingsInBackpack();
    }
    
    public void Colocar(){
        Karel.turnLeft();
        while(Karel.countThingsInBackpack()>0){
            Karel.putThing();
            Karel.move();
        }
    }
    
    public void Devolver(int a){
        Karel.turnLeft();
        Karel.turnLeft();
        for(int i=0; i<a; i++)
            Karel.move();
        Karel.turnLeft();
    }
    
    public boolean puedeRecoger(){
        return Karel.canPickThing();
    }
}
