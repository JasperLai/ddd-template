package com.dangkang.client.dto.protocol.request;

import com.dangkang.client.dto.valueobject.ApplicationServiceVO;

/**
 * @author anzj
 * @date 2022/12/19 17:06
 */
public class ApplicationServiceRequest {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
