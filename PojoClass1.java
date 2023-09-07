package pojoClass;

public class PojoClass1 
{
	public static void main(String[] args)
	{
		// so  the POJO class we make n noof objects and if we want  seperate details of the person directly it we can get
		StudentPojo1 std=new StudentPojo1();
		std.setId(121);
		std.setName("HARI");
		std.sSection='A';
		std.sHeight=5.5;
		
		//System.out.println(std.getId());
		//System.out.println(std.getName());
		//System.out.println(std.sSection);
		//System.out.println(std.sHeight);
		
		StudentPojo1 std1=new StudentPojo1();
		std1.setId(121);
		std1.setName("HARI");
		std1.sSection='A';
		std1.sHeight=5.5;
		
		
		StudentPojo1 std2=new StudentPojo1();
		std2.setId(121);
		std2.setName("HARI");
		std2.sSection='A';
		std2.sHeight=5.5;
		
		StudentPojo1[] st=new StudentPojo1[] {std,std1,std2 };
		System.out.println(std1.sSection);
	}

}
