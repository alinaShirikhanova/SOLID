import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LogData {
    private List<String> logs = new ArrayList<>();

    public void addLog(String log) {
        logs.add(LocalDateTime.now() + " - " + log);
    }

    public void removeLog(int index) {
        logs.remove(index);
    }


    public String getLog(int index) {
        return logs.get(index);
    }

    public List<String> getLogs() {
        return Collections.unmodifiableList(logs);
    }

    public void save(Path path) {
        try {
            Files.writeString(path, String.valueOf(logs), StandardCharsets.UTF_8);
        } catch (IOException ex) {
            System.out.println("Не удалось записать данные в файл");
        }
    }


    public String toString() {
        return String.valueOf(logs);
    }
}

