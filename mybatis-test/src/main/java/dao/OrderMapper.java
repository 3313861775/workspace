package dao;

import pojo.Order;

import java.util.List;

public interface OrderMapper {
    List<Order> findALL();
}
