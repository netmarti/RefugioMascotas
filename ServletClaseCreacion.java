package controller;

import beans.Categoria;
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

/**
 * En esta servlet guardardaremos los objetos de tipo Categoría en una lista de
 * categorias.
 *
 * El servlet recibe la petición desde un formulario html enviado desde una .jsp
 *
 */
public class ServletClaseCreacion extends HttpServlet {

    /*
     * propiedades de la clase ServletClaseCreacion, 
     *lista de categoriasList para guardar la categoriasList 
     *y las mascotas creandas en la servlet
     */
    private ArrayList<Categoria> categoriasList;

    @Override
    public void init() throws ServletException {
        super.init();
        categoriasList = new ArrayList<Categoria>();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        //guardo los parametros enviados por el formulario
        String tipoMascota = request.getParameter("mascota");
        String tipo = request.getParameter("tipo");
        String descripcion = request.getParameter("descripcion");
        String chip = request.getParameter("chip");
        String nombre = request.getParameter("nombre");
        String estadoFisico = request.getParameter("estadoFisico");
        String estadoMental = request.getParameter("estadoMental");

        //controlo que los datos esten bien definidos
        if ((tipo != null && !tipo.equals("")) && (descripcion != null && !descripcion.equals(""))
                && (chip != null && !chip.equals("")) && (nombre != null && !nombre.equals(""))
                && (estadoFisico != null && !estadoFisico.equals(""))
                && (estadoMental != null && !estadoMental.equals(""))) {

            //si estan bien definidos, los processo
            //hago el parsing de un string a un int (el parametro edad tiene que ser un Integer)
            
            

            //creo una instancia/objeto de tipo categoria con los parametros enviado por el formulario
            Categoria categoria = new Categoria(tipo, descripcion);
            //creo una instancia/objeto de tipo coche con los parametro enviados por el formulario

            Ave ave = null;
            Mamifero mamifero = null;
            Reptil reptil = null;
            Pez pez = null;
            
            if (tipoMascota.equals("Ave")) {
                ave = new Ave(tipo, chip, nombre, estadoFisico, estadoMental);
            }
            if (tipoMascota.equals("Mamifero")) {
                mamifero = new Mamifero(chip, nombre, estadoFisico, estadoMental);
            }
            if (tipoMascota.equals("Reptil")) {
                reptil = new Reptil(chip, nombre, estadoFisico, estadoMental);
            }
            if (tipoMascota.equals("Pez")) {
                pez = new Pez(chip, nombre, estadoFisico, estadoMental);
            }

            //ahora, lo que no quiero hacer es añadir una categoria a la lista si ésta
            //ya existe en la lista
            //para poder hacer esto, busco la categoria (por tipo) en la lista categoriasList
            int index = -1;

            //llamo una funcion que busca una categoria por tipo en la lista
            index = getCategoria(tipo);

            //si la categoria no existe
            if (index == -1) {
                //controlo que tipo de ave quiero añadir
                if (tipoMascota.equals("Ave")) {
                    //añado el ave a la categoria y añado la categoria a la lista
                    categoria.addMascota(ave);

                }
                if (tipoMascota.equals("Mamifero")) {
                    //añado el mamífero a la categoria y añado la categoria a la lista
                    categoria.addMascota(mamifero);

                }
                
                if (tipoMascota.equals("Reptil")) {
                    //añado el reptil a la categoria y añado la categoria a la lista
                    categoria.addMascota(reptil);

                }
                if (tipoMascota.equals("Pez")) {
                    //añado el pez a la categoria y añado la categoria a la lista
                    categoria.addMascota(pez);

                }
                
                categoriasList.add(categoria);

            } //si la categoria existe
            else {
                //guardo la categoria existente en una variable categoriaTmp
                Categoria categoriaTmp = categoriasList.get(index);
                //controlo que tipo de vehiculo queiro añadir

                if (tipoMascota.equals("Ave")) {
                    //añado el ave a esta categoria
                    categoriaTmp.addMascota(ave);
                }
                if (tipoMascota.equals("Mamifero")) {
                    //añado el mamífero a esta categoria
                    categoriaTmp.addMascota(mamifero);
                }
                if (tipoMascota.equals("Reptil")) {
                    //añado el reptil a esta categoria
                    categoriaTmp.addMascota(reptil);
                }
                if (tipoMascota.equals("Pez")) {
                    //añado el pez a esta categoria
                    categoriaTmp.addMascota(pez);
                }
                //vuelvo a guardar la categoria con la mascota añadida en la lista categoriasList
                //categorias.set(index, categoriaTmp) es un metodo que guarda el objeto categoriaTmp en la posicion
                //index de la lista categoria
                categoriasList.set(index, categoriaTmp);
            }

            try {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Mascotas en el refugio</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Animales</h1>");
                out.println("<h2>Listado categoria y mascota</h2>");

                //imprimo el contenido de la lista categoriasList en el HTML
                for (int i = 0; i < categoriasList.size(); i++) {
                    Categoria categoriaTmp = categoriasList.get(i);
                    out.println(categoriaTmp.toString() + "<br>");
                }

                out.println("<h2><a href=\"index.jsp\">Volver</a></h2>");
                out.println("</body>");
                out.println("</html>");
            } finally {
                out.close();
            }
            //fin if, sino vuelvo a la pagina index.jsp    
        } else {
            //instrución para volver a una index.jsp
            request.getRequestDispatcher("/index.jsp").forward(request, response);
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
        return "Short description";
    }// </editor-fold>

    /*
     * metodo que busca una categoria por tipo
     * devuelve -1 si la categoria no existe, 
     la posicion de la categoria si existe 
     */
    private int getCategoria(String tipo) {

        int index = -1;

        for (int i = 0; i < categoriasList.size(); i++) {
            if (categoriasList.get(i).getTipo().equals(tipo)) {
                return i;
            }
        }

        return index;

    }

}//esta llave cierra la clase ServletClaseCreacion
