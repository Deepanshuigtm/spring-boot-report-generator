package com.crud.cruddemo.Controller;

public class UserErrorResponse{

    private int status;
    private String message;
    private long timeStamep;

    public UserErrorResponse() {

    }

    public UserErrorResponse(int status, String message, long timeStamep) {
        this.status = status;
        this.message = message;
        this.timeStamep = timeStamep;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimeStamep() {
        return timeStamep;
    }

    public void setTimeStamep(long timeStamep) {
        this.timeStamep = timeStamep;
    }
}
