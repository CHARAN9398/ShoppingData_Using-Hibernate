package Mavenwork.hibernate2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supermart {

	@Id
	private int id;
	
	@Column(name = "item",nullable = false)
	private String names;
	
	private float price;
	
	
	public int getid(){
		return id;
	}
	public void setid(int id){
		this.id = id;
	}
	
	public String getnames(){
		return names;
	}
	
	public void setnames(String names){
		this.names = names;
	}
	
	public float getprice(){
		return price;
	}
	
	public void setprice(float price){
		this.price = price;
	}
	public String toString() {
        return "Supermart{id=" + id + ", names='" + names + "', price=" + price + "}";
    }
}

