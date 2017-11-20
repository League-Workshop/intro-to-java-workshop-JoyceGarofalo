package day2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class SmartShapes {

	public static void main(String[] args) throws Exception {
		// 1. Make a new Robot
		Robot r2d2 = new Robot();

		// 3. Put the robot's pen down
		r2d2.penDown();
		r2d2.setPenColor(Color.red);
		r2d2.miniaturize(); // makes smaller

		// 6. Make the robot move as fast as possible
		r2d2.setSpeed(80);

		// 5. Do everything below here 4 times
		for (int i = 0; i < 60; i++) { // 4 is loop number
			r2d2.move(2);
			r2d2.turn(360 / 60); // draws shape with this many sides
		}

		// 2. Move your robot 200 pixels

		// 4. Turn the robot 90 degrees to the right

		// 7. Change steps 4 and 5 to draw a different shape (e.g. triangle (3-sides),
		// pentagon (5-sides), decagon (10-sides)).

	}
}
