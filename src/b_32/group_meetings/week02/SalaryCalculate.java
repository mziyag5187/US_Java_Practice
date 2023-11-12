package b_32.group_meetings.week02;

public class SalaryCalculate {

    public static void main(String[] args) {

        double hourlyRate = 50, //$50
                weeklyHours = 45,
                stateTaxRate = 0.06,  //6%
                federalTaxRate = 0.26; //26%

        double salaryBeforeTax = hourlyRate * weeklyHours * 52,
                stateTax = salaryBeforeTax * stateTaxRate,
                federalTax = salaryBeforeTax * federalTaxRate,
                totalTax = stateTax + federalTax,
                salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax + "\n\tFederal tax is: $" + federalTax + "\n\tState tax is: $" + stateTax + "\n\tTotal tax is: $" + totalTax + "\n\t\tNet Income is: $" + salaryAfterTax);


    }
}
