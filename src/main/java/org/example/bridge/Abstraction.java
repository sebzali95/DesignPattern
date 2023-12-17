package org.example.bridge;

class Abstraction {
    public Bridge bridge;

    public Abstraction(Bridge operation) {
        this.bridge = operation;
    }

    public String Operation() {
        return "Abstraction <> " + bridge.OperationImp();
    }
}
