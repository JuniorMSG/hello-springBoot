package com.example.sample.data.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    /*
    * Lombok @AllArgsConstructor 사용 시 모든 필드를 초기화하는 생성자가 필요합니다
    * Lombok @NoArgsConstructor 사용 시 인자가 없는 기본 생성자가 필요합니다
    * Lombok @Data 사용 시 @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor를 자동으로 적용합니다
    * Lombok @Entity 사용 시 @ToString, @EqualsAndHashCode, @RequiredArgsConstructor를 자동으로 적용합니다
    * Lombok @Table 사용 시 @ToString, @EqualsAndHashCode, @RequiredArgsConstructor를 자동으로 적용합니다
    * Lombok @Column 사용 시 @ToString, @EqualsAndHashCode, @RequiredArgsConstructor를 자동으로 적용합니다
    * Lombok @Id 사용 시 @ToString, @EqualsAndHashCode, @RequiredArgsConstructor를 자동으로 적용합니다
    * Lombok @GeneratedValue 사용 시 @ToString, @EqualsAndHashCode, @RequiredArgsConstructor를 자동으로 적용합니다
    *
    * @Id : 해당 필드가 테이블의 기본 키임을 나타냅니다
    * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer stock;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
