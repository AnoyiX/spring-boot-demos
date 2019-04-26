package com.anoyi.service;

import com.anoyi.constant.CommonResponse;
import com.anoyi.constant.HttpResponseStatusEnum;

/**
 * 服务异常
 */
public class ServiceException extends RuntimeException {
    /**
     * 异常码
     */
    private String code;
    /**
     * 相关对象
     */
    private Object data;

    public ServiceException(CommonResponse commonResponse) {
        super(commonResponse.getMessage());
        this.code = commonResponse.getCode();
        this.data = commonResponse.getData();
    }

    public ServiceException(String code, String message) {
        super(message);
        this.code = code;
    }

    public ServiceException(String message) {
        super(message);
        this.code = HttpResponseStatusEnum.EXCEPTION.getCode();
    }

    public ServiceException(String code, String message, Object data) {
        super(message);
        this.code = code;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public Object getData() {
        return data;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setData(Object data) {
        this.data = data;
    }
}