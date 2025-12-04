package net.rku.opnv.studentticketapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.header.writers.XXssProtectionHeaderWriter;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SpringDocConfig {

	@Bean
	public OpenAPI springShopOpenAPI() {

		Contact contact = new Contact().email("lukas.sauerbier@rku-it.de").name("Lukas Sauerbier")
				.url("https://github.com/rku-it-GmbH/Schuelerticket").extensions(Map.of("x-Company", "rku.it GmbH", "x-Company-URL", "https://rku-it.de"));
		
		License license = new License().name("MIT License").url("https://github.com/rku-it-GmbH/Schuelerticket/blob/main/LICENSE");

		Info info = new Info().title("Schülerticket API")
				.description("Schülerticket Schnittstelle zwischen Schulträger und VU in NRW").version("v0.8.1")
				.contact(contact).license(license);

		List<Server> servers = Arrays.asList(
				new Server().url("http://localhost:8080/studentticketapi").description("localhost"));

		return new OpenAPI().info(info).servers(servers);

	}

	@Bean
	public GroupedOpenApi publicApi() {
		return GroupedOpenApi.builder().group("studentticketapi").pathsToMatch("/api/**").build();
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf(AbstractHttpConfigurer::disable)
				.cors(AbstractHttpConfigurer::disable)

				.authorizeHttpRequests(auth -> auth.requestMatchers(HttpMethod.POST, "/*").permitAll()
						.anyRequest().permitAll())

				.headers(headers -> headers
						.xssProtection(xss -> xss.headerValue(XXssProtectionHeaderWriter.HeaderValue.ENABLED_MODE_BLOCK))
						.contentSecurityPolicy(
								csp -> csp.policyDirectives("default-src 'self';img-src data: https:;object-src 'none'; script-src 'self' 'unsafe-inline';style-src 'self' 'unsafe-inline';")));

		return http.build();
	}
}
