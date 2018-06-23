
public class AgedBrie extends Item implements GildedRoseItems {
	
	public static final int MAX_QUALITY_VALUE = 50;

	public AgedBrie(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateSellInValue() {
		this.sellIn--;
	}

	@Override
	public void updateQualityValue() {
		if (this.quality < MAX_QUALITY_VALUE) {
			this.quality++;
		}
	}
	
	
}
