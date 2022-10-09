package encryptdecrypt.resourceUtils;

public class IOhandler {
    public IOhandler(String data, String inFile, String outFile) {
        this.data = data;
        this.inFile = inFile;
        this.outFile = outFile;
    }

    private String data;
    private String inFile;
    private String outFile;

    public String getDataTP() {
        if (!data.isEmpty() && !inFile.isEmpty() || inFile.isEmpty() && !data.isEmpty()) {
            return data;
        } else if (data.isEmpty() && !inFile.isEmpty()) {
            return FileUtils.getDataFromFile(inFile);
        }
        return "";
    }

    public void postData(String data) {
        if (outFile.isEmpty()) {
            System.out.println(data);
        } else {
            FileUtils.exportDataToFile(data, outFile);
        }
    }
}
