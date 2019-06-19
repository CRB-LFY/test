package Controller;


import Domain.FlyingObject;
import Domain.OldMan;
import Domain.Stone;
import UI.ActionFrame;
import UI.GameFrame;


public class Contrl {
	FlyingObject fo;
	OldMan om;
	Stone s;
	ActionFrame af;
	GameFrame gf;
	public void start(){
		fo=new FlyingObject();
		om=new OldMan();
		s=new Stone();
		af=new ActionFrame();
		gf=new GameFrame();
	}
}
