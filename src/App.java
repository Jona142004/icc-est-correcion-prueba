
import models.Carro;
import models.CarrosGenerator;
import models.Person;
import models.PersonasGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        CarrosGenerator generator = new CarrosGenerator();
        PersonasGenerator generator2 = new PersonasGenerator();
        // Obtener el arreglo de 50 carros generadas aleatoriamente
        Carro[] carros = generator.generarCarros();
        Person[] personas = generator2.generarPersonas();

        MetodosOrdenamientoBusquedaGrupoB mob1 = new MetodosOrdenamientoBusquedaGrupoB();
        System.out.println("Listado de carros generadas:");
        for (Carro carro : carros) {
        }
        mob1.sortBYearWithBubbleAvnAsendente(carros);
        mob1.showCar(carros);

        int result1 = mob1.searchBinaryByYear(carros, 2017);
        if (result1 == -1) {
            System.out.println("No se encontro");
            
        }else{
            System.out.println("Encontro en la posicion" + result1 + "->" + carros[result1] );
        }


        MetodosOrdenamientoBusqueda mob = new MetodosOrdenamientoBusqueda();
        System.out.println("Listado de personas generado");
        for (Person persona : personas){
        }
        mob.sortByAgeWithSelection(personas);
        mob.showPeople(personas);


        int result = mob.searchBinaryByAge(personas, 22);
        if(result == -1){
            System.out.println("No se encontro");
        }else{
            System.out.println("Encontro en la posicion " + result + "->" + personas[result]);
        }
    }
}
