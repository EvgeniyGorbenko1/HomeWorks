package Project.Logic;

import Project.Models.Transfer;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ServiceTransfer {
    private static final String REPORT = "C:\\Users\\79815\\IdeaProjects\\HomeWorks\\src\\Project\\report.txt";

    public void saveTransfer(Transfer transfer) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(REPORT, true))) {
            pw.println(transfer.toString());
        } catch (IOException e) {
            System.out.println("Ошибка записи");
        }
    }

    public void printAll() {
        try (BufferedReader reader = new BufferedReader(new FileReader(REPORT))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Файл отчета не существует или пуст");
        }
    }

    public static void toArchive(File file) {
        File fileArch = new File("C:\\Users\\79815\\IdeaProjects\\HomeWorks\\src\\Project\\Archive");
        if (!fileArch.exists()) {
            fileArch.mkdir();
        }
        File end = new File(fileArch, file.getName());
        try {
            Files.move(file.toPath(), end.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println("Ошибка перемещения файла в архив: " + e.getMessage());
        }
    }

    public static List<File> getInputFiles() {
        File inputDir = new File("C:\\Users\\79815\\IdeaProjects\\HomeWorks\\src\\Project\\Input");
        if (!inputDir.exists()) {
            inputDir.mkdir();
            return Collections.emptyList();
        }

        File[] files = inputDir.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt") && !name.equalsIgnoreCase("accounts.txt"));
        return files != null ? Arrays.asList(files) : Collections.emptyList();
    }
}


