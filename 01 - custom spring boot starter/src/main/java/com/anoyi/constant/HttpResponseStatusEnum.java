package com.anoyi.constant;

import lombok.AllArgsConstructor;

/**
 * HTTP 请求状态枚举
 */
@AllArgsConstructor
public enum HttpResponseStatusEnum implements CommonResponse {

    EXCEPTION("-1", "server error"),                // 服务端异常
    SUCCESS("0", "success"),                        // 成功请求
    ;
    private String code;
    private String message;

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Object getData() {
        return null;
    }
}