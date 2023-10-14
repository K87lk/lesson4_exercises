package warehouse;

public class Courier implements Worker{
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    public Courier(boolean isPayed, Warehouse warehouse) {
        this.isPayed = isPayed;
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Courier{");
        sb.append("salary=").append(salary);
        sb.append(", isPayed=").append(isPayed);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void doWork() {
       salary += 100;
       warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
    }

    @Override
    public void payBonus() {
        if(warehouse.getCountDeliveredOrders() >= 10000 && !isPayed) {
            salary += 50000;
            setPayed(true);
        }
        else if(isPayed) {
            System.out.println("Bonus has already been payed");
        }
        else if(warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Bonus can not be payed");
        }
    }
}
