package com.springTest;

public class Mobile {
	private int m_id;
	private String m_name;
	private String m_color;
	private int m_price;
	public Mobile(int m_id, String m_name, String m_color, int m_price) {
		super();
		this.m_id = m_id;
		this.m_name = m_name;
		this.m_color = m_color;
		this.m_price = m_price;
	}
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_color() {
		return m_color;
	}
	public void setM_color(String m_color) {
		this.m_color = m_color;
	}
	public int getM_price() {
		return m_price;
	}
	public void setM_price(int m_price) {
		this.m_price = m_price;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mobile [m_id=" + m_id + ", m_name=" + m_name + ", m_color=" + m_color + ", m_price=" + m_price + "]";
	}
	
	
	
	
	
	

}
