package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.CalcForm;
import com.example.demo.validator.CalcValidator;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ValidationController {

    /** インジェクション */
    private final CalcValidator calcValidator;

    /** 相関チェック登録 */
    @InitBinder("calcForm")
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.addValidators(calcValidator);
    }

    /** 「form-backing bean」の初期化 */
    @ModelAttribute
    public CalcForm setUpForm() {
        return new CalcForm();
    }

    @GetMapping("show02")
    public String showView02() {
        return "entry2";
    }

    @PostMapping("calc")
    public String confirmView(@Validated CalcForm form, BindingResult bindingResult, Model model) {
        // 入力チェック
        if (bindingResult.hasErrors()) {
            // 入力チェックNG: 入力画面へ戻る
            return "entry2";
        }
        // 入力チェックOK: 加算実行
        Integer calcResult = form.getLeftNum() + form.getRightNum();
        // Modelに格納する
        model.addAttribute("result", calcResult);
        // 確認画面へ
        return "confirm3";
    }
}
