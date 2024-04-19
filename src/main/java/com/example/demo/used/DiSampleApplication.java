package com.example.demo.used;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot起動クラス
 */
@SpringBootApplication
public class DiSampleApplication {
    /**
     * SpringBoot起動
     * @param args
     */
    // public static void main(String[] args) {
    //     SpringApplication.run(DiSampleApplication.class, args)
    //     .getBean(DiSampleApplication.class).execute();
    // }

    @Autowired // 「1. インターフェースを利用して依存関係を作る」「2. インスタンスを明示的に生成しない」
    private Greet g;

    private void execute() {
        String msg = g.greeting();
        System.out.println(msg);
    }

}
