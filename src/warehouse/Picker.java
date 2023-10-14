package warehouse;

public class Picker implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public Picker(boolean isPayed, Warehouse warehouse) {
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Picker{");
        sb.append("salary=").append(salary);
        sb.append(", isPayed=").append(isPayed);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
    }

    @Override
    public void payBonus() {
        if(warehouse.getCountPickedOrders() >= 10000 && !isPayed) {
            salary += 70000;
            setPayed(true);
        }
        else if(isPayed){
            System.out.println("Bonus has already been payed");
        }
        else if(warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Bonus can not be payed");
        }
    }
}
