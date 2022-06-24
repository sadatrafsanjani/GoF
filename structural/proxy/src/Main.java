public class Main {

    public static void main(String[] args) {

        VideoDownloader downloader = new ProxyDownloader();

        downloader.download("xyz");
        downloader.download("abc");
        downloader.download("pqr");
        downloader.download("xyz");
    }
}
