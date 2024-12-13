package cu;

public class Gui_InsuranceChecker {
    String icReturn = "";

    public String checkInsurance(int carAge, int accidentHistory) {
        if (carAge <= 5 && accidentHistory == 0) {
            System.out.println("Insurance Type: ");
            icReturn = "Full Coverage";
            System.out.println(icReturn);
            System.out.println("You're eligible for Full Coverage. Full coverage is the most comprehensive option, combining liability, collision, and comprehensive insurance.");
        }
        return icReturn; // Return the value of icReturn
    }
}

class PartialCoverage_ extends Gui_InsuranceChecker {
    @Override
    public String checkInsurance(int carAge, int accidentHistory) {
        if (carAge <= 6 && accidentHistory > 0) {
            System.out.println("Insurance Type: ");
            icReturn = "Partial Coverage";
            System.out.println(icReturn);
            System.out.println("You're eligible for Partial Coverage. Partial coverage provides a balance of protection and affordability.");
        }
        return icReturn; // Return the value of icReturn
    }
}

class BasicCoverage_ extends Gui_InsuranceChecker {
    @Override
    public String checkInsurance(int carAge, int accidentHistory) {
        if (carAge >= 7) {
            System.out.println("Insurance Type: ");
            icReturn = "Basic Coverage";
            System.out.println(icReturn);
            System.out.println("You're eligible for Basic Coverage. Basic coverage is the minimum level of insurance.");
        }
        return icReturn; // Return the value of icReturn
    }
}

class PremiumCalculator {
    int calculatePremium(int premiumAmount, int accidentHistory, int drivingExperience){
        premiumAmount += (7500 * accidentHistory);
        if(drivingExperience < 3){
            premiumAmount += 3000;
        } else if(drivingExperience > 5){
            premiumAmount -= (premiumAmount * .10);
        } else if(drivingExperience > 10){
            premiumAmount -= 1500;
            premiumAmount -= (premiumAmount * .20);
        }

        return premiumAmount;
    } 
    
}