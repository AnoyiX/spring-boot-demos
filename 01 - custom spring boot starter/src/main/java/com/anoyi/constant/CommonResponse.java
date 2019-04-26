package com.anoyi.constant;

/**
 * 通用响应体
 */
public interface CommonResponse {

    /**
     * 获取状态码
     */
    String getCode();

    /**
     * 获取消息
     */
    String getMessage();

    /**
     * 响应数据
     */
    Object getData();
}
