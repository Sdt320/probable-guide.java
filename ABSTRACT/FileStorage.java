import java.io.*;

public class FileStorage extends DataStorage {
    private File file;

    public FileStorage(String fileName) {
        this.file = new File(fileName);
    }

    @Override
    public void save(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(data);
            log("Data saved to the file system");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String load() {
        StringBuilder data = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.append(line).append("\n");
            }
            log("Data loaded from the file system");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data.toString();
    }

    public static void main(String[] args) {
        DataStorage storage = new FileStorage("data.txt");
        storage.save("File system data example");
        System.out.println("Loaded data: " + storage.load());
    }
}
