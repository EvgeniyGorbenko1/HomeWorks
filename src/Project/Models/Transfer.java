package Project.Models;

import java.time.LocalDateTime;

public class Transfer {
    private String toAccNum;
    private String fromAccNum;
    private int amount;
    private LocalDateTime time;
    private String message;
    private String fileName;

    public Transfer(LocalDateTime time, String fileName, String fromAccNum, String toAccNum, int amount, String message) {
        this.message = message;
        this.toAccNum = toAccNum;
        this.fromAccNum = fromAccNum;
        this.amount = amount;
        this.time = time;
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return time + " | " + fileName + " | Перевод с " + fromAccNum + " на " + toAccNum + " " + amount + " | " + message + ".";
    }
}
