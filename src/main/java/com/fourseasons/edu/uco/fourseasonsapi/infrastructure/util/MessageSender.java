package com.fourseasons.edu.uco.fourseasonsapi.infrastructure.util;

public interface MessageSender<T> {
    void execute(T message, String idMessage);
}