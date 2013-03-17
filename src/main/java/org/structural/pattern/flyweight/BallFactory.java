package org.structural.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BallFactory {

	private  static Map<BALL_COLOR, Ball> ballObjects = new HashMap<BALL_COLOR, Ball>();

	public static Ball createBall(int size, BALL_COLOR color){
		Ball ball = ballObjects.get(color);
		if(ball==null){
			ball = new Ball();
			ball.setSize(size);
			ball.setColor(color);
			ballObjects.put(color, ball);
		}else{
			ball.setSize(size);
		}
		return ball;
	}

	public static int numberOfBallObjectsCreated(){
		return ballObjects.size();
	}

}
