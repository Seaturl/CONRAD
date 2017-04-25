package edu.stanford.rsl.tutorial.ap52aqin;

import edu.stanford.rsl.conrad.data.numeric.Grid2D;





public class Phantom extends Grid2D
{

	public static void main(String[] args) {
		
		Phantom phantom = new Phantom(512, 512, 1, 1, 0, 0);
		phantom.show();		
	}
	
	
	
	public Phantom(float[] buffer, int width, int height) 
	{
		super(buffer, width, height);
		// TODO Auto-generated constructor stub
		initializePhantom();
	}
	
	
	///
	///@param[in] originX: an welcher koordinate in weltkoordinaten liegt der origin
	///@param[in] originY: 
	///
	public Phantom(int width_in, int height_in, 
			float spacingX_in, float spacingY_in,
			float originX_in, float originY_in) 
	{
		super(width_in, height_in);
		// TODO Auto-generated constructor stub
		initializePhantom();
		
		
	}
	
	
	
	
	
	private void initializePhantom()
	{
		
		for (int i = 0; i < super.getHeight(); ++i)
		{
			for (int j = 0; j < super.getWidth(); ++j)
			{
				
			}
		}
	}
	

}


