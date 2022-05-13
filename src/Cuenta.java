
//Clase Cuenta que contiene una variable de instancia llamada nombre
// y metodos para establecer y obtener su valor

public class Cuenta
    {
        private String nombre; //Variable de instancia

        //Metodo para establecer el nombre en el objeto
        public void establecerNombre(String nombre)
        {
            this.nombre = nombre; //Almacenar variable
        }

        //Metodo para obtener el nombre del objeto
        public String obtenerNombre()
        {
            return nombre; //Devuelve el valor de nombre a quien lo invoco
        }
    } // Fin de la clase Cuenta

