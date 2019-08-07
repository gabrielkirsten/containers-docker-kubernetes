package br.com.uniciv.testapi;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.UUID;

public class Message implements Serializable {

    @Id
    private UUID id;

    private String message;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}




