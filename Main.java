class Main {
    public static void main(String[] args) {
		Shopee shopee = new Shopee();
		Bukalapak bukalapak = new Bukalapak();
		Tokopedia tokopedia = new Tokopedia();
		
		SearchButton button = new SearchButton ();
		ResultPanel item = new ResultPanel ();
		button.connectTo (item);
		item.connectTo (shopee);

		ResultPanel item2 = new ResultPanel ();
		item2.connectTo (bukalapak);

		ResultPanel item3 = new ResultPanel ();
		item3.connectTo (tokopedia);
	}
}
