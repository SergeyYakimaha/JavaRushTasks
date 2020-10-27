public class Account<T, V> {
    private T id;
    private String name;

    Account(T id, String name) {
        this.id = id;
        this.name = name;
    }


    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public <A, B> void testMethod(A[] array, B count) {
        int i = 0;
        while (i < (Integer)count) {
            System.out.println(array[i]);
            i++;
        }
    }
}
