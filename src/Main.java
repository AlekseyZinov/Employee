public class Main {
    public static void main(String[] args) {
        Employee kolya = new Employee("Николай");
        Employee vanya = new Employee("Иван");

        Department dep1 = new Department(kolya, "HR");

        kolya.setDep(dep1);
        vanya.setDep(dep1);

        System.out.println(kolya);
        System.out.println(vanya);

    }
}
