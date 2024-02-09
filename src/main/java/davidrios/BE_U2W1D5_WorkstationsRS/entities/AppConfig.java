package davidrios.BE_U2W1D5_WorkstationsRS.entities;

import com.github.javafaker.App;
import com.github.javafaker.Faker;
import davidrios.BE_U2W1D5_WorkstationsRS.enums.Cities;
import davidrios.BE_U2W1D5_WorkstationsRS.enums.WorkstationType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
public class AppConfig {

    private final Faker faker = new Faker();

    @Bean("romeCenter")
    public CorporateCenter getRomeCorporateCenter() {
        return new CorporateCenter(faker.company().name(), faker.address().streetAddress(), Cities.ROME);
    }

    @Bean("milanCenter")
    public CorporateCenter getMilanCorporateCenter() {
        return new CorporateCenter(faker.company().name(), faker.address().streetAddress(), Cities.MILAN);
    }

    @Bean("barcelonaCenter")
    public CorporateCenter getBarcelonaCorporateCenter() {
        return new CorporateCenter(faker.company().name(), faker.address().streetAddress(), Cities.BARCELONA);
    }

    @Bean("berlinCenter")
    public CorporateCenter getBerlinCorporateCenter() {
        return new CorporateCenter(faker.company().name(), faker.address().streetAddress(), Cities.BERLIN);
    }

    @Bean("osloCenter")
    public CorporateCenter getOsloCorporateCenter() {
        return new CorporateCenter(faker.company().name(), faker.address().streetAddress(), Cities.OSLO);
    }

    @Bean("stockholmCenter")
    public CorporateCenter getStockholmCorporateCenter() {
        return new CorporateCenter(faker.company().name(), faker.address().streetAddress(), Cities.STOCKHOLM);
    }

    @Bean("romeWorkstation")
    public Workstation getRomeWorkstation(@Qualifier("romeCenter") CorporateCenter cc) {
        return new Workstation(faker.lorem().characters(10), WorkstationType.OPENSPACE, 15, cc);
    }

    @Bean("milanWorkstation")
    public Workstation getMilanWorkstation(@Qualifier("milanCenter") CorporateCenter cc) {
        return new Workstation(faker.lorem().characters(10), WorkstationType.PRIVATE, 1, cc);
    }

    @Bean("barcelonaWorkstation")
    public Workstation getBarcelonaWorkstation(@Qualifier("barcelonaCenter") CorporateCenter cc) {
        return new Workstation(faker.lorem().characters(10), WorkstationType.MEETINGROOM, 6, cc);
    }

    @Bean("berlinWorkstation")
    public Workstation getBerlinWorkstation(@Qualifier("berlinCenter") CorporateCenter cc) {
        return new Workstation(faker.lorem().characters(10), WorkstationType.MEETINGROOM, 8, cc);
    }

    @Bean("osloWorkstation")
    public Workstation getOsloWorkstation(@Qualifier("osloCenter") CorporateCenter cc) {
        return new Workstation(faker.lorem().characters(10), WorkstationType.PRIVATE, 1, cc);
    }

    @Bean("stockholmWorkstation")
    public Workstation getStockholmWorkstation(@Qualifier("stockholmCenter") CorporateCenter cc) {
        return new Workstation(faker.lorem().characters(10), WorkstationType.OPENSPACE, 12, cc);
    }

}
