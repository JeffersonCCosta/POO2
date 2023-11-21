package br.com.lab05.ex02;

import java.util.HashMap;
import java.util.Map;

public class DownloadServiceProxy implements DownloadService{

    private DownloadService downloadService;

    // Cache de arquivos baixados
    private Map<String, String> cache;

    public DownloadServiceProxy() {
        this.downloadService = new DownloadServiceImpl();
        this.cache = new HashMap<>();
    }

    @Override
    public void downloadFile(String fileUrl) {

        // Verificar se o arquivo já está em cache
        if (cache.containsKey(fileUrl)) {
            System.out.println("Obtendo arquivo do cache: " + cache.get(fileUrl));
        } else {
            // Se não estiver em cache, fazer o download e armazenar em cache
            downloadService.downloadFile(fileUrl);
            cache.put(fileUrl, fileUrl);
        }
    }

}
