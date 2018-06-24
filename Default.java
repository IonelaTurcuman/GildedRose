
public class Default extends Item implements GildedRoseItems{
	
	public static final int MAX_QUALITY_VALUE = 50;
	public static final int EXPIRED_ITEM = 0;
	public static final int NORMAL_DECREASE_VALUE = 1;
	public static final int DOUBLE_DECREASE_VALUE = 2;

	public Default(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateSellInValue() {
		this.sellIn--;
	}

	@Override
	public void updateQualityValue() {
		if (this.sellIn <= EXPIRED_ITEM) {
			this.quality -= DOUBLE_DECREASE_VALUE;
		} else {
			this.quality -= NORMAL_DECREASE_VALUE;
		}
	}
	
	

}
