package repository;

import model.Product;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


@Configuration
public interface ProductRepository extends ReactiveMongoRepository <Product,String> {

}
