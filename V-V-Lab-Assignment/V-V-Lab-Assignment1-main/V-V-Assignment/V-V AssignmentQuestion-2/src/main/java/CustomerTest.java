import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    void testSingleProduct() {
        Admin ad=new Admin();
        ad.addProducts("Corolla","Vehicle","Car",2,100000);
        ad.addProducts("Corolla","Vehicle","Car",3,100000);
        ad.addProducts("Corolla","Vehicle","Car",4,100000);
        Customer cus=new Customer(1,"Ridwanur Rahman","Chattogram","01812279774");

        //comparing added items to how many have been added to cart progrmatically
        assertEquals(true,cus.singleProduct(2));

    }
    @Test
    void testShowCart() {
        Admin ad=new Admin();
        ad.addProducts("Corolla","Vehicle","Car",2,100000);
        ad.addProducts("Corolla","Vehicle","Car",3,100000);
        ad.addProducts("Corolla","Vehicle","Car",4,100000);
        Customer cus=new Customer(1,"Ridwanur Rahman","Chattogram","01812279774");
        cus.addToCart(2);
        cus.addToCart(3);
        cus.addToCart(4);
        //comparing added items to how many have been added to cart progrmatically
        assertEquals(3,cus.showCart());

    }

    @Test
    void addToCart() {
        Admin ad=new Admin();
        ad.addProducts("Corolla","Vehicle","Car",2,100000);
        ad.addProducts("Corolla","Vehicle","Car",3,100000);
        ad.addProducts("Corolla","Vehicle","Car",4,100000);
        Customer cus=new Customer(1,"Ridwanur Rahman","Chattogram","01812279774");
        assertEquals(true,cus.addToCart(2));

    }

    @Test
    void viewProducts() {
        Admin ad=new Admin();
        ad.addProducts("Hero Honda","Vehicle","Bike",2,250000);
        ad.addProducts("Hero Honda","Vehicle","Bike",4,250000);
        ad.addProducts("Hero Honda","Vehicle","Bike",5,250000);
        Customer cus=new Customer(1,"Ridwanur Rahman","Chattogram","01812279774");
        assertEquals(3,cus.viewProducts().size());
    }
    @Test
    void testRemoveFromCart() {
        Admin ad=new Admin();
        ad.addProducts("Hero Honda","Vehicle","Bike",2,250000);
        ad.addProducts("Hero Honda","Vehicle","Bike",4,250000);
        ad.addProducts("Hero Honda","Vehicle","Bike",5,250000);
        Customer cus=new Customer(1,"Ridwanur Rahman","Chattogram","01812279774");
        cus.addToCart(2);
        cus.addToCart(3);
        cus.addToCart(4);

        assertEquals(true,cus.deleteFromCart(2));
    }
}