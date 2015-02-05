package legendaries.model;

public class Frostmourne
{
	private String name;
	private String owner;
	
	private boolean isAvailable;
	
	public Frostmourne(String name, String owner, boolean isAvailable)
	{
		this.name = "Frostmourne";
		this.owner = "Lich King Arthas Menethil";
		this.isAvailable = false;
		
	}
	
	public String toString()
	{
		String frostmourneString = "";
		frostmourneString += "Hi, I am a very nice sword object. My name is" + name + ".";
		frostmourneString += "My owners name is " +owner+".";
		if(isAvailable)
			frostmourneString +="I am available to own";
		else
			frostmourneString+="I am not available to own";
		
		
		return frostmourneString;
	}
	
	public String getName()
	{
		return name;
	}

	public String getOwner()
	{
		return owner;
	}

	public boolean isAvailable()
	{
		return isAvailable;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setOwner(String owner)
	{
		this.owner = owner;
	}

	public void setAvailable(boolean isAvailable)
	{
		this.isAvailable = isAvailable;
	}

}
