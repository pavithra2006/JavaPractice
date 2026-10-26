public class EmployeeComparable implements Comparable<EmployeeComparable>{
    private int ID;
    private String name;
    public EmployeeComparable(int ID, String name){
        this.ID = ID; this.name = name;
    }

    @Override
    public int compareTo(EmployeeComparable other) {
        return Integer.compare(this.ID, other.ID);
    }

    @Override
    public String toString(){
        return ID + " " + name;
    }
}


