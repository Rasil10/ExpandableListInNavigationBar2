package helpinghand.expandablelistinnavigationbar;

public class SingleItemModel {
    private String product1;
    private String product2;
    private  int image_url;

    public SingleItemModel(String product1, String product2, int image_url) {
        this.product1 = product1;
        this.product2 = product2;
        this.image_url = image_url;
    }

    public String getProduct1() {
        return product1;
    }

    public int getImage_url() {
        return image_url;
    }

    public void setImage_url(int image_url) {
        this.image_url = image_url;
    }

    public void setProduct1(String product1) {
        this.product1 = product1;
    }

    public String getProduct2() {
        return product2;
    }

    public void setProduct2(String product2) {
        this.product2 = product2;
    }

    public SingleItemModel(String product1, String product2) {
        this.product1=product1;
        this.product2=product2;
    }

}
