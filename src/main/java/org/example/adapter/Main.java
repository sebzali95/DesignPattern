package org.example.adapter;
import org.example.adapter.PlugAdapter.Samsung;
import org.example.adapter.PlugAdapter.TelephonePlugAdapter;


public class Main {
    public static void main(String[] args) {
        var plug = new Plug();
        var refrigerator = new Refrigerator();
        var television = new Television();

        plug.electric(refrigerator);
        plug.electric(television);

        var samsung = new Samsung();
        var adapter = new TelephonePlugAdapter(samsung);

        plug.electric(adapter);
    }


}
