package java_Advanced.checkpoint.prova1;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Task> tasks = new ArrayList<>();

    public void addTasks(Task task) {
        tasks.add(task);
    }

    public void removeTasks(Task task) {
        tasks.remove(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void markCompleted(Task task) {
        task.setCompleted(true);
    }

    public List<Task> searchTasks(String descriptionToSearch) {
        List<Task> resultList = new ArrayList<>();
        for (Task task : tasks) {
            if (descriptionToSearch == null && task.getDescription() == null
                    || (descriptionToSearch != null && descriptionToSearch.equals(task.getDescription()))) {
                resultList.add(task);
            }
        }
        return resultList;
    }

    public void printList() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public List<Task> getTaskExpirateon() {
        List<Task> formattedTasks = new ArrayList<>();
        for (Task task : tasks) {
            OffsetDateTime expirationDateTime = task.getExpiration();
            long diffInDays = OffsetDateTime.now().until(expirationDateTime, ChronoUnit.DAYS);
            if (diffInDays >= 0 && diffInDays <= 2) {
                formattedTasks.add(task);
            }
        }
        return formattedTasks;
    }
}

/*
 * task.getExpiration(): Ottiene la data di scadenza del compito corrente dalla
 * classe Task.
 * 
 * currentDate.until(expirationDate, java.time.temporal.ChronoUnit.DAYS):
 * Calcola la differenza in giorni tra la data corrente (currentDate) e la data
 * di scadenza del compito (expirationDate). Questo utilizza il metodo until
 * della classe OffsetDateTime per calcolare la differenza tra due istanze di
 * OffsetDateTime in unità specificate, in questo caso, in giorni.
 * 
 * Il risultato di questa operazione (diffInDays) è un valore numerico intero
 * che rappresenta la differenza in giorni tra la data di scadenza del compito e
 * la data corrente. Ad esempio, se il risultato è 0, significa che il compito
 * scade oggi; se è 1, il compito scade domani, e così via.
 * 
 * Quindi, la condizione successiva verifica se la differenza in giorni è
 * compresa tra 0 e 2 (inclusi), indicando che il compito scadrà nei prossimi 2
 * giorni:
 * 
 * java
 * Copy code
 * if (diffInDays >= 0 && diffInDays <= 2) {
 * // ... Resto del codice ...
 * }
 * Se questa condizione è soddisfatta, il compito viene considerato in scadenza
 * nei prossimi 2 giorni, e la sua rappresentazione formattata viene aggiunta
 * alla lista delle stringhe formattate.
 * }
 */
