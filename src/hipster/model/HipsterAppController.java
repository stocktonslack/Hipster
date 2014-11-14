package hipster.model;

import hipster.controller.Hipster;
import hipster.veiw.HipsterFrame;

public class HipsterAppController
{
	private HipsterFrame baseFrame;
	private Hipster myHipster;
	
	public HipsterAppController()
	{
		myHipster = new Hipster("Stockton", 17);
		createAlbumArray();
		baseFrame = new HipsterFrame(this);
	}
	
	public Hipster getMyHipster()
	{
		return myHipster;
	}
	
	private void createAlbumArray()
	{
		String [] tempHipster = myHipster.getHipsterAlbums();
		tempHipster[0] = "This and that: something hipster";
		tempHipster[1] = "Hipster Hipster Hipster";
		tempHipster[2] = "I am the hippest of them all";
		tempHipster[3] = "I always hipster";
		myHipster.setHipsterAlbums(tempHipster);
		
	}
	
	public void start()
	{
		
	}
	
}
