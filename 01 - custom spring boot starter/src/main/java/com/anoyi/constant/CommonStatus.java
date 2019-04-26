package com.anoyi.constant;

public enum CommonStatus {
    // 存在
    YES(1),
    // 删除
    NO(0);
    private int code;

    CommonStatus(int code) {
        this.code = code;
    }

    public int getValue() {
        return code;
    }
}
