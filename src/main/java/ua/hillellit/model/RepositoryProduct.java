package ua.hillellit.model;

import lombok.Data;
import java.util.List;

/**
 * @author Ludmila Litvinova on 15.12
 */
@Data
public class RepositoryProduct {
    List<Product> products;

    public RepositoryProduct(List<Product> products) {
        this.products = products;
    }

    public List<Product> getAll() {
        return products;
    }

    public Product getById(int id) {
        return products.stream().filter(product -> product.getId() == id).findFirst().orElse(null);
    }
}
