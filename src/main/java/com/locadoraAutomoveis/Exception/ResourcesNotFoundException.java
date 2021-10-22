package com.locadoraAutomoveis.Exception;

public class ResourcesNotFoundException extends RuntimeException{

    private static final String EXECPTION_ERROR_MESSAGE = "Não encontrado!";

    public ResourcesNotFoundException() {
        super(EXECPTION_ERROR_MESSAGE);
    }
}
