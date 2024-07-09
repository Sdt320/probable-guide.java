public abstract class DataStorage {
    // Abstract method to save data
    public abstract void save(String data);

    // Abstract method to load data
    public abstract String load();

    // Concrete method to log the data storage operation
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
