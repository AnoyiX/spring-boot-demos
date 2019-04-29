package com.anoyi.test;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EncryptTest {

    @Autowired
    private StringEncryptor jasyptStringEncryptor;

    @Test
    public void encrypt() {
        String encryptStr = jasyptStringEncryptor.encrypt("anoyi");
        System.out.println(encryptStr);
    }

    @Test
    public void decrypt() {
        String encryptStr = jasyptStringEncryptor.decrypt("TqrnYZn55aFVwnSo2TrbFA==");
        System.out.println(encryptStr);
    }

}
