package de.muenchen.wollmux_document_generator.rest_service;

import org.jooby.Jooby;

public class Main extends Jooby {
    {
        get("/", () -> "Hello World!");
    }

    public static void main(final String[] args) {
        run(Main::new, args);
    }
}