import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class main {

    // 1- Tamaño de la lista

    //Obtener el tamaño de la lista
    @Test
    public void getSizeOf() {
        List<String> list = new ArrayList<>();
        list.add("kyc paco");
        list.add("kyc paco");
        list.add("kyc paco");
        list.add("kyc paco");
        list.add("kyc paco");

        assertEquals(5, list.size());
    }

    //otener el tamaño de una lista vacia
    @Test
    public void getSizeOfEmpty() {
        List<String> list = new ArrayList<>();

        assertEquals(0, list.size());
    }

    //error cuando una lista esta vacia
    @Test(expected = NullPointerException.class)
    public void getSizeOfNull() {
        List<String> list = null;

        list.size();
    }

    // 2- Vaciar la lista
    @Test
    public void clearListNormal() {
        List<String> list = new ArrayList<>();
        list.add("kyc paco");
        list.add("kyc paco");
        list.add("kyc paco");
        list.add("kyc paco");
        list.add("kyc paco");

        list.clear();
        assertEquals(0, list.size());
    }

    //revisa si da null cuando corres clear
    @Test(expected = NullPointerException.class)
    public void clearListNull() {
        List<String> list = null;
        list.clear();
    }

    //revisa el comportamiento cuando haces clear con una lista vacia
    @Test
    public void clearListEmpty() {
        List<String> list = new ArrayList<>();
        list.clear();
        assertEquals(0, list.size());
        list.add("kyc paco");
        assertEquals(1, list.size());
    }

    // 3- Añadir elementos
    @Test
    public void addItems() {
        List<String> list = new ArrayList<>();
        list.add("kyc paco");
        assertEquals(1, list.size());
    }

    //revisa si da null cuando corres add
    @Test(expected = NullPointerException.class)
    public void addItemsNull() {
        List<String> list = null;
        list.add("kyc paco");
    }

    //checa si el elemento se insertó en la posición correcta
    @Test
    public void addItemsCorrectPosition() {
        List<String> list = new ArrayList<>();
        list.add("kyc paco");
        list.add("segundoElemento");
        assertEquals(list.get(1), "segundoElemento");
    }

    //4- Checar si la lista existe

    //implementacion basica
    @Test
    public void containsItem() {
        List<String> list = new ArrayList<>();
        list.add("kyc paco");
        list.add("segundoElemento");
        assertTrue(list.contains("kyc paco"));
    }

    //checa si el comportamiento es correcto cuando un elemento no contiene el deseado
    @Test
    public void doesntContainItem() {
        List<String> list = new ArrayList<>();
        list.add("kyc paco");
        list.add("segundoElemento");
        assertFalse(list.contains("string no existente"));
    }

    //revisa el error cuando corres contains en un elemento no existente
    @Test(expected = NullPointerException.class)
    public void containsNull() {
        List<String> list = null;
        list.contains("prueba");
    }

    //5- obtener elementos por el index

    //implementacion basica
    @Test
    public void getElementByIndex() {
        List<String> list = new ArrayList<>();
        list.add("kyc paco");
        list.add("kyc paco222");
        list.add("kyc paco");

        assertEquals(list.get(1), "kyc paco222");
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void getElementByIndexOutOfBounds() {
        List<String> list = new ArrayList<>();
        list.add("kyc paco");
        list.add("kyc paco222");
        list.add("kyc paco");
        list.get(4);
    }

    @Test(expected = NullPointerException.class)
    public void getElementByIndexOfNull() {
        List<String> list = null;
        list.get(4);
    }

    //6- Buscar el indice del objeto

    //implementacion basica
    @Test
    public void getElementIndex() {
        List<String> list = new ArrayList<>();
        list.add("kyc paco");
        list.add("kyc paco222");
        list.add("kyc paco");

        assertEquals(1, list.indexOf("kyc paco222"));
    }

    //comportamiento cuando hay dos objetos repetidos
    @Test
    public void getElementIndexRepeated() {
        List<String> list = new ArrayList<>();
        list.add("kyc paco");
        list.add("kyc paco222");
        list.add("kyc paco");

        assertEquals(0, list.indexOf("kyc paco"));
    }

    //error cuando el objeto es nulo
    @Test(expected = NullPointerException.class)
    public void getElementIndexNull() {
        List<String> list = null;
        list.indexOf("kyc paco222");
    }

    //7- Remover objeto en una posición

    //implementacion basica
    @Test
    public void removeElementByIndex() {
        List<String> list = new ArrayList<>();
        list.add("kyc paco");
        list.add("kyc paco222");
        list.add("kyc paco");
        list.remove(1);
        assertEquals(2, list.size());
    }

    //ver si se removio el elemento correcto
    @Test
    public void removeElementByIndexTwo() {
        List<String> list = new ArrayList<>();
        list.add("kyc paco");
        list.add("kyc paco222");
        list.add("kyc paco");
        list.remove(1);
        assertEquals("kyc paco", list.get(1));
    }

    //remover en una posición incorrecta
    @Test(expected = IndexOutOfBoundsException.class)
    public void removeElementByIndexOutOfBounds() {
        List<String> list = new ArrayList<>();
        list.add("kyc paco");
        list.add("kyc paco222");
        list.add("kyc paco");
        list.remove(4);

    }












}
