package com.designpattern.chainOfResponsibility;

public abstract class Handler {

    private Handler next;

    public Handler(Handler next){
        this.next = next;
    }

    public  void handle(HttpRequest request){
        if(doHandle(request)){
            return;
        }
        next.handle(request);
    }

    public abstract boolean doHandle(HttpRequest request);
}