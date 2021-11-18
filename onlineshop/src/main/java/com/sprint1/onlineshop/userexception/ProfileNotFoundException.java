package com.sprint1.onlineshop.userexception;

public class ProfileNotFoundException extends RuntimeException{

public ProfileNotFoundException() {
super();
}

public ProfileNotFoundException(String msg) {
super(msg);
}

public ProfileNotFoundException(Throwable cause) {
super(cause);
}



}