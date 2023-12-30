public class ServiceStation implements Service{
    public void printServiceTransport(Transport[] transports){
        for (int i = 0; i < transports.length; i++) {
            Transport transport = transports[i];
            System.out.println("Обслуживаем: " + transport.getModelName());
            System.out.println("Замена покрышек: " + transport.getWheelsCount());
            if(transport.getWheelsCount() >=3 ){
                System.out.println("Проверка двигателя");
            }
            if(transport.getWheelsCount() >4 ){
                System.out.println("Проверка прицепа");
            }
                System.out.println();
        }
        }

    public void printService(Bicycle[] bicycles){
        System.out.println("Колличество велосипедов на обслуживании " + bicycles.length);
        printServiceTransport(bicycles);
    }
    public void printService(Car[] cars){
        System.out.println("Колличество легковых автомобилей на обслуживании " + cars.length);
        printServiceTransport(cars);

    }
    public void printService(Truck[] trucks){
        System.out.println("Колличество грузовых автомобилей на обслуживании " + trucks.length);
        printServiceTransport(trucks);

    }

}


//        if (car != null) {
//            System.out.println("Обслуживаем " + car.modelName);
//            for (int i = 0; i < car.wheelsCount; i++) {
//                car.updateTyre();
//            }
//            car.checkEngine();
//        } else if (truck != null) {
//            System.out.println("Обслуживаем " + truck.modelName);
//            for (int i = 0; i < truck.wheelsCount; i++) {
//                truck.updateTyre();
//            }
//            truck.checkEngine();
//            truck.checkTrailer();
//        } else if (bicycle != null) {
//            System.out.println("Обслуживаем " + bicycle.modelName);
//            for (int i = 0; i < bicycle.wheelsCount; i++) {
//                bicycle.updateTyre();
//            }
//        }

