package com.ipsita.bank.accounts.exception;

public class CustomerAlreadyExistsException extends RuntimeException{

    String message ;

    public CustomerAlreadyExistsException(String message){
        super(message) ;
    }

}
