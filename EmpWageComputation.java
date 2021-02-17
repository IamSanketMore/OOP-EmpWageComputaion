public class EmpWageComputation
{
        public static final int FULL_TIME=1;
        public static final int PART_TIME=2;

        public static int ComputeEmpWage(String company,int empRatePerHr,int numOfWorkingDays,int maxHoursPerMonth)
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
                totalEmpWage = totalEmpHrs * empRatePerHr;
                System.out.println("Company: "+company+" :: Total Employee Wage: "+totalEmpWage);

		return totalEmpWage;
        }

        public static void main(String args [])
        {
                ComputeEmpWage("Facebook",14,34,52);
                ComputeEmpWage("Google",24,35,34);
                ComputeEmpWage("Twitter",12,30,45);
        }

}
