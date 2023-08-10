package org.example.atm;

import java.io.IOException;

public interface IATMOperations {
    public void getCash() throws IOException;
    public void checkBalance();
}
