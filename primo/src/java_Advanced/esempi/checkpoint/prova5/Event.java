package java_Advanced.esempi.checkpoint.prova5;

import java.time.OffsetDateTime;

public interface Event {

    public String getNome();

    public OffsetDateTime getDataInizio();

    public OffsetDateTime getDataFine();

}