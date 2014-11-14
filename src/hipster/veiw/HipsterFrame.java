package hipster.veiw;


public class HipsterFrame
{
	private HipsterPanel basePanel;
	
	public HipsterFrame(HipserPanel baseController)
	{
		this.basePanel = new HipsterPanel (baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(1000, 300);
		this.setResizable(false);
		this.
	}
}
