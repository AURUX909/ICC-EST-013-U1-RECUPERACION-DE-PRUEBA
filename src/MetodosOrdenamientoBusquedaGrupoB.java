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
    public void sortBYearWithBubbleAvnAsendente(Carro[] carros) 
    {
        int tamanio = carros.length;
        for (int i = 0; i < tamanio - 1; i++) 
        {
        int minIndex = i;
        for (int j = i + 1; j < tamanio; j++) 
        {
            if (carros[j].getYear() < carros[minIndex].getYear()) 
            {
                minIndex = j;
            }
        }
        Carro aux = carros[i];
        carros[i] = carros[minIndex];
        carros[minIndex] = aux;
        }
    }

    // Selection sort by year Desendentemente
    public void sortBYearWithBubbleAvnDesendente(Carro[] carros) 
    {
        int tamanio = carros.length;
        for (int i = 0; i < tamanio - 1; i++) 
    {
        int maxIndex = i;
        for (int j = i + 1; j < tamanio; j++) 
        {
            if (carros[j].getYear() > carros[maxIndex].getYear()) 
            {
                maxIndex = j;
            }
        }
        Carro aux = carros[i];
        carros[i] = carros[maxIndex];
        carros[maxIndex] = aux;
    }
    }

    // Binary search by year
    public int searchBinaryByYear(Carro[] carros, int year) {
        int bajo = 0;
        int alto = carros.length - 1;
        while (bajo <= alto) {
            int centro = bajo + (alto - bajo) / 2;
            if (carros[centro].getYear() == year) {
                return centro;
            }
            if (carros[centro].getYear() < year) {
                bajo = centro + 1;
            } else {
                alto = centro - 1;
            }
        }
        return -1;
    }
}