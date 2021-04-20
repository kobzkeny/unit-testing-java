package pl.devfoundry.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
     void newAccountShouldNotBeActiveAfterCreation(){
        //given
        //when
        Account newAccount = new Account();
        //then
        assertFalse(newAccount.isActive());
    }
    @Test
    void newAccountShouldBeActiveAfterActivation(){
        //given
        Account newAccount = new Account();
        //when
        newAccount.activate();
        //then
        assertTrue(newAccount.isActive());


    }

    @Test
    void  newlyCreatedAccountShouldNotHaveDefaultDeliveryAdressSet(){
    //given
        Account account = new Account();

     //when
     Adress adress = account.getDefaultDeliveryAdress();

     //then
      assertNull(adress);

    }

    @Test
    void  defaultDeliveryAdressShouldNotBeNullAfterBeingSet(){
        //given
        Adress adress = new Adress("Krakowska","65b");
        Account account = new Account();
        account.setDefaultDeliveryAdress(adress);

        //when
        Adress defaultAdress = account.getDefaultDeliveryAdress();

        //then
        assertNotNull(defaultAdress);

    }

}
