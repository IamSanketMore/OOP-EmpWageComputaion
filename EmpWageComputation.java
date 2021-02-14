public class EmpWageComputation
{
	 public void Attendance()
         {
                        int is_Full_Time=1;
                        int empCheck = (int)Math.floor(Math.random() *10) % 2;
			System.out.println("Value is :-"+empCheck);
                        if(empCheck == is_Full_Time)
			{
				System.out.println("Emplyee is Present");
			}
			else
			{
				System.out.println("Employee is Absent");
			}
         }


	public static void  main(String args [])
	{
		EmpWageComputation emp = new EmpWageComputation();
		emp.Attendance();
	}
}
