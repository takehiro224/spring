package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Member;

@Controller
public class ThymeleafController {


    @GetMapping("show")
    public String showView(Model model) {
        // Memberを作成
        Member member1 = new Member(1, "Taro");
        // コレクション格納用:Memberを作成
        Member member2 = new Member(1, "Jiro");
        Member member3 = new Member(2, "Hanako");
        // Listを作成
        List<String> directionList = new ArrayList<>();
        directionList.add("東");
        directionList.add("西");
        directionList.add("南");
        directionList.add("北");
        // Mapを作成し、Memberを格納
        Map<String, Member> memberMap = new HashMap<>();
        memberMap.put("jiro", member2);
        memberMap.put("hanako", member3);
        // Listを作成し、Memberを格納
        List<Member> memberList = new ArrayList<>();
        memberList.add(member2);
        memberList.add(member3);
        // Modelにデータを格納する
        model.addAttribute("name", "Taro");
        model.addAttribute("mb", member1);
        model.addAttribute("list", directionList);
        model.addAttribute("map", memberMap);
        model.addAttribute("members", memberList);
        return "main";
    }
}
