package com.iphone.main;

import com.iphone.models.iPhone;

public class App {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone("iPhone 15", "Preto");

        // Teste do ReprodutorMusical
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Imagine - John Lennon");

        // Teste do AparelhoTelefonico
        meuIPhone.ligar("123-456-7890");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Teste do NavegadorInternet
        meuIPhone.exibirPagina("https://www.apple.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
