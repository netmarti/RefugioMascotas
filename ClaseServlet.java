package controller;


import beans.Categoria;
import beans.Mamifero;
import beans.Ave;
import beans.Mamifero;
import beans.Reptil;
import beans.Pez;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ClaseServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        Categoria categoria1 = new Categoria("ave", "unas cantan y otras no");
        Categoria categoria2 = new Categoria("mamifero", "de granja o exótico");
        Categoria categoria3 = new Categoria("reptil", "unos son venenosos y otros no");
        Categoria categoria4 = new Categoria("pez", "de agua dulce o salada");

        //Un ave tiene: chip, nombre, edad, estadoFisico, estadoMental, tipo de ave (cantora o no)
        Ave ave1 = new Ave("cantora","AX1234", "Piolín", "bueno", "bueno");
        Ave ave2 = new Ave("no cantora","AX567", "Grajo", "delicado", "bueno");
        categoria1.addAve(ave1);
        categoria1.addAve(ave2);
        
        //Un mamífero tiene: chip, nombre, edad, estadoFisico, estadoMental, tipo de mamifero (granja o exótico)
        Mamifero mamifero1 = new Mamifero("MX1234", "Silvestre", "buena salud", "juguetón");
        Mamifero mamifero2 = new Mamifero("MX5678", "Paca", "buena salud", "buena leche");
        categoria2.addMamifero(mamifero1);
        categoria2.addMamifero(mamifero2);
        
        //Un pez tiene: chip, nombre, edad, estadoFisico, estadoMental, tipo de pez (agua dulce o salada)
        Pez pez1 = new Pez("PX1234", "Wanda", "buena salud", "buen ánimo");
        Pez pez2 = new Pez("PX5678", "Nemo", "salud delicada", "buen ánimo");
        categoria3.addPez(pez1);
        categoria3.addPez(pez2);
        
        //Un reptil tiene: chip, nombre, edad, estadoFisico, estadoMental, tipo de pez (venenoso o no)
        Reptil reptil1 = new Reptil("RX1234", "Kaa", "mudando", "activa");
        Reptil reptil2 = new Reptil("RX5678", "Gustavo", "resfriado", "buena leche");
        categoria4.addReptil(reptil1);
        categoria4.addReptil(reptil2);
        
        ArrayList<Categoria> categorias = new ArrayList<Categoria>();
        categorias.add(categoria1);
        categorias.add(categoria2);
        categorias.add(categoria3);
        categorias.add(categoria4);
        

       
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Practica Refugio de Mascotas</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<table border=1>");
            out.println("<h1>Mascotas en el refugio</h1>");
            for (int i=0;i<categorias.size();i++) {
                Categoria categoria = categorias.get(i);
                out.println("<p>"+categoria.toString()+"</p>");
            }
            
            out.println("</body>");
            
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Breve descripción";
    }// </editor-fold>

}
