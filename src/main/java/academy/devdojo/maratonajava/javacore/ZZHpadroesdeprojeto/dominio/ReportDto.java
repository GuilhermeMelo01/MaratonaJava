package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

public class ReportDto {
    private String AircraftName;
    private Country country;
    private Currency currency;
    private String namePerson;


    public static final class ReportDtoBuilder {
        private String AircraftName;
        private Country country;
        private Currency currency;
        private String namePerson;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder builderZ() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder AircraftName(String AircraftName) {
            this.AircraftName = AircraftName;
            return this;
        }

        public ReportDtoBuilder country(Country country) {
            this.country = country;
            return this;
        }

        public ReportDtoBuilder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public ReportDtoBuilder namePerson(String namePerson) {
            this.namePerson = namePerson;
            return this;
        }

        public ReportDto build() {
            ReportDto reportDto = new ReportDto();
            reportDto.country = this.country;
            reportDto.AircraftName = this.AircraftName;
            reportDto.currency = this.currency;
            reportDto.namePerson = this.namePerson;
            return reportDto;
        }


        @Override
        public String toString() {
            return "ReportDtoBuilder{" +
                    "AircraftName='" + AircraftName + '\'' +
                    ", country=" + country +
                    ", currency=" + currency +
                    ", namePerson='" + namePerson + '\'' +
                    '}';
        }
    }
}
