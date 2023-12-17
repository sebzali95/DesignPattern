package org.example.singleton;

public class DataManagerMultiThreadingSafe {
    private volatile static DataManagerMultiThreadingSafe dataManager;

    public static DataManagerMultiThreadingSafe getInstance() {
        if (dataManager == null) {
            synchronized (DataManagerMultiThreadingSafe.class) {
                if (dataManager == null)
                    dataManager = new DataManagerMultiThreadingSafe();
            }
        }
        return dataManager;
    }

    private DataManagerMultiThreadingSafe() {

    }
}
