public class EmpWageComputation
{
	public static final int isFullTime=1;
	public static final int isPartTime=2;
	public static final int EmpRatePerHour=20;
	public static final int NumOfWorkingDays=20;
	public static final int MaxHrsInMonth=100;

	public void calEmpWagePerMonth()
        {
		int EmpHrs=0;
		int EmpWage=0;
		int TotalEmpWage=0;
		int TotalEmpHrs=0;
		int TotalWorkingDays=0;
		while(TotalEmpHrs <= MaxHrsInMonth && TotalWorkingDays < NumOfWorkingDays)
		{

			TotalWorkingDays++;
                	int empCheck = (int)Math.floor(Math.random() *10) % 3;
                	switch(empCheck)
			{
				case isFullTime :
					System.out.println("Employee Is Full Time");
					EmpHrs=8;
					break;

				case isPartTime:
					System.out.println("Employee is Part Time");
					EmpHrs=4;
					break;

				default:
					System.out.println("Employee Is Absent");
					break;
			}
			TotalEmpHrs += EmpHrs;
			System.out.println("Day:"+TotalWorkingDays+ "Emp Hr:"+EmpHrs);
        	 }
		TotalEmpWage=TotalEmpHrs * EmpRatePerHour;
		System.out.println("Total EmpWage:" + TotalEmpWage);
	}

	public static void  main(String args [])
	{
		EmpWageComputation emp = new EmpWageComputation();
		emp.calEmpWagePerMonth();
	}
}
