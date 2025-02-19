package io.ids.argus.entry;

import io.ids.argus.center.startup.Argus;
import io.ids.argus.core.base.module.annotation.ArgusApplication;
import io.ids.argus.entry.base.JsonMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CharacterEncodingFilter;

@SpringBootApplication
@ArgusApplication(pkg = "io.ids.argus.entry")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        Argus.start(Application.class);
    }
}
