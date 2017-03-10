package Ejercicio2.Numeros;

import becker.robots.*;

public class Cuartos {
    private City Ciudad;
    private Robot Karel;
    
    public Cuartos(){
        this.Ciudad = new City(8, 12);
        this.Karel = new Robot(Ciudad, 6, 2, Direction.NORTH);
        Thing[] Cosas = new Thing[39];
        int k = 0;
        for (int i = 1; i <= 5; i++){
            for(int j=1;j<4;j++){
                if(j==2&&(i>1&&i<5))
                    continue;
                Cosas[k] = new Thing(Ciudad, i, j);
                k++;
            }
            for(int j=4;j<7;j++){
                if((i==2&&(j==5||j==6))||(i==4&&(j==4||j==5)))
                    continue;
                Cosas[k] = new Thing(Ciudad, i, j);
                k++;
            }
            for(int j=7;j<10;j++){
                if(j==8&&(i>1&&i<5))
                    continue;
                Cosas[k] = new Thing(Ciudad, i, j);
                k++;
            }
        }
        Wall[] Paredes = new Wall[35];
        k=0;
        for (int i = 1; i < 6; i++) {
            for(int j = 1; j < 10; j++){
                if(i == 1){
                    Paredes[k] = new Wall(Ciudad, i, j, Direction.NORTH);
                    k++;
                }
                if(j==1||j==4||j==7){
                    Paredes[k] = new Wall(Ciudad, i, j, Direction.WEST);
                    k++;
                }
                if(j==9){
                    Paredes[k] = new Wall(Ciudad, i, j, Direction.EAST);
                    k++;
                }
                if(i==5&&j!=2&&j!=5&&j!=8){
                    Paredes[k] = new Wall(Ciudad, i, j, Direction.SOUTH);
                    k++;
                }
            }            
        }
    }
    
    public boolean[] evaluarCuarto(){
        boolean[] numero = new boolean[7];
        int k = 0;
        for(int i=1; i<21; i++){
            Karel.move();
            if(i==5||i==7||i==9||i==11||i==13||i==15||i==17){
                numero[k] = Karel.canPickThing();
                k++;
            }
            if(i==5||i==6||i==10||i==12||i==15||i==16)
                for(int j=0;j<3;j++)
                    Karel.turnLeft();
        }
        return numero;
    }
    
    public void Siguiente(){
        Karel.turnLeft();
        for(int i=0;i<3;i++)
            Karel.move();
        Karel.turnLeft();
    }
}
