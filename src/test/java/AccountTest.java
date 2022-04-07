import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

public class AccountTest {

    private Account account;


    @BeforeEach
    private void setup() {
        account = new Account(10000);
    }

    @Test
    public void testAccount(){
        setup();
    }

    @Test
    public void testGetBalance() throws Exception {
        assertThat(account.getBalance()).isEqualTo(10000);

        account = new Account(1000);
        assertThat(account.getBalance()).isEqualTo(1000);

        account = new Account(0);
        assertThat(account.getBalance()).isEqualTo(0);
    }

    @Test
    public void testDeposit() throws Exception {
        account.deposit(1000);
        assertThat(account.getBalance()).isEqualTo(11000);
    }

    @Test
    public void testWithdraw() throws Exception {
        account.withdraw(1000);
        assertThat(account.getBalance()).isEqualTo(9000);
    }
}
