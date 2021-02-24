package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;

import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {
	
	public static final Logger LOGGER = LogManager.getLogger();

	private OrderDAO orderDAO;
	private Utils utils;

	public OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
	}

	/**
	 * Reads all orders to the logger
	 */
	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order);
		}
		return orders;
	}

	/**
	 * Creates a customer by taking in user input
	 */
	@Override
	public Order create() {
		LOGGER.info("Please enter customer ID");
		Long customerID = utils.getLong();
		LOGGER.info("Please enter item ID");
		Long itemID=utils.getLong();
		Order order = orderDAO.create(new Order(customerID, itemID));
		LOGGER.info("Order created");
		return order;

}
	
	/**
	 * Updates an existing customer by taking in user input
	 */
	@Override
	public Order update() {
		LOGGER.info("Please enter the order id of the order you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter customer ID");
		Long customerID = utils.getLong();
		LOGGER.info("Please enter item ID");
		Long itemID = utils.getLong();
		Order order = orderDAO.update(new Order(id, customerID, itemID));
		LOGGER.info("Order Updated");
		return order;
	}

	/**
	 * Deletes an existing customer by the id of the customer
	 * 
	 * @return
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the order id of the order you would like to delete");
		Long id = utils.getLong();
		return orderDAO.delete(id);
	}


}
