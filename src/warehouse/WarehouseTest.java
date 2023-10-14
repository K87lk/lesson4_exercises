package warehouse;

public class WarehouseTest {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(false, warehouse);
        Courier courier = new Courier(false, warehouse);

        picker.doWork();
        courier.doWork();

        System.out.println(warehouse + " " + picker + " " + courier);

        Task.businessProcess(picker);
        Task.businessProcess(courier);

        System.out.println(warehouse + " " + picker + " " + courier);

        Task.businessProcess(picker);
        Task.businessProcess(courier);

        System.out.println(warehouse + " " + picker + " " + courier);


    }
}
