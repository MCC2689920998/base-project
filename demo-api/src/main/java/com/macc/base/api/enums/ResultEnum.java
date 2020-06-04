package com.macc.base.api.enums;

/**
 * @Description
 * @Author MCC
 * @Date 2020/6/3 16:57
 * @Version 1.0
 **/
public enum ResultEnum {

    SUCCESS("000000","操作成功"),

    ;

    public static ResultEnum getByCode(final String code) {
        if (code == null || code.length() <= 0) {
            return null;
        }
        for (ResultEnum mode : values()) {
            if (mode.code.equals(code)) {
                return mode;
            }
        }
        return null;
    }

    public static String getValueByCode(final String code) {
        if (code == null || code.length() <= 0) {
            return null;
        }
        for (ResultEnum mode : values()) {
            if (mode.code.equals(code)) {
                return mode.getValue();
            }
        }
        return null;
    }

    private ResultEnum(final String code, final String value) {
        this.code = code;
        this.value = value;
    }

    private String code;
    private String value;

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }


}
