import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuestTest {

    @Test
    void viewProducts() {
        Admin ad=new Admin();
        ad.addProducts("Corolla","Vehicle","Car",2,100000);
        ad.addProducts("Corolla","Vehicle","Car",4,100000);
        ad.addProducts("Corolla","Vehicle","Car",5,100000);
        Guest guest=new Guest();
        assertEquals(3,guest.viewProducts().size());
    }

    @Test
    void getRegistered() {
        Guest guest=new Guest();
       assertEquals(true,guest.getRegistered("Ridwanur Rahman","Chattogram","01812279774",3));

    }
}
