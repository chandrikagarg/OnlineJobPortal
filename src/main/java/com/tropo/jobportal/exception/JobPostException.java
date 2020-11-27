package com.tropo.jobportal.exception;

public class JobPostException extends Exception{
    public JobPostException(final String message){
        super(message);
    }

    public JobPostException(final Throwable e) {
        super(e);
    }

}
