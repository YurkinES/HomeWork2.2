public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("BMW", 4),
                new Car("LADA", 4),
        };

        Truck[] trucks = {
                new Truck("Volvo", 8),
                new Truck("Scania", 6),
        };

        Bicycle[] bicycles = {
                new Bicycle("Aist", 2),
                new Bicycle("Kama", 2),
        };
        Service ServiceStation = new ServiceStation();
        printReport(ServiceStation, bicycles, cars, trucks);
    }

        private static void printReport(Service service, Bicycle[] bicycles, Car[] cars, Truck[] trucks) {
            service.printService(bicycles);
            service.printService(cars);
            service.printService(trucks);
        }

    }
