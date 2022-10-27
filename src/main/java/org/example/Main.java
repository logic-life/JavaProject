package org.example;

import org.example.QRCode.TestController;

public class Main {
    public static void main(String[] args) {
        TestController testController = new TestController();
        testController.createQrCodeForFile();

    }
}