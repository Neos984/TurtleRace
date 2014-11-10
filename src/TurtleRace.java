import java.awt.Color;

import acm.program.GraphicsProgram;
import acm.graphics.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.util.RandomGenerator;

public class TurtleRace extends GraphicsProgram {

		public static final int APPLICATION_WIDTH = 600;
		public static final int APPLICATION_HEIGHT = 600;

		private RandomGenerator rgen = RandomGenerator.getInstance();
		
private int aScore = 0;
private int bScore = 0;
private int cScore = 0;
private int dScore = 0;
private int eScore = 0;
private int fScore = 0;
private GLabel ascore;
private GLabel bscore;
private GLabel cscore;
private GLabel dscore;
private GLabel escore;
private GLabel fscore;
private GLabel Ascore;
private GLabel Bscore;
private GLabel Cscore;
private GLabel Dscore;
private GLabel Escore;
private GLabel Fscore;
private GLabel restart;
private GLabel play;
Font score = new Font("Comic Sans", Font.BOLD, 15);

	public static void main(String[] args) {
		
		new TurtleRace().start(args);
	}
	public void run()
	
{
addMouseListeners();

Color rnd = rgen.nextColor();
setBackground(rnd);
System.out.println(rnd);

GLabel play = new GLabel("Click to Start", 275,300);
GLabel Ascore = new GLabel("" + aScore, 10, 50);
GLabel Bscore = new GLabel("" + bScore, 10, 150);
GLabel Cscore = new GLabel("" + cScore, 10, 250);
GLabel Dscore = new GLabel("" + dScore, 10, 350);
GLabel Escore = new GLabel("" + eScore, 10, 450);
GLabel Fscore = new GLabel("" + fScore, 10, 550);
Ascore.setFont(score);
Bscore.setFont(score);
Cscore.setFont(score);
Dscore.setFont(score);
Escore.setFont(score);
Fscore.setFont(score);
add(play);
waitForClick();
 
remove(play);

GRect aRectangle = new GRect(0,0,1000,1000);
add(aRectangle);
aRectangle.setFilled(true);
Color a = new Color(180,0,0);
aRectangle.setColor(a);

GRect bRectangle = new GRect(0,100,1000,100);
add(bRectangle);
bRectangle.setFilled(true);
Color b = new Color(130, 148, 53);
bRectangle.setColor(b);

GRect cRectangle = new GRect(0,200,1000,100);
add(cRectangle);
cRectangle.setFilled(true);
Color c = new Color(240,165,32);
cRectangle.setColor(c);

GRect dRectangle = new GRect(0,300,1000,100);
add(dRectangle);
dRectangle.setFilled(true);
Color d = new Color(155,0,200);
dRectangle.setColor(d);

GRect eRectangle = new GRect(0,400,1000,100);
add(eRectangle);
eRectangle.setFilled(true);
Color e = new Color(0,55,255);
eRectangle.setColor(e);

GRect fRectangle = new GRect(0,500,1000,100);
add(fRectangle);
fRectangle.setFilled(true);
Color f = new Color(255,255,200);
fRectangle.setColor(f);

add(Ascore);
add(Bscore);
add(Cscore);
add(Dscore);
add(Escore);
add(Fscore);

GTurtle aTurtle = new GTurtle(50,50);
add(aTurtle);

GTurtle bTurtle = new GTurtle(50,150);
add(bTurtle);

GTurtle cTurtle = new GTurtle(50,250);
add(cTurtle);

GTurtle dTurtle = new GTurtle(50,350);
add(dTurtle);

GTurtle eTurtle = new GTurtle(50,450);
add(eTurtle);

GTurtle fTurtle = new GTurtle(50,550);
add(fTurtle);

GRect finishLine = new GRect(550,0,20,1000);
add(finishLine);
finishLine.setFilled(true);
Color finish = new Color(255,255,255);
finishLine.setColor(finish);

boolean isFinished = false;

while(true){
	
	while(isFinished == false){
	pause(0);
	double rand1 = Math.random()*50;
	double rand2 = Math.random()*50;
	double rand3 = Math.random()*50;
	double rand4 = Math.random()*50;
	double rand5 = Math.random()*50;
	double rand6 = Math.random()*50;
	
	aTurtle.move(rand1, 0);
	bTurtle.move(rand2, 0);
	cTurtle.move(rand3, 0);
	dTurtle.move(rand4, 0);
	eTurtle.move(rand5, 0);
	fTurtle.move(rand6, 0);
	
	aTurtle.setLocation(aTurtle.getX(),50);
	bTurtle.setLocation(bTurtle.getX(),150);
	cTurtle.setLocation(cTurtle.getX(),250);
	dTurtle.setLocation(dTurtle.getX(),350);
	eTurtle.setLocation(eTurtle.getX(),450);
	fTurtle.setLocation(fTurtle.getX(),550);
	
	aTurtle.getX();
	bTurtle.getX();
	cTurtle.getX();
	dTurtle.getX();
	eTurtle.getX();
	fTurtle.getX();
	
	/*System.out.println(aTurtle.getX());
	System.out.println(bTurtle.getX());
	System.out.println(cTurtle.getX());
	System.out.println(dTurtle.getX());
	System.out.println(eTurtle.getX());
	System.out.println(fTurtle.getX());*/
	
if (aTurtle.getX() >= 550)
{
	aScore +=1;
	GLabel ascore = new GLabel("Red Ned's Score =" + aScore, 0, 50);
	GLabel bscore = new GLabel("Baby Barf's Score =" + bScore, 0, 150);
	GLabel cscore = new GLabel("Orange's Score =" + cScore, 0, 250);
	GLabel dscore = new GLabel("Purple Nurple's Score =" + dScore, 0, 350);
	GLabel escore = new GLabel("Blue Sue's Score =" + eScore, 0, 450);
	GLabel fscore = new GLabel("Sandy Randy's Score =" + fScore, 0, 550);
	ascore.setFont(score);
	bscore.setFont(score);
	cscore.setFont(score);
	dscore.setFont(score);
	escore.setFont(score);
	fscore.setFont(score);
	removeAll();
	GLabel restart = new GLabel("Play Again?", 275, 300);
	add(restart);
	setBackground(a);
	add(ascore);
	add(bscore);
	add(cscore);
	add(dscore);
	add(escore);
	add(fscore);
	waitForClick();
	removeAll();
	isFinished = true;
	
}

if (bTurtle.getX() >= 550)
{
	bScore +=1;
		GLabel ascore = new GLabel("Red Ned's Score =" + aScore, 0, 50);
	GLabel bscore = new GLabel("Baby Barf's Score =" + bScore, 0, 150);
	GLabel cscore = new GLabel("Orange's Score =" + cScore, 0, 250);
	GLabel dscore = new GLabel("Purple Nurple's Score =" + dScore, 0, 350);
	GLabel escore = new GLabel("Blue Sue's Score =" + eScore, 0, 450);
	GLabel fscore = new GLabel("Sandy Randy's Score =" + fScore, 0, 550);
	ascore.setFont(score);
	bscore.setFont(score);
	cscore.setFont(score);
	dscore.setFont(score);
	escore.setFont(score);
	fscore.setFont(score);
	removeAll();
	GLabel restart = new GLabel("Play Again?", 275, 300);
	add(restart);
	setBackground(b);

	add(ascore);
	add(bscore);
	add(cscore);
	add(dscore);
	add(escore);
	add(fscore);
	waitForClick();
	removeAll();
	isFinished = true;
	
}

if (cTurtle.getX() >= 550)
{
	cScore +=1;
		GLabel ascore = new GLabel("Red Ned's Score =" + aScore, 0, 50);
	GLabel bscore = new GLabel("Baby Barf's Score =" + bScore, 0, 150);
	GLabel cscore = new GLabel("Orange's Score =" + cScore, 0, 250);
	GLabel dscore = new GLabel("Purple Nurple's Score =" + dScore, 0, 350);
	GLabel escore = new GLabel("Blue Sue's Score =" + eScore, 0, 450);
	GLabel fscore = new GLabel("Sandy Randy's Score =" + fScore, 0, 550);
	ascore.setFont(score);
	bscore.setFont(score);
	cscore.setFont(score);
	dscore.setFont(score);
	escore.setFont(score);
	fscore.setFont(score);
	removeAll();
	GLabel restart = new GLabel("Play Again?", 275, 300);
	add(restart);
	setBackground(c);
	add(ascore);
	add(bscore);
	add(cscore);
	add(dscore);
	add(escore);
	add(fscore);
	waitForClick();
	removeAll();
	removeAll();
	isFinished = true;
	
}

if (dTurtle.getX() >= 550)
{
	dScore +=1;
		GLabel ascore = new GLabel("Red Ned's Score =" + aScore, 0, 50);
	GLabel bscore = new GLabel("Baby Barf's Score =" + bScore, 0, 150);
	GLabel cscore = new GLabel("Orange's Score =" + cScore, 0, 250);
	GLabel dscore = new GLabel("Purple Nurple's Score =" + dScore, 0, 350);
	GLabel escore = new GLabel("Blue Sue's Score =" + eScore, 0, 450);
	GLabel fscore = new GLabel("Sandy Randy's Score =" + fScore, 0, 550);
	ascore.setFont(score);
	bscore.setFont(score);
	cscore.setFont(score);
	dscore.setFont(score);
	escore.setFont(score);
	fscore.setFont(score);
	removeAll();
	GLabel restart = new GLabel("Play Again?", 275, 300);
	add(restart);
	setBackground(d);
	add(ascore);
	add(bscore);
	add(cscore);
	add(dscore);
	add(escore);
	add(fscore);
	waitForClick();
	removeAll();
	isFinished = true;
	
}

if (eTurtle.getX() >= 550)
{
	eScore +=1;
		GLabel ascore = new GLabel("Red Ned's Score =" + aScore, 0, 50);
	GLabel bscore = new GLabel("Baby Barf's Score =" + bScore, 0, 150);
	GLabel cscore = new GLabel("Orange's Score =" + cScore, 0, 250);
	GLabel dscore = new GLabel("Purple Nurple's Score =" + dScore, 0, 350);
	GLabel escore = new GLabel("Blue Sue's Score =" + eScore, 0, 450);
	GLabel fscore = new GLabel("Sandy Randy's Score =" + fScore, 0, 550);
	ascore.setFont(score);
	bscore.setFont(score);
	cscore.setFont(score);
	dscore.setFont(score);
	escore.setFont(score);
	fscore.setFont(score);
	removeAll();
	GLabel restart = new GLabel("Play Again?", 275, 300);
	add(restart);
	setBackground(e);
	add(ascore);
	add(bscore);
	add(cscore);
	add(dscore);
	add(escore);
	add(fscore);
	waitForClick();
	removeAll();
	isFinished = true;
	
}

if (fTurtle.getX() >= 550)
{
	fScore +=1;
		GLabel ascore = new GLabel("Red Ned's Score =" + aScore, 0, 50);
	GLabel bscore = new GLabel("Baby Barf's Score =" + bScore, 0, 150);
	GLabel cscore = new GLabel("Orange's Score =" + cScore, 0, 250);
	GLabel dscore = new GLabel("Purple Nurple's Score =" + dScore, 0, 350);
	GLabel escore = new GLabel("Blue Sue's Score =" + eScore, 0, 450);
	GLabel fscore = new GLabel("Sandy Randy's Score =" + fScore, 0, 550);
	ascore.setFont(score);
	bscore.setFont(score);
	cscore.setFont(score);
	dscore.setFont(score);
	escore.setFont(score);
	fscore.setFont(score);
	removeAll();
	GLabel restart = new GLabel("Play Again?", 275, 300);
	add(restart);
	setBackground(f);
	add(ascore);
	add(bscore);
	add(cscore);
	add(dscore);
	add(escore);
	add(fscore);
	waitForClick();
	removeAll();
	isFinished = true;
	
}
	
if (isFinished == true)
{
	isFinished = false;
	run();
}
	}
	
		}
	}
	
}