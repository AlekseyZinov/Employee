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

    public void setBoss(Employee boss) throws Exception {
        if(department.equals(boss.getDep())) {
            this.boss = boss;
        } else {
            throw new Exception("The boss is not an employee of the department");
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDep(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return " " + department + " начальник которого " + boss.getName();
    }
}
