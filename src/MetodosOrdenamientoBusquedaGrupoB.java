import models.Carro;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusquedaGrupoB {

    // Selection sort by year Asendentemente
    public void sortBYearWithBubbleAvnAsendente(Carro[] carros) {
        for (int i = 0; i < carros.length; i++) {
            for (int j = 0; j < carros.length-1-i; j++) {
                if(carros[j].getYear() > carros[j+1].getYear()){
                    Carro aux = carros[j];
                    carros[j] = carros[j+1];
                    carros[j+1] = carros[j];
                    carros[j + 1] = aux;
                }
            }
        }
    }



    // Selection sort by year Desendentemente
    public void sortBYearWithBubbleAvnDesendente(Carro[] carros) {
        for (int i = 0; i < carros.length; i++) {
            for (int j = 0; j < carros.length-1-i; j++) {
                if(carros[j].getYear() > carros[j+1].getYear()){
                    Carro aux = carros[j];
                    carros[j] = carros[j+1];
                    carros[j+1] = carros[j];
                    carros[j + 1] = aux;
                }
            }
        }
    }    

    // Binary search by year
    public int searchBinaryByYear(Carro[] carros, int year) {
        int inicio = 0;
            int fin = carros.length - 1;
        
            while (inicio <= fin) {
                int medio = inicio + (inicio + fin) / 2;
        
                if (carros[medio].getYear() == year) {
                    return medio;  // year encontrado
                } else if (carros[medio].getYear() < year) {
                    inicio = medio + 1;
                } else {
                    fin = medio - 1;
                }
            }
          
        return -1; // Placeholder return value
    }

    // Metodo que imprime el listado de personas
    public void showCar(Carro[] carros) {
        for(Carro carro : carros){
            System.out.println("Carro años " + carro);

        }
    }
}