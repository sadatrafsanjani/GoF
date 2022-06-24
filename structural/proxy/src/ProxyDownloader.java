import java.util.HashMap;
import java.util.Map;

public class ProxyDownloader implements VideoDownloader {

    private Map<String, Video> cache = new HashMap<>();

    @Override
    public Video download(String url) {

        if(!cache.containsKey(url)){

            InternetDownloader downloader = new InternetDownloader();
            cache.put(url, downloader.download(url));

            System.out.println("From internet...");

            return downloader.download(url);
        }

        System.out.println("From cache...");

        return cache.get(url);
    }
}
