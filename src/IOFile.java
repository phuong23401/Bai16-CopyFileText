import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {
    private static final List<String> ARRAY_LIST = new ArrayList<>();

    public static void readFile() {
        String url = "C:\\Users\\ADMIN\\OneDrive\\Documents\\BookList.docx";
        try {
            FileInputStream fileInputStream = new FileInputStream(url);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                ARRAY_LIST.add(line);
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Books.doc"));
            for (String line: ARRAY_LIST) {
                writer.write(line);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Đã ghi vào file mới!");
    }

    public static void readNewFile () {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Books.doc"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
