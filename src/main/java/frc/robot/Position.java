package frc.robot;

import static lib.Romi.driveDistance;
import static lib.Romi.turnDegrees;

public class Position {

  int xPosition; 
  int yPosition;
  char faceDirection;


    public void driveUp() throws InterruptedException {

      if(faceDirection == 'e') {
        turnDegrees(-90);
      }
      else if (faceDirection == 's') {
        turnDegrees(180);
      }
      else if (faceDirection == 'w') {
        turnDegrees(90);
      }
      faceDirection = 'n';

      driveDistance(10);

      yPosition = yPosition + 10;
      }
    


    public void driveDown() throws InterruptedException {
      
      if(faceDirection == 'e') {
        turnDegrees(90);
      }
      else if (faceDirection == 'n') {
        turnDegrees(-180);
      }
      else if (faceDirection == 'w') {
        turnDegrees(-90);
      }
      faceDirection = 's';

      driveDistance(10);

      yPosition = yPosition - 10;
      }
    

    public void driveRight() throws InterruptedException {

      if(faceDirection == 'n') {
        turnDegrees(90);
      }
      else if (faceDirection == 's') {
        turnDegrees(-90);
      }
      else if (faceDirection == 'w') {
        turnDegrees(180);
      }
      faceDirection = 'e';

      driveDistance(10);

      xPosition = xPosition + 10;
      }        

    

    public void driveLeft() throws InterruptedException {
      
      if(faceDirection == 'n') {
        turnDegrees(-90);
      }
      else if (faceDirection == 's') {
        turnDegrees(90);
      }
      else if (faceDirection == 'e') {
        turnDegrees(180);
      }
      faceDirection = 'w';

      driveDistance(10);

      xPosition = xPosition - 10;
      }        
    

    public void returnToHome() {

    }

    public String toString() {

      return "(" + xPosition + ", " + yPosition + ")";
    }
}
