import java.io.*;
import java.net.*;

public class FileDownloader implements Downloader {
    private String userAgent;

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    public void download(String url, String path) {
        try {
            URLConnection connection = new URL(url).openConnection();
            connection.setRequestProperty("User-Agent", userAgent);
            InputStream stream = connection.getInputStream();
            OutputStream output = new FileOutputStream(path);
            byte[] buffer = new byte[4096];
            int bytesRead = -1;
            while ((bytesRead = stream.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
            output.close();
            stream.close();
            System.out.println("Downloaded " + path + " from " + url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
