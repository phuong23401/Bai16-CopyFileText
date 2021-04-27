import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {
    private static final List<String> ARRAY_LIST = new ArrayList<>();

    public static void readFile() {
        String url = "C:\\Users\\ADMIN\\OneDrive\\Documents\\BookList.docx";
        try {
            FileInputStream fileInputStream = new FileInputStream(url);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader reader = new BufferedReader(inputStreamReader);
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
            FileOutputStream fileOutputStream = new FileOutputStream("Books.doc");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
            BufferedWriter writer = new BufferedWriter(outputStreamWriter);
            for (String line: ARRAY_LIST) {
                writer.write(line);
            }
            fileOutputStream.close();
            outputStreamWriter.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Đã ghi vào file mới!");
    }

    public static void readNewFile () {
        try {
            FileInputStream fileInputStream = new FileInputStream("Books.doc");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader reader = new BufferedReader(inputStreamReader);
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
