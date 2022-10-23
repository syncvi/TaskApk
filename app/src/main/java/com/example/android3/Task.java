package com.example.android3;

import java.util.Date;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {
     private  UUID Id;
     private  String Name;
     private Date Date;
     private boolean  Done;

    public Task() {
        Id = UUID.randomUUID();
        Date = new Date();
    }
}
