// package io.github.guiritter.transferer_local;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.core.task.AsyncTaskExecutor;
// import org.springframework.core.task.SimpleAsyncTaskExecutor;
// import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Configuration
// public class WebConfig implements WebMvcConfigurer {

// 	@Override
// 	public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
// 		configurer.setDefaultTimeout(-1);
// 		configurer.setTaskExecutor(asyncTaskExecutor());
// 	}

// 	@Bean
// 	public AsyncTaskExecutor asyncTaskExecutor() {
// 		// an implementaiton of AsyncTaskExecutor
// 		return new SimpleAsyncTaskExecutor("async");
// 	}
// }
