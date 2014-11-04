package com.onebitmedia.jsend;

public class JSendFailException extends JSendException {

    public JSendFailException(String detailMessage) {
        super(detailMessage);
    }

    public JSendFailException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public JSendFailException(Throwable throwable) {
        super(throwable);
    }
}
