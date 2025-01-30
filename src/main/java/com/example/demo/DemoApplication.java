package com.example.demo;

import com.example.demo.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args)
    {
        //MarioGame game = new MarioGame();
        //SuperContraGame game=new SuperContraGame();
        //PacManGame game = new PacManGame();

//        GamingConsole game=new MarioGame();//1
//        GameRunner runner=new GameRunner(game);//2

        ConfigurableApplicationContext context
                = run(DemoApplication.class, args);
        GameRunner runner=context.getBean(GameRunner.class);
        runner.run();

    }

}
