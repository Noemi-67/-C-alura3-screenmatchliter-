package com.litercuartointento.screenmatchliter.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class <T> clase);
}
