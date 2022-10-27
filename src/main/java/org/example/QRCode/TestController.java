package org.example.QRCode;

import com.google.zxing.WriterException;

import java.io.File;
import java.io.IOException;

public class TestController {
    public void createQrCodeForFile(){
        String codeContent = "https://www.baidu.com/";
        File file = new File("C:/secFile");
        try {
            QRBarCodeUtil.createCodeToFile(codeContent,file,"baidu");
        } catch (WriterException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
