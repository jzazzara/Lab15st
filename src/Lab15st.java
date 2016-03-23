// Lab15st.java
// This is the student, starting file for Lab 15.
// This file is identical to Java1521.java.
// This slide show is about Mr. Leon Schram.
// Each student needs to alter this presentation,
// add pictures, add pages, add graphics and make it about him/herself.


import java.awt.*;


public class Lab15st extends java.applet.Applet
{

	int numClicks;
	Image picture1, picture2, picture3, picture4, picture5, picture6, picture7;

	public void init()
	{
		numClicks = 0;
		picture1 = getImage(getDocumentBase(),"Gopher Chucks.jpg");
		picture2 = getImage(getDocumentBase(),"Woods.jpg");
		picture3 = getImage(getDocumentBase(),"VTHS.jpg");
		picture4 = getImage(getDocumentBase(),"Pizza Guy.jpg");
		picture5 = getImage(getDocumentBase(),"Burger King Game.jpg");
		picture6 = getImage(getDocumentBase(),"DJ Khaled.jpg");
		picture7 = getImage(getDocumentBase(),"Marching Band.jpg");
		
		// The following MediaTracker/try/catch code ensures that
		// all images are loaded before the program continues.
		MediaTracker tracker = new MediaTracker(this);
		tracker.addImage(picture1,1);
		tracker.addImage(picture2,1);
		tracker.addImage(picture3,1);
		tracker.addImage(picture4,1);
		tracker.addImage(picture5,1);
		tracker.addImage(picture6,1);
		tracker.addImage(picture7,1);
		try
		{
			tracker.waitForAll();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

	public void paint(Graphics g)
	{
		switch (numClicks)
		{
			case 0 : page1(g); break;
			case 1 : page2(g); break;
			case 2 : page3(g); break;
			case 3 : page4(g); break;
			case 4 : page5(g); break;
			case 5 : page6(g); break;
			case 6 : page7(g); break;
		}
	}

	public boolean mouseDown(Event e, int x, int y)
	{
		numClicks++;
		repaint();
		return true;
	}

	public void page1(Graphics g)
	{
		Expo.setFont(g,"Arial",Font.BOLD,100);
		Expo.drawString(g,"WELCOME",250,85);
		Expo.setColor(g,Expo.yellow);
		Expo.drawThickPreciseSpiral(g,510,370,275,50,15);
		Expo.setColor(g,Expo.red);
		Expo.fillStar(g,510,370,175,8);
		Expo.setColor(g,Expo.green);
		Expo.drawThickStar(g,510,370,225,8,25);
		Expo.setColor(g,Expo.blue);
		Expo.drawThickStar(g,510,370,275,8,25);
		g.drawImage(picture1,360,285,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"My name is Joey 'Brotato' Zazzara.",30,300);
		Expo.drawString(g,"Click once to continue.",760,550);
	}

	public void page2(Graphics g)
	{
		g.drawImage(picture2,0,0,this);
		Expo.setFont(g,"Algerian",Font.BOLD,100);
		Expo.drawString(g,"PAGE 2",200,100);
		Expo.setColor(g,Expo.blue);
		Expo.setColor(g,Expo.chartreuse);
		Expo.setColor(g,Expo.blue);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I was born in the deep dark depths of somewhere in Vermont.",100,200);
		Expo.drawString(g,"Click once to continue.",750,550);
	}

	public void page3(Graphics g)
	{
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"PAGE 3",200,100);
		Expo.setColor(g,Expo.darkGreen);
		Expo.fillRoundedRectangle(g,460,170,960,515,50);
		g.drawImage(picture3,115,160,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I am currently a student at Vernon Township High School, the greatest school ever built.",100,150);
		Expo.drawString(g,"Click once to continue.",1175,750);
	}
	
	public void page4(Graphics g)
	{
		Expo.setFont(g,"Papyrus",Font.BOLD,100);
		Expo.drawString(g,"PAGE 4",200,100);
		g.drawImage(picture4,115,160,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I am Italian and Irish.",100,150);
		Expo.drawString(g,"Click once to continue.",500,450);
	}
	
	public void page5(Graphics g)
	{
		Expo.setFont(g,"Arial",Font.BOLD,100);
		Expo.drawString(g,"PAGE 5",200,100);
		g.drawImage(picture5,115,160,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I like video games.",100,150);
		Expo.drawString(g,"Click once to continue.",560,525);
	}

	public void page6(Graphics g)
	{
		Expo.setFont(g,"Algerian",Font.BOLD,100);
		Expo.drawString(g,"PAGE 6",200,100);
		g.drawImage(picture6,115,160,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I like music too.",100,150);
		Expo.drawString(g,"Click once to continue.",600,615);
	}

	public void page7(Graphics g)
	{
		Expo.setFont(g,"Papyrus",Font.BOLD,100);
		Expo.drawString(g,"PAGE 7",200,100);
		g.drawImage(picture7,115,160,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I am in the Vernon Township Highschool Marching Band.",100,150);
		Expo.drawString(g,"Click once to continue.",700,615);
	}


}

