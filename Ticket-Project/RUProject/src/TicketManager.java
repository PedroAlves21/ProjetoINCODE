import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketManager {
    private int tikValor = 100;
    private List<Ticket> tickets = new ArrayList<>();
    private int hstPay = 0;

    // Classe interna para representar um ticket individual
    public class Ticket {
        private int number;
        private int valor;
        private boolean statusPago;

        public Ticket(int number, int valor) {
            this.number = number;
            this.valor = valor;
            this.statusPago = false;
        }

        public int getNumber() {
            return number;
        }

        public boolean isPago() {
            return statusPago;
        }

        public void pagar() {
            this.statusPago = true;
        }

        @Override
        public String toString() {
            return "Ticket Número: " + number + " | Valor: " + valor + " | Status Pago: " + statusPago;
        }
    }

    // Método para criar múltiplos tickets
    public void createMultipleTickets(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            int numeroTicket = tickets.size() + 1; // Gera um novo número de ticket
            Ticket novoTicket = new Ticket(numeroTicket, tikValor);
            tickets.add(novoTicket);
            System.out.println("Ticket criado: " + novoTicket);
        }
    }

    // Método para pagar um ticket específico
    public void payTicket(int ticketNumber) {
        for (Ticket ticket : tickets) {
            if (ticket.getNumber() == ticketNumber) {
                if (!ticket.isPago()) {
                    ticket.pagar();
                    hstPay++;
                    System.out.println("Ticket " + ticketNumber + " foi pago.");
                } else {
                    System.out.println("Ticket " + ticketNumber + " já foi pago.");
                }
                return;
            }
        }
        System.out.println("Ticket " + ticketNumber + " não encontrado.");
    }

    // Método para exibir o histórico de tickets gerados e pagos
    public void getTikHistory() {
        System.out.println("Você gerou " + tickets.size() + " tickets.");
        System.out.println("Detalhes dos tickets:");
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
        System.out.println("Você pagou " + hstPay + " tickets.");
    }

    // Método para interagir com o usuário e gerar quantos tickets ele quiser
    public void gerarTickets() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos tickets você deseja gerar?");
        int quantidade = scanner.nextInt();
        createMultipleTickets(quantidade);
    }
}
