class CompanyWage
{
	public String company;
	public int empRatePerHour;
	public int numOfWorkingDays;
	public int maxHoursPerMonth;
	public int  totalEmpWage;
	public int fullTimeHr;
    public int partTimeHr;


	public CompanyWage(String company, int empRatePerHour, int numOfWorkingDays, 
						int maxHoursPerMonth,int fullTimeHr, int partTimeHr)
	{
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.fullTimeHr = fullTimeHr;
     		this.partTimeHr = partTimeHr;
	}

}

class EmpWageArray
{
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;

	private int numOfCompany = 0;
	private CompanyWage[] companyEmpWageArray;
	
	public EmpWageArray()
	{
		companyEmpWageArray = new CompanyWage[5];
	}
	public void addCompanyEmpWage(String company, int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth,int fullTimeHr, int partTimeHr)
	{
		companyEmpWageArray[numOfCompany] = new CompanyWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth,fullTimeHr,partTimeHr);
		ComputeEmpWage(companyEmpWageArray[numOfCompany].company,companyEmpWageArray[numOfCompany].empRatePerHour,
				companyEmpWageArray[numOfCompany].numOfWorkingDays,companyEmpWageArray[numOfCompany].maxHoursPerMonth,
				companyEmpWageArray[numOfCompany].fullTimeHr,companyEmpWageArray[numOfCompany].partTimeHr);
		numOfCompany++;
	}

	public void ComputeEmpWage(String company,int empRatePerHour,int numOfWorkingDays , int maxHoursPerMonth, int fullTimeHr, int partTimeHr)
	{
		int empHrs=0;
		int totalEmpWage=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;

		while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays<=numOfWorkingDays)
		{
			totalWorkingDays++;
			int empCheck=(int)Math.floor(Math.random()*10)%3;

			switch(empCheck)
			{
			case FULL_TIME:
				empHrs=8;
				break;

			case PART_TIME:
				empHrs=4;
				break;

			default:
				empHrs=0;
			}
			totalEmpHrs+=empHrs;
			System.out.println("Day#:"+ totalWorkingDays + " Emp Hr:"+empHrs);
		}
		totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Wage For " +company+ " Company Employee Is "+totalEmpWage );
	}
}
	public class EmpWageComputation
	{
		public static void main(String args [])
		{
			EmpWageArray emp = new EmpWageArray();
			//EmpWageArry obj = new EmpWageArry();
	        emp.addCompanyEmpWage("Facebook",14,34,52,5,7);
	        emp.addCompanyEmpWage("Google",24,35,34,4,6);
		}
	}
