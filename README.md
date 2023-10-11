# SSL Client and Server Example

This repository contains a basic implementation of an SSL client and server in Java using the JSSE (Java Secure Socket Extension) API. The client and server demonstrate secure communication over SSL/TLS.

## Prerequisites

- Java Development Kit (JDK) installed
- Basic understanding of SSL/TLS concepts

## Usage

1. Clone the repository:

```shell
   git clone 
```
2. Compile the Java files:
```
   javac SSLServer.java
   javac SSLClient.java
```
3. Generate the necessary keystore and truststore files with appropriate certificates and keys. Update the file paths and passwords in the Java files accordingly.
4. Start the SSL server:
`
   java SSLServer
`
5. Start the SSL client:
`
   java SSLClient
`
6. The client and server will establish an SSL/TLS connection and perform server-side and client-side operations respectively.

## Configuration
The server keystore file (server.keystore) contains the server's private key and certificate. Update the file path and password in the SSLServer.java file.
The client truststore file (client.truststore) contains the server's certificate. Update the file path and password in the SSLClient.java file.

## Example
```java
   # Configuration for SSLClient.java
   truststorePath=path/to/client.truststore
   truststorePassword=password123

   # Configuration for SSLServer.java
   keystorePath=path/to/server.keystore
   keystorePassword=secretpassword
```

