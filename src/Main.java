import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Downloader downloader = new FileDownloaderProxy();
        String url = new Scanner(System.in).nextLine();
        String path = new Scanner(System.in).nextLine();
        try {
            downloader.download(url, path);
            System.out.println("down load success");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}