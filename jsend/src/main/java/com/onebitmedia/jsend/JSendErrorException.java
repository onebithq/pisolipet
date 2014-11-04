package com.onebitmedia.jsend;

public class JSendErrorException extends JSendException {

    public JSendErrorException(String detailMessage) {
        super(detailMessage);
    }

    public JSendErrorException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public JSendErrorException(Throwable throwable) {
        super(throwable);
    }
}
