package com.onebitmedia.jsend;

/**
 * Class to models JSend data as specified in
 * <a href="http://labs.omniti.com/labs/jsend">http://labs.omniti.com/labs/jsend</a>
 *
 * @param <T>
 * @author akhyar
 * @see <a href="http://labs.omniti.com/labs/jsend">http://labs.omniti.com/labs/jsend</a>
 */

public class JSend<T> {
    public static final String STATUS_SUCCESS = "success";
    public static final String STATUS_FAIL = "fail";
    public static final String STATUS_ERROR = "error";

    private String status = "";
    private String message;
    private int code;
    private T data;

    public JSend(String status, String message, int code, T data) {
        this.status = status;
        this.message = message;
        this.code = code;
        this.data = data;
    }

    /**
     * Helper method to extract JSend data and throw exceptions according to the status
     *
     * @param jsend JSend object to read
     * @param <T>   The type of object contained in JSend data
     * @return JSend data
     * @throws JSendFailException
     * @throws JSendErrorException
     */
    public static <T> T read(JSend<T> jsend) throws JSendFailException, JSendErrorException {
        if (jsend.isSuccess())
            return jsend.getData();
        else if (jsend.isFail())
            throw new JSendFailException(jsend.getMessage());
        else if (jsend.isError())
            throw new JSendErrorException(jsend.getMessage());

        if (isEmpty(jsend.getMessage()))
            throw new JSendErrorException("Unknown error");
        else
            throw new JSendErrorException(jsend.getMessage());
    }

    private static boolean isEmpty(String message) {
        return message == null || message.isEmpty();
    }

    public boolean isSuccess() {
        return getStatus() != null && STATUS_SUCCESS.equalsIgnoreCase(getStatus());
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isFail() {
        return getStatus() == null || getStatus().startsWith(STATUS_FAIL);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isError() {
        return getStatus() == null || STATUS_ERROR.equalsIgnoreCase(getStatus());
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
