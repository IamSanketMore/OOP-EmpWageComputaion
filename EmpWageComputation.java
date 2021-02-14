public class EmpWageComputation
{
	static final int isFullTime=1;
	static final int isPartTime=2;
	static final int EmpRatePerHour=20;

	public void calculateEmpWage()
        {
		int EmpHrs=0;
		int EmpWage=0;

                int empCheck = (int)Math.floor(Math.random() *10) % 3;
                if(empCheck == isFullTime)
		{
			System.out.println("Employee Is Full Time");
			EmpHrs=8;
		}
		else if (empCheck == isPartTime)
		{
			System.out.println("Employee is Part Time");
			EmpHrs=4;
		}
		else
		{
			System.out.println("Employee Is Absent");
		}
		EmpWage =EmpHrs * EmpRatePerHour;
		System.out.println("Employee Wage:- "+EmpWage);
         }


	public static void  main(String args [])
	{
		EmpWageComputation emp = new EmpWageComputation();
		emp.calculateEmpWage();
	}
}
