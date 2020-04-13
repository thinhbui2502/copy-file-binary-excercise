import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String sourceFile = "E:/IdeaProjects/copy-file-binary-exercise/files/sourceFile.txt";
        String desFile = "E:/IdeaProjects/copy-file-binary-exercise/files/desFile.txt";
        InputStream inputStream;
        OutputStream outputStream;
        byte[] content;
        int length;
        try {
            inputStream = new FileInputStream(sourceFile);
            length = (int) new File(sourceFile).length();
            content = new byte[length];
            outputStream = new FileOutputStream(desFile);

            while (inputStream.read() != -1) {
                outputStream.write(content);
            }

            System.out.println("DONE!");
            System.out.println(desFile.length());

        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
