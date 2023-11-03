package br.com.ibm;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "Futeboloy", urlPatterns = {"/futebol"})
public class Futeboloy extends HttpServlet {
    abstract class Futebol {
        private String nome;

        public Futebol(String nome) {
            this.nome = nome;
        }

        public abstract void fazerGol();

        public String getNome() {
            return nome;
        }
    }

    class Corinthians extends Futebol {
        public Corinthians(String nome) {
            super(nome);
        }

        @Override
        public void fazerGol() {
            System.out.println(getNome() + " 10 gols ");
        }
    }

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
            List<Futebol> partidas = new ArrayList<>();
            Corinthians corinthians = new Corinthians("Yuri Alberto");
            partidas.add(corinthians);

            request.setAttribute("nome", corinthians.getNome());
            request.setAttribute("quantidadeGols", 10);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/futebol.jsp");
            dispatcher.forward(request, response);
        }
}