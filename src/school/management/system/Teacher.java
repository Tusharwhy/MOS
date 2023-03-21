package school.management.system;

/**
 * this class keep track of teacher's details and their salaries.
 */

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarnred;


    /**
     * this constructor creates new teacher object.
     * @param id id for teacher
     * @param name name of teacher
     * @param salary their salary
     */

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarnred = 0;
    }

    /**
     * bellow getters,
     * @return return id, name and salary respectively of the teachers
     */

    public int getId() {
        return id;
    }

    public String getName(){
        return this.name;
    }

    public int getSalary() {
        return salary;
    }


    /**
     * set the salary of teacher
     * @param salary
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     *
     * @param salary adds to salary of teacher
     *               updates school expenditure
     */
    public void recieveSalary(int salary){
        salaryEarnred+=salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the Teacher: "+name+", Total salary earned so far "+salaryEarnred;
    }
}
