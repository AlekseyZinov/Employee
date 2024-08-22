public class Department {
    private Employee boss;
    private String department;

    public Department(Employee boss, String department) {
        this.boss = boss;
        this.department = department;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return " " + department + " начальник которого " + boss.getName();
    }
}
