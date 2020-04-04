// package io.github.guiritter.transferer_local;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.core.task.AsyncTaskExecutor;
// import org.springframework.scheduling.annotation.AsyncConfigurer;
// import org.springframework.scheduling.annotation.EnableAsync;
// import org.springframework.scheduling.annotation.EnableScheduling;
// import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
// import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Configuration
// @EnableAsync
// @EnableScheduling
// public class AsyncConfiguration implements AsyncConfigurer {

// 	@Override
// 	@Bean(name = "taskExecutor")
// 	public AsyncTaskExecutor getAsyncExecutor() {
// 		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
// 		executor.setCorePoolSize(Integer.MAX_VALUE);
// 		executor.setThreadNamePrefix("io.github.guiritter.transferer_local.async_executor_thread.");
// 		return executor;
// 	}

// 	/** Configure async support for Spring MVC. */
// 	@Bean
// 	public WebMvcConfigurer webMvcConfigurerAdapter(
// 			AsyncTaskExecutor taskExecutor) {
// 		return new WebMvcConfigurer() {

// 			@Override
// 			public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
// 				configurer
// 						.setDefaultTimeout(Long.MAX_VALUE)
// 						.setTaskExecutor(taskExecutor);
// 				configureAsyncSupport(configurer);
// 			}
// 		};
// 	}

// 	// @Autowired
// 	// private AsyncTaskExecutor taskExecutor;

// 	// /** Configure async support for Spring MVC. */
// 	// @Bean
// 	// public WebMvcConfigurer webMvcConfigurerAdapter() {
// 	// 	return new WebMvcConfigurer() {

// 	// 		@Override
// 	// 		public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
// 	// 			configurer
// 	// 					.setDefaultTimeout(Long.MAX_VALUE)
// 	// 					.setTaskExecutor(taskExecutor);
// 	// 			configureAsyncSupport(configurer);
// 	// 		}
// 	// 	};
// 	// }
// }
