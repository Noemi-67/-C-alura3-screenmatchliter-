package com.litercuartointento.screenmatchliter.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos implements IConvierteDatos {
    private ObjectMapper objectMapper = new ObjectMapper(); //objectMapper es el metodo q nos permite leer los datos y mapear los valores de la API

    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) { // aca traemos el metodo obtener datos, con <T> T, es para decir que vamos a traer datos genericos en json y a una clase
        try {
            return objectMapper.readValue(json, clase); // readValue es leer valor, es decir va a leer el json y lo va trasformar a nuestra clase
        } catch (JsonProcessingException e) { // al declarar el readValue, tambien nos indica que debemos poder tratar excepciones, por lo cual debemos implementar
            throw new RuntimeException(e);
        }
    }
}

