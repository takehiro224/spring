package com.example.demo.form;

import java.util.Objects;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class AssertForm {
    /** パスワード */
    @NotEmpty
    private String password;
    /** 確認用パスワード */
    @NotNull
    private String confirmPassword;

    // パスワードと確認用パスワードが一致するかチェック
    @AssertTrue(message = "パスワードが一致しません。")
    public boolean isSamePassword() {
        return Objects.equals(password, confirmPassword);
    }
}
