public class EmpWageComputation {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private final String company;
	private final int empRate;
	private final int numOfDays;
	private final int maxHrs;
   
	public EmpWageComputation(String company, int empRate, int numOfDays, int maxHrs){
		this.company = company;
		this.empRate = empRate;
		this.numOfDays = numOfDays;
		this.maxHrs = maxHrs;
	}

	private int EmpWageComputation() {
		int empHrs=0, empWage=0, totalWage = 0, totalEmpHrs=0, totalWorkingDays=0 ;
		while (totalEmpHrs <= maxHrs && totalWorkingDays < numOfDays){
			totalWorkingDays++;
		int empCheck = (int)(Math.random() * 10) %3;
		switch ((int)empCheck){
			case 1:
				empHrs = 8;
			break;
			case 2:
					empHrs = 4;
		     	break;
			default:
				empHrs = 0;
			break;
		}
		empWage = empHrs * empRate;
		totalWage += empWage;
		System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " +empHrs);
		System.out.println("Emp Wage: " + empWage);
		}
		return totalWage;		
	}
		public static void main(String[] args){
		EmpWageComputation dMart = new EmpWageComputation("DMArt", 20, 20, 10);
		System.out.println("total emp wage for company " +dMart.company + "is" +dMart.EmpWageComputation( ) );
		EmpWageComputation BigBasket = new EmpWageComputation("BigBasket", 20, 25, 8);
      System.out.println("total emp wage for company " +BigBasket.company + "is" +BigBasket.EmpWageComputation( ) );
		}
}
