
public class Conjured extends Item implements GildedRoseItems{
	
	public static final int MAX_QUALITY_VALUE = 50;
	public static final int NO_QUALITY = 0;
	public static final int DECREASE_VALUE = 2;

	public Conjured(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateSellInValue() {
		this.sellIn--;
	}

	@Override
	public void updateQualityValue() {
		if (this.quality > NO_QUALITY) {
			this.quality -= DECREASE_VALUE;
		}
		if (this.quality < NO_QUALITY) {
			this.quality = NO_QUALITY;
		}
	}
	

}
