package day45_Constructor;
/*
 Task02:
        Create class called SalaryCalculator
                instance variables:
                    hourlyRate, weeklyHours, stateTaxRate, fedralTaxRate
                add a constructor can initialize those fields
                instance methods:
                    salary(): returns the total salary as double  (hourlyRate * weeklyHours * 48)
                    salaryAfterTax(): returns the salary after tax as double ( salary - stateTax - federalTax)
                    stateTax(): returns the total state tax as double ( salary * stateTaxRate)
                    federalTax(): returns the total federal tax as double ( salary * federalTaxRate)

                    toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
 */
public class SalaryCalculator {

    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;

    }

    public double grossSalary(){
        return hourlyRate * weeklyHours * 52;
    }
    public double stateTax(){
        return grossSalary() * stateTaxRate;
    }
    public double federalTax(){
        return grossSalary() * federalTaxRate;

    }
    public double netSalary(){
        return grossSalary() - (stateTax() + federalTax());
    }

    public String toString(){
        return "Hourly rate is : " + hourlyRate + "\nWeekly work hours : "+ weeklyHours
                + "\nGross yearly income : " +grossSalary() + "\nNet yearly income : " + netSalary()
                + "\nTotal pay for State Tax : " + stateTax() + "\nTotal pay for Federal Tax : "+federalTax();
    }
}
