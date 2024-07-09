public class DatabaseStorage extends DataStorage {
    private String data;

    @Override
    public void save(String data) {
        this.data = data;
        log("Data saved to the database");
    }

    @Override
    public String load() {
        log("Data loaded from the database");
        return data;
    }

    public static void main(String[] args) {
        DataStorage storage = new DatabaseStorage();
        storage.save("Database data example");
        System.out.println("Loaded data: " + storage.load());
    }
}
