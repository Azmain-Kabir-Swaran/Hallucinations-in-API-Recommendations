package org.example;


import org.apache.commons.lang3.CharEncoding;
import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    static Logger log = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            String encodedString = "YWJjMTIzIT8kKiMjJCstLi4uP0BBQkNERUZHSElKS0xM";
            String decodedString = URLDecoder.decode(encodedString, CharEncoding.UTF_8);
            log.info("Decoded string: " + decodedString);

            byte[] binaryData = DatatypeConverter.parseHexBinary(decodedString);
            log.info("Hex to Binary: " + new String(binaryData));
        } catch (UnsupportedEncodingException e) {
            log.error("Error: " + e.getMessage());
        }
    }
}