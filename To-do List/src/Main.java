public class Main {
    public static void main(String[] args) {
        int escolha = 0;

        taskList todo = new taskList();
        todo.setNameList("Pedro");
        todo.setNameList("Pedro3");
        todo.addElement("Casa, favor");
        todo.printList();
        todo.addElement("comprar");
        todo.printList();
        todo.removeElement(0);
        todo.printList();

    }
}
