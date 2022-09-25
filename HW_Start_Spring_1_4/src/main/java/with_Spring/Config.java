package with_Spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import with_Spring.models.AddressUser;
import with_Spring.models.ChildUser;
import with_Spring.models.WifeUser;
import with_Spring.models.impl.*;

@Configuration
public class Config {
    @Bean
    @Qualifier("sergey")
    public AddressUser addressUser() {
        return new AddressUsermpl(1, "650012", "Ukraine", "Odessa", "Arnautskaya str.", "25B", "125g");
    }

    @Bean
    @Qualifier("sergey")
    public WifeUser wifeUser() {
        return new WifeImpl(1, "Olga");
    }

    @Bean
    @Qualifier("sergey")
    public ChildUser childUser() {
        return new ChildImpl(1, "Kristina");
    }

    @Bean("sergey")
    public UserImpl user(@Qualifier("sergey") AddressUser addressUser, @Qualifier("sergey") WifeUser wifeUser, @Qualifier("sergey") ChildUser childUser) {
        return  new UserImpl(2, "Sergey", addressUser, wifeUser, childUser);
    }

    @Bean
    @Qualifier("oleg")
    public AddressUser addressUser1() {
        return new AddressUsermpl(2, "21001", "Ukraine", "Vinnitsa", "Timoshenko str.", "45", "17a");
    }

    @Bean
    @Qualifier("oleg")
    public WifeUser wifeUser1() {
        return new WifeImpl(2, "Nataliya");
    }

    @Bean
    @Qualifier("oleg")
    public ChildUser childUser1() {
        return new ChildImpl(2, "Oksana");
    }

    @Bean("oleg")
    public UserImpl user2(@Qualifier("oleg") AddressUser addressUser, @Qualifier("oleg") WifeUser wifeUser, @Qualifier("oleg") ChildUser childUser) {
        return new UserImpl(1, "Oleg", addressUser, wifeUser, childUser);
    }

}
