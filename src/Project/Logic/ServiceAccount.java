package Project.Logic;

import Project.Exceptions.InvalidAmountException;
import Project.models.Transfer;
import Project.Exceptions.InvalidAccountException;
import Project.models.Account;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ServiceAccount {
    private final Map<String, Account> accountMap = new HashMap<>();
    private final String fileAccounts = "C:\\Users\\Кристина\\IdeaProjects\\HomeWork6\\src\\Project\\accounts.txt";

    public ServiceAccount() {
        loadAccount();
    }

    public void transferAmount(String fromAccNum, String toAccNum, int amount) throws InvalidAccountException, InvalidAmountException {
        Account fromAcc = accountMap.get(fromAccNum);
        Account toAcc = accountMap.get(toAccNum);

        if (fromAcc == null)
            throw new InvalidAccountException("Неверный номер");
        if (toAcc == null)
            throw new InvalidAccountException("Неверный номер");
        if (fromAcc.getAmount() < amount)
            throw new InvalidAmountException("Недостаточно средств");
        fromAcc.setAmount(fromAcc.getAmount() - amount);
        toAcc.setAmount(toAcc.getAmount() + amount);
        saveAccount();
    }

    private void loadAccount() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileAccounts))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.trim().split("\\|");
                if (parts.length == 2) {
                    accountMap.put(parts[0], new Account(parts[0], Integer.parseInt(parts[1])));
                }
            }
        } catch (IOException e) {
            System.out.println("Не нашел нужный файл!");
        }
    }

    private void saveAccount() throws InvalidAccountException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileAccounts))) {
            for (Account account : accountMap.values()) {
                writer.write(account.toString());
            }
        } catch (Exception e) {
            throw new InvalidAccountException(e.getMessage());
        }
    }
}
