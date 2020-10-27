public class mainApp {

    public static void main(String[] args) {

        CRUDRepository<User> userCRUDRepository = new CRUDRepositotyUser();
        userCRUDRepository.add(new User("Ivan", 20));

        CRUDRepository<Car> carCRUDRepository = new CRUDRepositotyCar();
        carCRUDRepository.add(new Car("Nissan"));
    }
}
