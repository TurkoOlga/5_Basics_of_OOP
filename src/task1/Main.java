package task1;
/*
Задача 1.
Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.

 */

public class Main {
    public static void main(String[] args) {
        Directory documents = new Directory();
        documents.createFile("debit");
        documents.renameFile("debit", "credit");
        documents.addInfoToFile("credit", "kfjvhkjfcvbcmx");
        documents.printFile("credit");
        documents.deleteFile("credit");
        System.out.println(documents);
    }
}
