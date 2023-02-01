package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private OrderStatus orderStatus;
	
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus orderStatus, Client client) {
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void RemoveItem(OrderItem item) {
		items.remove(item);
	}
	
	
	
	public Double total() {  // refazer aqui
		double sum = 0.0;
		for(OrderItem it : items) {
			sum += it.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + orderStatus + "\n");
		sb.append("Client: " + client.getName());
		sb.append(" (" + sdf2.format(client.getBirthDate()) + ") - ");
		sb.append(client.getEmail() + "\n");
		sb.append("Order Items: \n");
		for(OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		
		return sb.toString();
		
	}
	
	
	
	

}
