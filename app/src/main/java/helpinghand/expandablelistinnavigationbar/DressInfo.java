package helpinghand.expandablelistinnavigationbar;

/**
 * Created by Rasil10 on 2017-12-09.
 */

public class DressInfo {
    String title;
    String price;
    int image_url;

    public DressInfo(String title, String price, int image_url) {
        this.title = title;
        this.price = price;
        this.image_url = image_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImage_url() {
        return image_url;
    }

    public void setImage_url(int image_url) {
        this.image_url = image_url;
    }
}
