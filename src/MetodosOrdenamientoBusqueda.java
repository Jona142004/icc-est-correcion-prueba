import models.Person;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusqueda {

    // Selection sort by age
    public void sortByAgeWithSelection(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            int min = i;
            for (int j = i + 1; j < people.length; j++) {
                if(people[j].getAge() < people[min].getAge()){
                    min = j;

                }
                

            }
            Person temp = people[min];
            people[min] = people[i];
            people[i] = temp;
        }
        
    }

    // Selection sort by height
    public void sortByHeightWithSelection(Person[] people) {
            for (int i = 0; i < people.length; i++) {
                int min = i;
                for (int j = i + 1; j < people.length; j++) {
                    if(people[j].getHeight() < people[min].getAge()){
                        min = j;
    
                    }
                    
    
                }
                Person temp = people[min];
                people[min] = people[i];
                people[i] = temp;
            }   
}

    // Insertion sort by age
    public void sortByAgeWithInsertion(Person[] people) {
        int tam = people.length;
        for(int i = 1; 1 < tam ; i++){
            Person Aux = people[i];
            int j = i -1;
            while (j >= 0 && people[j].getAge() > Aux.getAge()) {
                people[j + 1] = people[j];
                j = j-1;

            }
            people[j + 1]= Aux;
        }

    }

    // Insertion sort by height
    public void sortByHeightWithInsertion(Person[] people) {
        int tam = people.length;
        for(int i = 1; 1 < tam ; i++){
            Person Aux = people[i];
            int j = i -1;
            while (j >= 0 && people[j].getHeight() > Aux.getHeight()) {
                people[j + 1] = people[j];
                j = j-1;

            }
            people[j + 1]= Aux;
        }
    }

    // Binary search by age
    public int searchBinaryByAge(Person[] people, int age) {
            int inicio = 0;
            int fin = people.length - 1;
        
            while (inicio <= fin) {
                int medio = inicio + (inicio + fin) / 2;
        
                if (people[medio].getAge() == age) {
                    return medio;  // age encontrado
                } else if (people[medio].getAge() < age) {
                    inicio = medio + 1;
                } else {
                    fin = medio - 1;
                }
            }
            return -1;  // Si no se encuentra el age
        }

    // Binary search by height
    public int searchBinaryByHeight(Person[] people, int height) {
            int inicio = 0;
            int fin = people.length - 1;
        
            while (inicio <= fin) {
                int medio = (inicio + fin) / 2;
        
                if (people[medio].getAge() == height) {
                    return medio;  // height encontrado
                } else if (people[medio].getHeight() < height) {
                    inicio = medio + 1;
                } else {
                    fin = medio - 1;
                }
            }
            return -1;
    }

    // Metodo que imprime el listado de personas
    public void showPeople( Person[] persons) {
        for (Person person : persons) {
            System.out.println(person);
            
        }
    }
}