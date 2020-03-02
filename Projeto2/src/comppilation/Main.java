package comppilation;

import Util.Util;
import entities.Ordem;
import entities.Product;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        Ordem o = new Ordem("Pelotas-Brasil");


        Product p = new Product("TV", 900.00);// construtor do main

        JOptionPane.showMessageDialog(null, "Dê entrada com os dados do produto: ");
        p.setName(Util.lerTexto("Nome: "));
        p.setPrice(Util.lerDouble("Preço: "));

        p.setName("TV");
        p.setPrice(1200.00);

        System.out.println("----------------------------------------------------------");
        System.out.println("|ATUALIZAÇÃO DO NOME DO PRODUTO: " + p.getName());
        System.out.println("|PREÇO ATUALIZADO: "+p.getPrice());
        System.out.println("|DADOS DO PRODUTO: " + p);
        System.out.println("----------------------------------------------------------");
        
        int quantity = 0;
        p.addProducts(Util.lerInt(
                "Digite o número de produtos adicionados: " + quantity));

        System.out.println("\n--------------------Atualização do estoque/entrada--------------------");
        System.out.println(p.toString());
        p.addProducts(quantity);
        System.out.println("---------------------------------------------------------------------");

        p.removeProducts(Util.lerInt(
                "Digite o número de produtos vendidos: " + quantity));
        System.out.println("\n------------------Atualização do estoque/pós-venda-----------------");
        System.out.println("Atualização final: " + p.toString());
        p.removeProducts(quantity);
        System.out.println("--------------------------------------------------------------------");
        System.out.print(o.toString());

    }
}
