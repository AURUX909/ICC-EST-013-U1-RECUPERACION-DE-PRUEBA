import java.util.Arrays;
import models.Carro;
import models.CarrosGenerator;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        MetodosOrdenamientoBusquedaGrupoB metodo = new MetodosOrdenamientoBusquedaGrupoB();
        CarrosGenerator generator = new CarrosGenerator();

        // Obtener el arreglo de 50 carros generadas aleatoriamente
        Carro[] carros = generator.generarCarros();

        System.out.println("Listado de carros generadas:");
        for (Carro carro : carros) 
        {
            System.out.println(carro);
        }

        metodo.sortBYearWithBubbleAvnAsendente(carros);
        System.out.println("Arreglo ordenado Ascendentemente: " + Arrays.toString(carros));

        metodo.sortBYearWithBubbleAvnDesendente(carros);
        System.out.println("Arreglo ordenado Descendentemente: " + Arrays.toString(carros));


        int valorBuscar = 2017;
        int indice = metodo.searchBinaryByYear(carros, valorBuscar);
        if (indice != -1) {
            System.out.println("El carro con el año " + valorBuscar + " es: " + carros[indice]);
        } else {
            System.out.println("El año del carro que busca no se encuentra en el arreglo");
        }
    }
}