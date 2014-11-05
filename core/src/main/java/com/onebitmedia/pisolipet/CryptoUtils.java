package com.onebitmedia.pisolipet;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CryptoUtils {
    private static String convertToHex(byte[] data) {
        StringBuilder buf = new StringBuilder();
        for (byte b : data) {
            int halfByte = (b >>> 4) & 0x0F;
            int twoHalves = 0;
            do {
                buf.append((0 <= halfByte) && (halfByte <= 9) ? (char) ('0' + halfByte) : (char) ('a' + (halfByte - 10)));
                halfByte = b & 0x0F;
            } while (twoHalves++ < 1);
        }
        return buf.toString();
    }

    public static String SHA1(String text) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-1");
            md.update(text.getBytes("iso-8859-1"), 0, text.length());
            byte[] sha1hash = md.digest();
            return convertToHex(sha1hash);
        } catch (NoSuchAlgorithmException ignored) {
            return null;
        } catch (UnsupportedEncodingException ignored) {
            return null;
        }
    }
}
