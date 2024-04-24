package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.AssertForm;

@Controller
public class CheckController {
    // 入力画面の表示
    @GetMapping("show03")
    public String showForm(AssertForm assertForm) {
        return "entry3";
    }

    // 相関項目チェックの実行
    @PostMapping("checkPassword")
    public String check(@Validated AssertForm form, BindingResult result, Model model) {
        // バリデーションの実施
        if (result.hasErrors()) {
            return "entry3";
        }
        model.addAttribute("message", "入力に問題ありません");
        return "result";
    }
}
