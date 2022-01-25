package com.example.mockserver.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SendAccInfomationQryReq {
    /**
     * 账号
     */
    public String acctNo;
    /**
     * 币种
     */
    public String currency;
}

