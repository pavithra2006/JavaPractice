public class EmployeeComparator {
    public int ID; public double salary; public String name;
    EmployeeComparator(int ID, double salary, String name){
        this.ID = ID;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString(){
        return ID +" " + name + " " + salary;
    }

}
