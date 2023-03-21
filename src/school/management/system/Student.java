package school.management.system;

/**
 *
 * this class keeps students details
 */

public class Student {
    // Declaring fields
    private int id;
    private String name;
    private int standard;
    private int feesPaid = 0;
    private int totalFees = 30000;

    /**
     *  to create a new student by Initializing below parameters
     *  fees would be 30,000/- for each student.
     *  fee paid initially would be zero
     * @param id   -> this is unique number for representing each student
     * @param name -> name of student
     * @param standard -> this represents grade or class of the student, class 1st, 2nd etc.
     */

    public Student(int id, String name, int standard){
        this.id = id;
        this.name = name;
        this.standard = standard;
    }

    /**
     * Students name and id won't be altered.
     * we can alter standard,feesPaid.
     * setters always be "void" & getters would always return
     */


    /**
     * used to upgrade student's class/standard.
     * @param standard -> new standard of the student.
     */

    public void setStandard(int standard) {
        this.standard = standard;
    }

    /**
     * feesPaid = 10,000 + 5000 + 15000
     * Add the fees to the feesPaid
     * @param fees the fees that student pays.
     */
    public void payfees(int fees){
        this.feesPaid += fees;
        School.updateTotalMoneyEarned(this.feesPaid);
    }

    /** @return return id of the student */
    public int getId() {
        return this.id;
    }

    /** @return return name of the student */
    public String getName() {
        return this.name;
    }

    /** @return return standard of the student */
    public int getStandard() {
        return this.standard;
    }

    /** @return return fees paid by the student */
    public int getFeesPaid() {
        return this.feesPaid;
    }

    /** @return total fees of the student */
    public int getTotalFees() {
        return this.totalFees;
    }

    /** @return returns remaining fees */
    public int getRemainingFees(){
        return this.totalFees-this.feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name : "+name+", Total fees paid so far : "+feesPaid;
    }
}
