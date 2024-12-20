package SchoolManagementSystem;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //not going to alter name or the id


    public void setGrade(int grade) {
        this.grade = grade;
    }

    //fee is the fees that student pays
    //adding the fees into the feespaid and update

    public void updateFeesPaid(int fees){
        feesPaid=feesPaid+fees;
        School.updateTotalEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFess(){
        return feesTotal-feesPaid;
    }
}
