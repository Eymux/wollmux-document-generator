package de.muenchen.wollmux_document_generator.rest_service;

import org.jooby.Jooby;
import org.jooby.apitool.ApiTool;

public class Main extends Jooby {
    {
        get("/", () -> "Hello World!");

        use(new ApiTool().swagger("/swagger").raml("/raml"));
    }

    public static void main(final String[] args) {
        run(Main::new, args);
    }
}