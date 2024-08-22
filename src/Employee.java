public class Employee {
    private String name;
    private Department dep;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDep() {
        return dep;
    }

    public void setDep(Department dep) {
        this.dep = dep;
    }

    @Override
    public String toString() {
        if (this == dep.getBoss()) {
            return name + " начальник отдела " + dep.getDepartment();
        } else {
            return name + " работает в отделе" + dep;
        }
    }
}
