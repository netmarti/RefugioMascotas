<%--PRACTICA 32 REFUGIO de MASCOTAS--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>JSP Refugio de Mascotas</title>
    </head>
    <body style="background: peru">
        <div style="text-align: center;margin-left: 40%; margin-top: 10%;background: moccasin;width: 300px">
            <fieldset style="width: 270px">
        <h1 style="text-align: center"> ^_^ Anim a lots!</h1>
        <form method="post" action="ServletClaseCreacion">
            
            <p>Tipo de 
                <label for="tipo">Mascota:</label>
                <input type="text" name="tipo">
                <br>

                <label for="descripcion">Descripción:</label>
                <input type="text" name="descripcion">
                <br>
            </p>

            <p>Tipo de mascota:
                <select name="mascota">
                    <option value="Ave">Ave</option>
                    <option value="Mamifero">Mamífero</option>
                    <option value="Reptil">Reptil</option>
                    <option value="Pez">Pez</option>
                </select>   
                <br><br>
                <label for="chip">Chip: </label>
                <input type="text" name="chip">
                <br>

                <label for="nombre">Nombre: </label>
                <input type="text" name="nombre">
                <br>
                
                 <label for="estadoFisico">Estado Físico: </label>
                <input type="text" name="estadoFisico">
                <br>
                
                 <label for="estadoMental">Estado Mental: </label>
                <input type="text" name="estadoMental">
                <br>
            </p>
            
            <input type="reset" value="Borrar">
            <input type="submit" value="Enviar">
           
        </form>
        </fieldset>
         </div>
    </body>
</html>
