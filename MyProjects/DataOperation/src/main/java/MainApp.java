public class MainApp {

    public static void main(String[] args) {
        CRUDRepository<User> userData = new DataClass<User>();

        new DataClass<User>().update(new User("Sergey", 43));
        new DataClass<Car>().update(new Car("Honda"));

        new DataClass<User>().print();

//        userData.add(new User("Sergey", 43));
//
//        CRUDRepository<Car> carData= new DataClass<Car>();
//        carData.add(new Car("Honda"));
    }
}
