package pojoClass;

public class PatientMainPojo 
{
	
	public static void main(String[] args)
	{
		PatientDataPojo pat=new PatientDataPojo();
		pat.setpId(234);
		pat.pName="mike";
		pat.pBill=78000;
		pat.pCont=9878998765L;
		
		System.out.println(pat.getpId());
		System.out.println(pat.pName);
		
		PatientDataPojo pat1=new PatientDataPojo();
		pat1.setpId(245);
		pat1.pName="merrye";
		pat1.pBill=6700;
		pat1.pCont=6898987654L;
		
		PatientDataPojo pat2=new PatientDataPojo();
		pat2.setpId(676);
		pat2.pName="Cifope";
		pat2.pBill=98000;
		pat2.pCont=9075487654L;
		
		PatientDataPojo pat3=new PatientDataPojo();
		pat3.setpId(998);
		pat3.pName="jack";
		pat3.pBill=34566;
		pat3.pCont=9898987654L;
		
		System.out.println(pat3.pBill);
		System.out.println(pat2.getpId());

	}

}
