public class EmpWageComputation
{
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	public EmpWageComputation(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
	{
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;

	}
	public void ComputeEmpWage()
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

	@Override
	public String toString()
	{
		return "Total EmpWage for Company:"+company+ "is:"+totalEmpWage;
	}

	public static void main(String args [])
	{
		EmpWageComputation fb = new EmpWageComputation("Facebook",14,34,52);
		fb.ComputeEmpWage();
		EmpWageComputation go = new EmpWageComputation("Google",24,35,34);
		go.ComputeEmpWage();
	}

}
