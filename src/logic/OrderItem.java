package logic;

public class OrderItem {
	private Item item;
	private int itemAmount;

	public OrderItem(Item item, int itemAmount) {
		super();
		this.item = item;
		this.setItemAmount(itemAmount);
	}

	public void increaseItemAmount(int amount) {
		if (amount > 0) {
			itemAmount += amount;
		}
	}

	public int calculateTotalPrice() {
		return item.getPricePerPiece()*itemAmount;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getItemAmount() {
		return itemAmount;
	}

	public void setItemAmount(int itemAmount) {
		this.itemAmount = Math.max(0, itemAmount);
	}
}
