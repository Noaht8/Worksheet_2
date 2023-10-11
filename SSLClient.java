import javax.net.ssl.*;
import java.io.*;
import java.security.*;

public class SSLClient {
    public static void main(String[] args) {
        try {
            // Load the truststore containing the server's certificate
            char[] truststorePassword = "password".toCharArray();
            KeyStore truststore = KeyStore.getInstance("JKS");
            FileInputStream fis = new FileInputStream("client.truststore");
            truststore.load(fis, truststorePassword);

            // Create and initialize the SSLContext
            TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
            tmf.init(truststore);
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, tmf.getTrustManagers(), null);

            // Create the SSLSocket
            SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
            SSLSocket sslSocket = (SSLSocket) sslSocketFactory.createSocket("localhost", 8888);

            // Perform client-side operations
            // ...

            // Close the SSL socket
            sslSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
