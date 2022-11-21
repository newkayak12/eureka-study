package com.msastudy.eurekaApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
        System.out.println("" +
                "  _____ _   _ ____  _____ _  __    _    _ \n" +
                " | ____| | | |  _ \\| ____| |/ /   / \\  | |\n" +
                " |  _| | | | | |_) |  _| | ' /   / _ \\ | |\n" +
                " | |___| |_| |  _ <| |___| . \\  / ___ \\|_|\n" +
                " |_____|\\___/|_| \\_\\_____|_|\\_\\/_/   \\_(_)");
    }

}
