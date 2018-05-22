package jpokebot;

public class Pokemon {

	private int id;
	private String name;
	private int baseExperience;
	private int height;
	private boolean isDefault;
	private int order;
	private int weight;
	/*
	 * TODO: Abilities
	 */
	
	public Pokemon() {
		this.setId(0);
		this.setName(null);
		this.setBaseExperience(0);
		this.setHeight(0);
		this.setDefault(false);
		this.setOrder(0);
		this.setWeight(0);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBaseExperience() {
		return baseExperience;
	}

	public void setBaseExperience(int baseExperience) {
		this.baseExperience = baseExperience;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
