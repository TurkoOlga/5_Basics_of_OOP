package task1;

public class TextFile extends File {
    private String infoInsideFile;

    public TextFile(String name, double size, String infoInsideFile) {
        super(name, size);
        this.infoInsideFile = infoInsideFile;
    }

    public String getInfoInsideFile() {
        return infoInsideFile;
    }

    public void setInfoInsideFile(String infoInsideFile) {
        this.infoInsideFile = infoInsideFile;
    }

    @Override
    public String toString() {
        return "TextFile{" +
                "infoInsideFile='" + infoInsideFile + '\'' +
                '}';
    }
}
