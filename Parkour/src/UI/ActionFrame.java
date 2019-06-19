package UI;

import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class ActionFrame extends ButtonAssembly{
	Image image;
	Button action;
	Button help;
	public ActionFrame(){
		action=new Button("¿ªÊ¼ÓÎÏ·");
		help=new Button("°ïÖú");
		image=Toolkit.getDefaultToolkit().createImage(ActionFrame.class.getResource("/image/1b60ea29cf4f42f4b4b6c75e763b9b4d.png"));
		this.add(action);
		this.add(help);
		this.setLayout(null);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(image, 150, 120, 200, 200,this);
	}
	
}
