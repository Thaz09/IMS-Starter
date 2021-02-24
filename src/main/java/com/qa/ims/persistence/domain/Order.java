package com.qa.ims.persistence.domain;

public class Order {

	private Long id;
	private Long customerID;
	private Long itemID;

	public Order(Long customerID, Long itemID) {
		this.setCustomerID(customerID);
		this.setItemID(itemID);
	}

	public Order(Long id, Long customerID, Long itemID) {
		this.setId(id);
		this.setCustomerID(customerID);
		this.setItemID(itemID);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}

	public Long getItemID() {
		return itemID;
	}

	public void setItemID(Long itemID) {
		this.itemID = itemID;
	}

	@Override
	public String toString() {
		return "order-id:" + id + " customer-id:" + customerID + " item-id:" + itemID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerID == null) ? 0 : customerID.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((itemID == null) ? 0 : itemID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (getCustomerID() == null) {
			if (other.getCustomerID() != null)
				return false;
		} else if (!getCustomerID().equals(other.getCustomerID()))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (getItemID() == null) {
			if (other.getItemID() != null)
				return false;
		} else if (!getItemID().equals(other.getItemID()))
			return false;
		return true;
	}
	
	
}
