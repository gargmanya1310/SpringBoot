package com.example.demo;

import com.example.demo.game.GameRunner;
import com.example.demo.game.MarioGame;
import com.example.demo.game.PacManGame;
import com.example.demo.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args)
    {
        //SpringApplication.run(DemoApplication.class, args);
        //MarioGame game = new MarioGame();
        //SuperContraGame game=new SuperContraGame();
        PacManGame game = new PacManGame();
        GameRunner runner=new GameRunner(game);
        runner.run();

    }

}
