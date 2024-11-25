package com.litercuartointento.screenmatchliter.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)


        public record DatosLibros(
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<DatosAutores> autor,
        @JsonAlias("languages") List<String> idiomas,
        @JsonAlias("download_count") double numeroDeDescargas
) {
}