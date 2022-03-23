public class ResultPanel implements Search{
    public Result olshop;

    @Override
    public void connectTo(Result olshop) {
        System.out.println("\nConnecting to Online shop data... ");
		this.olshop = olshop;
		System.out.println("--> Search result connected to channel : "+ olshop.getolshopName());
        System.out.println("--> jumlah baju Gucci : "+ olshop.getjumlahBaju());
        System.out.println("--> jumlah sepatu Gucci : "+ olshop.getjumlahsepatu());
        System.out.println("--> jumlah celana Gucci: "+ olshop.getjumlahcelana());
    }
    
}
