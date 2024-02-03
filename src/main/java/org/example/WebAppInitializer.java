package org.example;




@SpringBootApplication
public class WebAppInitializer {


    public static void main(String[] args) {
        SpringApplication.run(WebAppInitializer.class);
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }


}
