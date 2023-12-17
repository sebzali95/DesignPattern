package org.example.proxy;

public class ProxyPatternClient {
    public static void main(String[] args) {
        OfficeInternetAddress officeInternetAddress = new ProxyInternetAccess(" : Sebzali ");

        officeInternetAddress.grantInternetAccess();
    }
}
