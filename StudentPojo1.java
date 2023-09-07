package pojoClass;

public class StudentPojo1 
{
	private int sId;
	private String sName;
	public double sHeight;
	protected char sSection;
	
	public void setId( int sId)
	{
		this.sId=sId;
	}
	public int getId()
	{
		return sId;
	}
	
	public void setName(String sName)
	{
		this.sName=sName;
	}
	
	public String getName()
	{
		return sName;
	}

}
