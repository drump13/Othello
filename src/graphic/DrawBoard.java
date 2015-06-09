package graphic;

import game.Board;
import game.Stone;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.*;



public class DrawBoard extends JFrame implements Runnable{

	public static final int SIZE_OF_BREADTH = 600;
	public static final int SIZE_OF_HEIGHT = 620;
	Graphics g;
	Board b = new Board();
	
	
	
	public DrawBoard(Board b){
		this.b = b;
		this.setSize(SIZE_OF_BREADTH,SIZE_OF_HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.g = this.getGraphics();
	}
	
	public void paint(Graphics g){
		this.setSize(SIZE_OF_BREADTH,SIZE_OF_HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.g = this.getGraphics();
		setBackground(Color.GREEN);
		Dimension size = getSize();
		Image back = createImage(size.width,size.height);
		Graphics2D buffer = (Graphics2D)back.getGraphics();
		super.paint(buffer);
		
		buffer.setStroke(new BasicStroke(3.0f));
		buffer.setColor(Color.BLACK);
		
		//buffer.setStroke(new BasicStroke(3.0f));
		//buffer.setColor(Color.BLACK);
		
		
		for(int count = 0;count < 8;count++){
			Line2D line = new Line2D.Double(count*(SIZE_OF_BREADTH/8),0,count*(SIZE_OF_BREADTH/8),SIZE_OF_HEIGHT);
			//g2.draw(line);
			buffer.draw(line);
		}
		for(int count = 0;count < 8;count++){
			Line2D line = new Line2D.Double(0,count*(SIZE_OF_HEIGHT/8)+10,SIZE_OF_BREADTH,count*(SIZE_OF_HEIGHT/8)+10);
			//g2.draw(line);
			buffer.draw(line);
		}
		
		
		
		for(int x = 0;x < 8;x++){
			for(int y = 0;y < 8;y++){
				if(b.returnBoard(x, y) == Stone.BLACK){
					buffer.setColor(Color.BLACK);
					Ellipse2D ellipse = new Ellipse2D.Double(x*(SIZE_OF_BREADTH/8),y*(SIZE_OF_HEIGHT/8)+10,SIZE_OF_BREADTH/8,SIZE_OF_HEIGHT/8);
					buffer.fill(ellipse);
				}else if(b.returnBoard(x, y) == Stone.WHITE){
					buffer.setColor(Color.WHITE);
					Ellipse2D ellipse = new Ellipse2D.Double(x*(SIZE_OF_BREADTH/8),y*(SIZE_OF_HEIGHT/8)+10,SIZE_OF_BREADTH/8,SIZE_OF_HEIGHT/8);
					buffer.fill(ellipse);
				}
			}
		}

		g.drawImage(back,0,0,this);
	
	}

	@Override
	public void run() {
		paint(g);
		MouseClick m = new MouseClick();
		while(true){
			try {
				Thread.sleep(10);
				repaint();
				this.addMouseListener(m);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
}
