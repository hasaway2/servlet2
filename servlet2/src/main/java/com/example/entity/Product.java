package com.example.entity;

import lombok.*;

// Entity - 스프링에서 데이터를 저장하는 클래스

@Data
@AllArgsConstructor
public class Product {
	private String name;
	private Long price;
}
