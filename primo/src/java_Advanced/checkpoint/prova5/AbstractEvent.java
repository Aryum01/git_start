package java_Advanced.checkpoint.prova5;

import java.time.OffsetDateTime;

public class AbstractEvent implements Event {

    private String name;
    private OffsetDateTime dataInizio;
    private OffsetDateTime dataFine;

    public AbstractEvent(String name, OffsetDateTime dataInizio, OffsetDateTime dataFine) {
        this.name = name;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
    }

    @Override
    public String getNome() {
        return name;
    }

    @Override
    public OffsetDateTime getDataInizio() {
        return dataInizio;
    }

    @Override
    public OffsetDateTime getDataFine() {
        return dataFine;
    }

}
