import java.util.ArrayList;

public class Pedido {

    // Classe interna (ItemPedido)
    class ItemPedido {
        private String nomeProduto;
        private int quantidade;
        private double precoUnitario;

        // Construtor
        public ItemPedido(String nomeProduto, int quantidade, double precoUnitario) {
            this.nomeProduto = nomeProduto;
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
        }

        // Método para calcular o subtotal
        public double calcularSubtotal() {
            return quantidade * precoUnitario;
        }

        // Método para exibir os detalhes do item
        public void mostrarItem() {
            System.out.println(nomeProduto + " (x" + quantidade + ") - R$ " + precoUnitario + " cada");
        }
    }

    // Lista de itens do pedido
    private ArrayList<ItemPedido> itens;

    // Construtor
    public Pedido() {
        itens = new ArrayList<>();
    }

    // Método para adicionar um item ao pedido
    public void adicionarItem(String nomeProduto, int quantidade, double precoUnitario) {
        ItemPedido novoItem = new ItemPedido(nomeProduto, quantidade, precoUnitario);
        itens.add(novoItem);
    }

    // Método para calcular o valor total do pedido
    public double valorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    // Método para exibir todos os itens do pedido
    public void mostrarPedido() {
        System.out.println("=== Itens do Pedido ===");
        for (ItemPedido item : itens) {
            item.mostrarItem();
        }
        System.out.println("-----------------------");
        System.out.println("Valor total: R$ " + valorTotal());
    }

    // Método principal (main)
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        // Adiciona itens ao pedido
        pedido.adicionarItem("Teclado", 2, 150.0);
        pedido.adicionarItem("Mouse", 1, 80.0);

        // Mostra o pedido e o total
        pedido.mostrarPedido();
    }
}
