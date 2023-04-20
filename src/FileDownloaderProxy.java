public class FileDownloaderProxy implements Downloader {
    private FileDownloader fileDownloader;

    public FileDownloaderProxy() {
        fileDownloader = new FileDownloader("");
    }

    public void download(String url, String path) {
        fileDownloader.download(url, path);
    }
}
