package cu;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;
import java.util.List;
import java.io.FileReader;

public class Gui_Verification implements int_V{
    public boolean check_Underage(int age) {
        return age < 18;  
    }
    public boolean check_Dup_PlateNumber(String PlateNumber) {
        boolean alreadyRegistered = false;
            try (CSVReader AReader = new CSVReader(new FileReader("csvThings/approvedInsurance.csv"))) {
                String[] line;
                while ((line = AReader.readNext()) != null) {
                    if (line[2].equalsIgnoreCase(PlateNumber)) {
                        System.out.println("Already Registered");
                        alreadyRegistered = true;
                        break;  
                    }
                }
            } catch (CsvValidationException | IOException e) {
                System.out.println("A CSV error occurred");
            }
            return alreadyRegistered;  
    }
    public boolean check_NotNeutralNum(int Age, int DrivingExperience, int CarAge) {
        return Age < 0 || DrivingExperience < 0 || CarAge < 0;  
    }

    public boolean checkInsID(String ID){
    boolean registeredID = false;
    try (CSVReader AReader = new CSVReader(new FileReader("csvThings/approvedInsurance.csv"))) {
        List<String[]> rows = AReader.readAll();  
        for (String[] row : rows) {
            if (row[1].equals(ID)){
                registeredID = true;
            }
        }
    } catch (IOException | CsvException e) {
        System.out.println("A CSV error occurred");
    }
    return registeredID;  
    }
}