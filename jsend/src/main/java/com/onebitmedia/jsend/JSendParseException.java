package com.onebitmedia.jsend;

public class JSendParseException extends JSendException {

    public JSendParseException(String detailMessage) {
        super(detailMessage);
    }

    public JSendParseException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public JSendParseException(Throwable throwable) {
        super(throwable);
    }
}
