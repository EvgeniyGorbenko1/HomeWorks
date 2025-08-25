package Project.Logic;

import Project.Exceptions.InvalidAccountException;
import Project.Exceptions.InvalidAmountException;
import Project.models.Transfer;

import java.io.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private final Pattern accNum = Pattern.compile("\\d{5}-\\d{5}");
    private final Pattern amountNum = Pattern.compile("\\d+");
    private final String accounts = "C:\\Users\\Кристина\\IdeaProjects\\HomeWork6\\src\\Project\\accounts.txt";

    public Transfer parseFile(File file, ServiceAccount serviceAccount) throws IOException {
        String fileName = file.getName();
        String fromAccNum = null;
        String toAccNum = null;
        Integer amount = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (fromAccNum == null) {
                    fromAccNum = findAccount(line, "отпр");
                }
                if (toAccNum == null) {
                    toAccNum = findAccount(line, "получа");
                }
                if (amount == null) {
                    amount = findAmount(line);
                }
                if (fromAccNum != null && toAccNum != null && amount != null) {
                    break;
                }
            }
            validateData(fromAccNum, toAccNum, amount);
            serviceAccount.transferAmount(fromAccNum, toAccNum, amount);
            return new Transfer(LocalDateTime.now(), fileName, fromAccNum, toAccNum, amount, "Успешно обработан");
        } catch (InvalidAccountException | InvalidAmountException e) {
            return new Transfer(LocalDateTime.now(), fileName, fromAccNum != null ? fromAccNum : "неизвестен",
                    toAccNum != null ? toAccNum : "неизвестен", amount != null ? amount : 0,
                    "ошибка во время обработки");
        }
    }

    private String findAccount(String line, String keyword) {
        if (line.toLowerCase().contains(keyword)) {
            Matcher matcher = accNum.matcher(line);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }

    private Integer findAmount(String line) {
        if (line.toLowerCase().contains("сум")) {
            Matcher matcher = amountNum.matcher(line);
            if (matcher.find()) {
                return Integer.parseInt(matcher.group());
            }
        }
        return null;
    }

    private void validateData(String fromAccount, String toAccount, Integer amount)
            throws InvalidAccountException, InvalidAmountException {
        if (fromAccount == null) throw new InvalidAccountException("неверный номер счета отправителя");
        if (toAccount == null) throw new InvalidAccountException("неверный номер счета получателя");
        if (amount == null) throw new InvalidAmountException("неверная сумма перевода");
        if (amount <= 0) throw new InvalidAmountException("отрицательная сумма перевода");
    }
}


