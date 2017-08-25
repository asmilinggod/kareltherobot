package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
        }
        
    public void giveCarlBeeper() {
        //This method should allow karel, who is at (1, 1) to give a beeper to carl (at 1, 4)
        goToCarl();
        putBeeper();
        karelReturnToPosition();
    }
    public void goToCarl(){
        turnRight();
        move();
        move();
        move();
    }
    public void karelReturnToPosition(){
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        turnRight();
    }
    public void pickAndMoveBeeper() {
        //This method is for carl to pick up the beeper from karel and move it two blocks north
        pickBeeper();
        turnLeft();
        move();
        move();
        putBeeper();
        karlReturnToPosition();
    }
    public void karlReturnToPosition(){
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
    }
}