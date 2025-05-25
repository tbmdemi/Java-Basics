import java.io.*;

public class Main {
    public static String readContentFromFile(String path) {
        StringBuilder res = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                res.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return res.toString();
    }

    public static void writeContentFromFiles(String path) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            String s1 = "uet-vnu\n";
            String s2 = "k69 ai1";

            bw.write(s1);
            bw.write(s2);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void appendContentToFile(String path) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            String s1 = "uet-vnu\n";
            String s2 = "k69 ai1";

            bw.write(s1);
            bw.write(s2);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static File findFineByName(String folderPath, String fileName) {
        File folder = new File(folderPath);
        if (!folder.isDirectory()) {
            return null;
        }
        File[] files = folder.listFiles(); // Might be null
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().equals(fileName)) {
                    return file;
                }
            }
        }
    }

    public static void main(String[] args) {
        appendContentToFile("test.txt");
        writeContentFromFiles("test.txt");
    }
}