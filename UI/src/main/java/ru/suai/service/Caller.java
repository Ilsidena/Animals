package ru.suai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.suai.Rest;

@Service
public class Caller {
    private Api api;

    @Autowired
    public Caller(Api simpleApi){
        this.api = simpleApi;
    }

    public Rest getResponse(String name, String food, int count){
        return api.getResponse(name, food, count);
    }
}