package br.com.lab05.ex02;

public class Main {
    public static void main(String[] args) {

        CarroFachada carro = new CarroFachada();

        carro.iniciarCorrida();

        System.out.println("\n");

        carro.finalizarCorrida();

        System.out.println("\n");

        // Uso do Proxy para baixar arquivos com cache
        DownloadService downloadService = new DownloadServiceProxy();

        // Downloads de arquivos
        downloadService.downloadFile("https://example.com/file1.zip");
        downloadService.downloadFile("https://example.com/file2.zip");

        // Tentando baixar o mesmo arquivo novamente
        downloadService.downloadFile("https://example.com/file1.zip");
    }
}
