package com.onebitmedia.jsend;

public class JSendException extends RuntimeException {

    private String data;

    public JSendException(String detailMessage, String data) {
        super(detailMessage);
        this.data = data;
    }

    public JSendException(String detailMessage) {
        super(detailMessage);
    }

    public JSendException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public JSendException(Throwable throwable) {
        super(throwable);
    }

    public String getData() {
        return data;
    }
}
