package com.comarch.szkolenia.car.rent;

import org.apache.commons.codec.digest.DigestUtils;

public class HashTest {
    public static void main(String[] args) {
        String password = "janusz123{B0;g;2PS)d.i!$}x)_v2;%RRxZGru2k-^n!QneR+!4jLpG0Fi";

        String hash = DigestUtils.md5Hex(password);

        System.out.println(hash);
    }
}
