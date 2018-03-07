import java.io.IOException;

public class HttpDownloader {

    public static void main(String[] args) {
        String fileURL = "http://url";
        String saveDir = ".";
        try {
            HttpDownloadUtility.downloadFile(fileURL, saveDir);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}