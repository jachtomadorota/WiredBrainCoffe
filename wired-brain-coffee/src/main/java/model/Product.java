package model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@AllArgsConstructor
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
