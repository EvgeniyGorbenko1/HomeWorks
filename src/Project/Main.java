package Project;

import Project.Logic.Parser;
import Project.Logic.ServiceAccount;
import Project.Logic.ServiceTransfer;
import Project.models.Transfer;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import java.util.List;

public class Main {
        public static void main(String[] args) throws IOException {
            ServiceAccount accountService = new ServiceAccount();
           ServiceTransfer transferService = new ServiceTransfer();
            Parser fileParser = new Parser();
            Scanner scanner = new Scanner(System.in);


            while (true) {
                System.out.println("1 - Выполнение переводов");
                System.out.println("2 - Все операции:");
                System.out.print("Выберите операцию: ");

                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        processFiles(accountService, transferService, fileParser);
                        break;
                    case "2":
                        transferService.printAll();
                        break;
                }
            }
        }

        private static void processFiles(ServiceAccount accountService,
                                         ServiceTransfer transactionService,
                                         Parser fileParser) throws IOException {
            List<File> files = ServiceTransfer.getInputFiles();

            if (files.isEmpty()) {
                System.out.println("В каталоге input нет файлов для обработки");
                return;
            }

            System.out.println("Найдено файлов: " + files.size());

            for (File file : files) {
                System.out.println("Обработка файла: " + file.getName());
                Transfer transaction = fileParser.parseFile(file, accountService);
                transactionService.saveTransfer(transaction);
                ServiceTransfer.toArchive(file);
                System.out.println("Результат: " + transaction.toString());
            }

            System.out.println("Обработка завершена");
        }

    }

