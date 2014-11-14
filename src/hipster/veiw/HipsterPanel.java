package hipster.veiw;

import hipster.model.HipsterAppController;

import java.awt.Color;

import javax.swing.*;

public class HipsterPanel extends JPanel
{
	private HipsterAppController baseController;
	private JComboBox albumBox;
	private JLabel hipsterImage;
	private JLabel albumImage;
	private SpringLayout baseLayout;
	private Label albumLabel;
	
	
	public HipsterPanel(HipsterAppController baseController)
	{
		setBackground(Color.ORANGE);
		
		JComboBox comboBox = new JComboBox();
		add(comboBox);
		
		JLabel lblNewLabel = new JLabel("New label");
		add(lblNewLabel);
		this.baseController = baseController;
		baseLayout = new JLabel (:Album);
		
		albumBox = new JComboBox();
		hipsterImage = new JLabel("All about that Hipster", new ImageIcon(HipsterPanel.class.getResource("//location of the image")))
		
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupComboBox()
	{
		albumBox.setModel(new DefaultComboBoxModel(baseController.getMyHipster().getHipsterAlbums()));
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setSize(1000, 300);
		this.setBackground(Color.ORANGE);
		this.add(albumBox);
		this.add(albumLabel);
		this.add(hipsterImage);
	}

	private void setupLayout()
	{

	}

	private void setupListeners()
	{
		albumBox.addItemListener(new ItemListener()
		{
			@Override
			public void itemStateChanged(ItemEvent itemSelected)
			{
				if(albumBox.getSelectedIndex() == 0)
				{
					albumLabel.setText("Boy! You be Hipster!!");
				}
				else()
				{
					albumLabel.setText("Dog, you need to increase you Hipster diversity");
				}
				
			}
		});
	}

}
