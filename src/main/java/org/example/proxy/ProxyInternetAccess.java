package org.example.proxy;

public class ProxyInternetAccess implements OfficeInternetAddress {

    public String employeeName;
    public RealInternetAccess realInternetAccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        if (getRole(employeeName) > 4) {
            realInternetAccess = new RealInternetAccess(employeeName);
            realInternetAccess.grantInternetAccess();
        } else {
            System.out.println("No internet access granted.Your job level is bellow 5");
        }
    }

    public int getRole(String employeeName) {
        return 9;
    }
}
