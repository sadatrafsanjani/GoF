public class InternetDownloader implements VideoDownloader {

    @Override
    public Video download(String url) {

        return new Video(url);
    }
}
