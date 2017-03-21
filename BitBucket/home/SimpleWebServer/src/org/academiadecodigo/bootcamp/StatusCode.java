package org.academiadecodigo.bootcamp;

/**
 * Created by codecadet on 23/02/17.
 */
public class StatusCode {
    private int fileSize;

    public static String notFound(long fileSize) {
        return "HTTP/1.0 404 Not Found\r\n" +
                "Content-Type: text/html; charset=UTF-8\r\n" +
                "Content-Length: "+ fileSize+" \r\n\r\n";
    }

    public static String text(long fileSize){
        return "HTTP/1.0 200 Document Follows\r\n" +
                "Content-Type: text/html; charset=UTF-8\r\n" +
                "Content-Length: "+ fileSize+" \r\n\r\n";
    }

    public static String image(long fileSize, String extension){
        return "HTTP/1.0 200 Document Follows\r\n" +
                "Content-Type: image/"+ extension +" \r\n" +
                "Content-Length: "+ fileSize+" \r\n\r\n";
    }
}
