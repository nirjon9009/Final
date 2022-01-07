import java.io.Serializable;
public class family implements Serializable {
    int numberOfFamilyMembers;
    String familyType;
    String familySurname;
    int numberOfWeddingAttended;
    Physician housePhysician;
public family() {
}
    public Family(int numberOfFamilyMembers, String familyType, String familySurname, int numberOfWeddingAttended, Physician housePhysician) {
        this.numberOfFamilyMembers = numberOfFamilyMembers;
        this.familyType = familyType;
        this.familySurname = familySurname;
        this.numberOfWeddingAttended = numberOfWeddingAttended;
        this.housePhysician = housePhysician;
    }
    public int getNumberOfFamilyMembers() {
        return numberOfFamilyMembers;
    }
    public void setNumberOfFamilyMembers(int numberOfFamilyMembers) {
        this.numberOfFamilyMembers = numberOfFamilyMembers;
    }
    public String getFamilyType() {
        return familyType;
    }
    public void setFamilyType(String familyType) {
        this.familyType = familyType;
    }
    public String getFamilySurname() {
        return familySurname;
    }
    public void setFamilySurname(String familySurname) {
        this.familySurname = familySurname;
    }
    public int getNumberOfWeddingAttended() {
        return numberOfWeddingAttended;
    }
    public void setNumberOfWeddingAttended(int numberOfWeddingAttended) {
        this.numberOfWeddingAttended = numberOfWeddingAttended;
    }
    public Physician getHousePhysician() {
        return housePhysician;
    }
    public void setHousePhysician(Physician housePhysician) {
        this.housePhysician = housePhysician;
    }
    @Override
    public String toString() {
        return "Family{" +
                "numberOfFamilyMembers=" + numberOfFamilyMembers +
                ", familyType='" + familyType + '\'' +
                ", familySurname='" + familySurname + '\'' +
                ", numberOfWeddingAttended=" + numberOfWeddingAttended +
                ", housePhysician=" + housePhysician +
                '}';
    }
    public void attendWedding(){
        this.numberOfWeddingAttended=getNumberOfWeddingAttended()+1;
    }
}



}
