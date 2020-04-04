// package io.github.guiritter.transferer_local;

// import org.springframework.context.annotation.Configuration;
// import org.springframework.scheduling.annotation.EnableAsync;
// import org.springframework.transaction.annotation.EnableTransactionManagement;
// import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
// import org.springframework.web.servlet.config.annotation.EnableWebMvc;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Configuration
// @EnableWebMvc
// @EnableTransactionManagement
// @EnableAsync
// public class MyConfiguration implements WebMvcConfigurer {

// 	@Override
// 	public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
// 		configurer.setDefaultTimeout(-1);
// 	}
// }