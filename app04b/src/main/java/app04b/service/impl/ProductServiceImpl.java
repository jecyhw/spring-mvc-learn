package app04b.service.impl;

import app04b.domain.Product;
import app04b.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by jecyhw on 2016/6/12.
 */
@Service
public class ProductServiceImpl implements ProductService {
    private Map<Long, Product> productMap = new HashMap<Long, Product>();
    private AtomicLong generator = new AtomicLong();

    public ProductServiceImpl() {
        Product product = new Product();
        product.setName("JX1 Power Drill");
        product.setDescription("Powerful hand drill, made to perfection");
        product.setPrice(129.99f);
    }
    public Product add(Product product) {
        long newId = generator.incrementAndGet();
        product.setId(newId);
        productMap.put(newId, product);
        return product;
    }

    public Product get(long id) {
        return productMap.get(id);
    }
}
