/*
package org.privacyidea;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class TestSerialAuthentication implements IPILogger {

    @Test
    public void test() {
        PrivacyIDEA privacyIDEA = new PrivacyIDEA.Builder("https://127.0.0.1", "test")
                .setSSLVerify(false)
                .setServiceAccount("admin", "admin")
                .setLogger(this)
                .build();

        List<TokenInfo> infos = privacyIDEA.getTokenInfo("someUser");

        if (infos != null) {
            infos = infos.stream().filter(tokenInfo -> tokenInfo.getTokenType().equals("hotp")).collect(Collectors.toList());

            String serial = infos.get(0).getSerial();
            String otp = "496384";

            PIResponse response = privacyIDEA.validateCheckSerial(serial, otp);
        }
    }

    @Override
    public void log(String message) {
        //System.out.println(message);
    }

    @Override
    public void error(String message) {
        // System.out.println(message);
    }

    @Override
    public void log(Throwable t) {
        System.out.println(t);
    }

    @Override
    public void error(Throwable t) {
        System.out.println(t);
    }
}
*/