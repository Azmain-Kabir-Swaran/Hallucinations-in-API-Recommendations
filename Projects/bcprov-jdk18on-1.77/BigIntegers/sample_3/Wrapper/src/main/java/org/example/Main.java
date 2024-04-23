package org.example;


import org.bouncycastle.jcajce.provider.asymmetric.ec.KeyPairGeneratorSpi;
import org.bouncycastle.jce.provider.JCEKEKGenerator;
import org.bouncycastle.util.Arrays;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.SecureRandom;

class Main {
    public static void main(String[] args) {
        // generate a keypair using BigIntegers API
        BigInteger p = new BigInteger(64, 100, new SecureRandom());
        BigInteger q = new BigInteger(64, 100, new SecureRandom());

        BigInteger e = BigInteger.valueOf(65537);
        KeyPair kp = KeyPairGeneratorSpi.getInstance("RSA").initialize(1024, new SecureRandom()).generateKeyPair();

        // do something else...
        BigInteger n = kp.getPublic().getModulus();
        BigInteger d = kp.getPrivate().getPrivateExponent();
        // print the two generated BigIntegers
        System.out.println("n="+n);
        System.out.println("d="+d);

        // convert BigIntegers back to byte arrays
        byte[] bytesN = n.toByteArray();
        byte[] bytesD = d.toByteArray();

        // print the bytes
        System.out.println("bytes of n: " + Arrays.toString(bytesN));
        System.out.println("bytes of d: " + Arrays.toString(bytesD));

    }
}