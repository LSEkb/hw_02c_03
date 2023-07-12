public class ServiceStation implements Maintenance {

    @Override
    public void check(Vehicle vehicle) {
        System.out.println();
        vehicle.service();
        System.out.println("Обслуживание завершено");
    }
}

