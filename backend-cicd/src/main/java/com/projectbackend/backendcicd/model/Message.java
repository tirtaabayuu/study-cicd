package com.projectbackend.backendcicd.model;

public class Message {
    //Attributes/Data/Properties
    private String message;

    //No Arg Constructor
    public Message(){
            //
    }

    //All Arg Constructor
    public Message(String message) {
        this.message=message;
    }

    //Getter
    public String getMessage () {
        return message;
    }

    //Setter
    public void setMessage (String message) {
        this.message=message;
    }
}
