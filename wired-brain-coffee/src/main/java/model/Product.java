package model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {

    @Id
    @Setter
    @Getter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Setter
    @Getter
    private Double price;



}
