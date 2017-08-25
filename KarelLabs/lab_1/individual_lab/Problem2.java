package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void moveTwo(){
       move();
       move();
    }
    public void rightHalfCircle(){
        rightHalfCircle();
        leftHalfCircle();
        
    }
    public void SShape(){
       turnRight();
       move();
       turnLeft();
       moveTwo();
       turnLeft();
       moveTwo();
       turnRight();
       moveTwo();
       turnRight();
       moveTwo();
       
    }
    
    public void shuttleRace() {
        sShape
    }
   
}