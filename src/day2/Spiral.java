package day2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot r2d2 = new Robot(); // 1
		r2d2.miniaturize();

		r2d2.setSpeed(225); // 3
		r2d2.setRandomPenColor(); // 5
		r2d2.penDown();
		for (int i = 0; i < 150; i++) { // 4
			r2d2.move(5 * i);
			r2d2.turn(360 / 7); // 2
			r2d2.setRandomPenColor();
			r2d2.setPenWidth(i); // 8

		}
		// 5. Set your robot's pen to the down position

		// 3. Set the robot to go at max speed (10)

		// 4. Do the following (steps 6-8) 75 times

	}
	// 7. Change the pen color to random

	// 6. Move the robot 5 times the current line number you are drawing (5*i)

	// 2. Turn the robot 1/7 of 360 degrees to the right

	// 8. Set the pen width to i

}
