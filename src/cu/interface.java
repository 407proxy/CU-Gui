package cu;

//@Override(Optional) DONT PUT FOR ABSTRACTION PART!!!
//We don't have default implementation in this class
//We need these parts

//For Premium Calculation
interface intPC {
    //To calculate Premium
    int calculatePremium(int A, int B, int C);
}

//For Verification
interface intV {
    //Check if underage
    boolean check_Underage(int A);
    //Check if Duplicated Platenumber
    boolean check_Dup_PlateNumber(String A);
    //Check if Negative number
    boolean check_NotNeutralNum(int A, int B, int C);
    //Check the Insurance ID
    boolean checkInsID(String A);
}

//For Insurance Checker
interface intIC {
    //Check what kind of Insurace
    String checkInsurance(int A, int B);
}



