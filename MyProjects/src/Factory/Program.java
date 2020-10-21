package Factory;

public class Program {
    public static void main(String[] args) {
        Developer java = createDeveloperBySpeciality("java").createDeveloper();
        Developer cpp = createDeveloperBySpeciality_1("c++");

        java.writeCode();
        cpp.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        switch (speciality.toLowerCase()) {
            case ("c++"):
                return new CppDeveloperFactory();
            case ("java"):
                return new JavaDeveloperFactory();
            default:
                throw new RuntimeException(speciality + " is unknown speciality.");
        }
    }

    static Developer createDeveloperBySpeciality_1(String speciality) {
        switch (speciality.toLowerCase()) {
            case ("c++"):
                return new CppDeveloperFactory().createDeveloper();
            case ("java"):
                return new JavaDeveloperFactory().createDeveloper();
            default:
                throw new RuntimeException(speciality + " is unknown speciality.");
        }
    }
}
