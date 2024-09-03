//cria uma lista, divide a lista em indices

import java.util.List;
import java.util.ArrayList;

public class taskList {
    private String nameList = "";
    private boolean isNameList = false;
    private boolean feitoList = false;
    private List<String> Task;


    // Getter para o nome da lista
    public String getNomeList() {
        return nameList;
    }

    // Setter para o nome da lista
    public void setNameList(String nameList) {
        if (!isNameList) {
            this.nameList = nameList;
            isNameList = true;
            System.out.println("Name list: " + nameList);
            Task = new ArrayList<>();
        } else {
            System.out.println("The name list has already been set and cannot be changed.");
        }
    }

    // Getter para o status da lista (feito ou não)
    public Boolean getFeitoList() {
        return feitoList;
    }

    // Setter para o status da lista
    public void setFeitoList(Boolean feitoList) {
        this.feitoList = feitoList;
    }

    // Adiciona um elemento à lista
    public void addElement(String element) {
        Task.add(element);
    }

    // Imprime o conteúdo da lista
    public void printList() {
        if (Task.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("List contents:");
            for (int i = 0; i < Task.size(); i++) {
                System.out.println(i + " = " + Task.get(i));
            }
        }
    }


    // Edita
    public void editElement(int index, String newElement) {
        if (index >= 0 && index < Task.size()) {
            Task.set(index, newElement);
            System.out.println("Element at index " + index + " has been updated to: " + newElement);
        } else {
            System.out.println("Index out of bounds");
        }
    }

    // Remove
    public void removeElement(int index) {
        if (index >= 0 && index < Task.size()) {
            String removedElement = Task.remove(index);
            System.out.println("Element '" + removedElement + "' at index " + index + " has been removed.");
        } else {
            System.out.println("Index out of bounds");
        }
    }

    // Remove um elemento da lista com base no valor
    public void removeElement(String element) {
        if (Task.remove(element)) {
            System.out.println("Element '" + element + "' has been removed.");
        } else {
            System.out.println("Element '" + element + "' not found.");
        }
    }
}
