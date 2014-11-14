package hipster.controller;

public class Hipster
{

	private String name;
	private int age;
	private String [] hipsterAlbums;
	
	public Hipster()
	{
		name = null;
		age = -99;
		hipsterAlbums = null;
	}
	
	public Hipster (String name, int age)
	{
		this.name = name;
		this.age = age;
		hipsterAlbums = new String[4];
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	

}
