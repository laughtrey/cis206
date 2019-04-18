/*
File: Bug.java
Description: This is the Bug class.
Author: Raymond Laughrey
Email: raymonl4963@student.vvc.edu
Date of Creation: 4/17/2019, 10:45:12 PM
*/
/**
 * A simulated bug that moves left and right.
 */
public class Bug
{
  private int position = 0;
  private int direction = 1;
  public Bug(int initialPosition)
  {
    this.position = initialPosition;
    this.direction = 1;
  }
  /**
   * Changes the direction value to opposite of current value.
   */
  public void turn()
  {
    direction *= -1;
  }
  /**
   * Moves the position in the current direction.
   */
  public void move()
  {
    position += direction;
  }
  /**
   * Gives the current numerical position of the object.
   * @return the current position.
   */
  public int getPosition()
  {
    return position;
  }

}
