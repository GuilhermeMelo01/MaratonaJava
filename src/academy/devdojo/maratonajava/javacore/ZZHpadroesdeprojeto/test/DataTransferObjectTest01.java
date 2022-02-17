package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country =   Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder
                .builder()
                .firstName("Guilherme")
                .lastName("Augusto")
                .build();

        ReportDto.ReportDtoBuilder reportDtoBuilder = ReportDto.ReportDtoBuilder.builderZ()
                .AircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .namePerson(person.getClass().getName());

        System.out.println(reportDtoBuilder);
    }
}
