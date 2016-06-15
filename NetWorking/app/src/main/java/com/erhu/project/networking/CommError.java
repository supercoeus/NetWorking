package com.erhu.project.networking;

/**
 * 自定义错误
 */
public class CommError {
    private String error;

    public CommError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
