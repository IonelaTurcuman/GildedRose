
public class BackstagePass extends Item implements GildedRoseItems {
	
	public static final int MAX_QUALITY_VALUE = 50;
	public static final int TEN_DAYS = 10;
	public static final int FIVE_DAYS = 5;
	public static final int TEN_DAYS_UPDATE = 2;
	public static final int FIVE_DAYS_UPDATE = 3;
	
	public BackstagePass(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateSellInValue() {
		this.sellIn--;
		
	}

	@Override
	public void updateQualityValue() {
		if (this.quality < MAX_QUALITY_VALUE) {
			if (this.sellIn < FIVE_DAYS) {
				this.quality += FIVE_DAYS_UPDATE;
			} else if (this.sellIn < TEN_DAYS) {
				this.quality += TEN_DAYS_UPDATE;
			} else {
				this.quality++;
			}
		}
		if (this.quality >= MAX_QUALITY_VALUE) {
			this.quality = MAX_QUALITY_VALUE;
		}
	}

}
