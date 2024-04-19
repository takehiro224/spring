package com.example.demo.used;

// @Component // 「3. アノテーションを使われる側クラスに付与する」「4. Spring Frameworkにインスタンス生成させる」
public class MorningGreet implements Greet {
    @Override
    public String greeting() {
        return "Good Morning.";
    }
}
