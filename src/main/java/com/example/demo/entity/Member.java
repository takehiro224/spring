package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // Lombok: getter/setter
@AllArgsConstructor // 全フィールドに対する初期化値を引数に取るコンストラクタを生成
public class Member {
    // メンバーID
    private Integer id;
    private String name;
    
}
