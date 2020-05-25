public class EmpWageComputation {
   public static void main(String[] args) {
      System.out.println("Welcome to Employee Wage Computation");
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int NUM_OF_WORKING_DAYS = 20;
		int empHrs, empWage, totalWage = 0;

	for (int day = 0; day <= NUM_OF_WORKING_DAYS; day++){
		int empCheck = (int)(Math.random() * 10) %3;
		switch ((int)empCheck){
			case 1:
				System.out.println("Employee is Full Time Present");
				empHrs = 8;
			break;
			case 2:
      	   System.out.println("Employee is Part Time Present");
         	empHrs = 4;
      	break;
			default:
				System.out.println("Employee is Absent");
				empHrs = 0;
			break;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		totalWage += empWage;
		System.out.println("Emp Wage is for that day is: " +empWage);
		}
		System.out.println("total Wage is " +totalWage);
	}
}
