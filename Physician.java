import java.io.Serializable;
public class Physician implements Serializable {
    String degree;
    String type;
    String surname;
    int numberofVisitToFamily;
    double feePerVisit;
    double totalPayment;
public class Physician() {
}
    public Physician(String degree, String type, String surname, int numberofVisitToFamily, double feePerVisit, double totalPayment) {
        this.degree = degree;
        this.type = type;
        this.surname = surname;
        this.numberofVisitToFamily = numberofVisitToFamily;
        this.feePerVisit = feePerVisit;
        this.totalPayment = totalPayment;
    }
    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getNumberofVisitToFamily() {
        return numberofVisitToFamily;
    }
    public void setNumberofVisitToFamily(int numberofVisitToFamily) {
        this.numberofVisitToFamily = numberofVisitToFamily;
    }
    public double getFeePerVisit() {
        return feePerVisit;
    }
    public void setFeePerVisit(double feePerVisit) {
        this.feePerVisit = feePerVisit;
    }
    public double getTotalPayment() {
        return totalPayment;
    }
    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }
    public void appointment(){
        this.numberofVisitToFamily=getNumberofVisitToFamily()+1;
    }
    public void cancelAppointment(){
        this.numberofVisitToFamily=getNumberofVisitToFamily()-1;
    }
    public void experience(){
        System.out.println("The Physician visit the family "+getNumberofVisitToFamily()+" number of times");
    }
    @Override
    public String toString() {
        return "Physician{" +
                "degree='" + degree +
                ", type='" + type +
                ", surname='" + surname +
                ", numberofVisitToFamily=" + numberofVisitToFamily +
                ", feePerVisit=" + feePerVisit +
                ", totalPayment=" + totalPayment +
                '}';
    }
}
