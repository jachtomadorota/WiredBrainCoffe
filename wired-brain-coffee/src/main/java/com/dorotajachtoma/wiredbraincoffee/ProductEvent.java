package com.dorotajachtoma.wiredbraincoffee;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ProductEvent {


    @Setter
    @Getter
    private Long id;


    @Setter
    @Getter
    private String eventType;


}
