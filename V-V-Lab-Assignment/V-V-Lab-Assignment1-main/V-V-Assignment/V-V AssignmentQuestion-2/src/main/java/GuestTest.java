import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuestTest {

    @Test
    void viewProducts() {
        Admin ad=new Admin();
        ad.addProducts("Hero Honda","Vehicle","Bike",2,250000);
        ad.addProducts("Hero Honda","Vehicle","Bike",4,250000);
        ad.addProducts("Hero Honda","Vehicle","Bike",5,250000);
        Guest guest=new Guest();
        assertEquals(3,guest.viewProducts().size());
    }

    @Test
    void getRegistered() {
        Guest guest=new Guest();
       assertEquals(true,guest.getRegistered("Ridwanur Rahman","Chattogram","01812279774",3));

    }
}