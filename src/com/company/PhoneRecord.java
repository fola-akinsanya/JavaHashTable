package com.company;

import java.time.ZonedDateTime;

public class PhoneRecord {
    private final String key;
    private final String phoneNumber;

    public PhoneRecord(String key, String phoneNumber) {
        this.key = key;
        this.phoneNumber = phoneNumber;
    }

    public String getKey(){
        return key;
    }

    public String getPhoneNumber(String key) {
        return phoneNumber;
    }

}
