package task1;

import java.util.HashMap;
import java.util.Map;

public class Directory {
    private final Map<String, File> files = new HashMap<>();

    public void createFile(String fileName) {
        TextFile file = new TextFile(fileName, 0, null);
        files.put(fileName, file);
    }

    public void renameFile(String oldName, String newName) {
        File file = files.get(oldName);
        file.setName(newName);
        files.remove(oldName);
        files.put(newName, file);
    }

    public void printFile(String fileName) {
        File file = files.get(fileName);
        if (file.getClass().equals(TextFile.class)) {
            TextFile fileToPrint = (TextFile) file;
            System.out.println(fileToPrint.getInfoInsideFile());
        }
    }

    public void addInfoToFile(String fileName, String infoToAdd) {
        File file = files.get(fileName);
        if (file.getClass().equals(TextFile.class)) {
            TextFile textFile = (TextFile) file;
            String initialValue = textFile.getInfoInsideFile();

            String result = initialValue == null ? infoToAdd : initialValue.concat(infoToAdd);
            textFile.setInfoInsideFile(result);

            double size = file.getSize() + 1000.00;
            textFile.setSize(size);
        }
    }

    public void deleteFile(String fileName) {
        files.remove(fileName);
    }


    @Override
    public String toString() {
        return "Directory{" +
                "files=" + files +
                '}';
    }
}
