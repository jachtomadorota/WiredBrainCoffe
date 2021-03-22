package com.dorotajachtoma.wiredbraincoffee;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

    @Id
    @Setter
    @Getter
    private String id;

    @Getter
    @Setter
    private String name;

    @Setter
    @Getter
    private Double price;



}
