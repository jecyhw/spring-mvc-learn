package app04b.service;

import app04b.domain.Product;

/**
 * Created by jecyhw on 2016/6/12.
 */
public interface ProductService {
    Product add(Product product);
    Product get(long id);
}
