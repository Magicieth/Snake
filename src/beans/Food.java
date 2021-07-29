package beans;

import java.awt.*;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * Author: Rich
 * Date: 2021/7/29 21:37
 * Description: 贪吃蛇的食物
 */
public class Food {

	private static Color FOOD_COLOR = Color.RED;//食物的颜色
	private int rows,cols;//出现的位置
	private int  w=Grass.BOX_SIZE;
	private int h=Grass.BOX_SIZE;

	private Random random = new Random();

	public Food(){
		this.rows = random.nextInt(Grass.ROWS-5)+5;
		this.cols=random.nextInt(Grass.COLS-5)+5;
	}


	/**
	 * 画苹果
	 * @param g
	 */
	public void drawApple(Graphics g){
		Color color = g.getColor();
		g.setColor(FOOD_COLOR);
		g.fillOval(rows*Grass.BOX_SIZE,cols*Grass.BOX_SIZE,w,h);
		g.setColor(color);
	}

	/**
	 * 获取碰撞检测点
	 * @return
	 */
	public Rectangle getRectangle(){
		return new Rectangle(rows*Grass.BOX_SIZE,cols*Grass.BOX_SIZE,w,h);
	}

	/**
	 * 更新食物的位置
	 */
	public void  updateAppleLocation(){
		this.rows=random.nextInt(Grass.ROWS-5)+5;
		this.cols=random.nextInt(Grass.COLS-5)+5;
	}
}
