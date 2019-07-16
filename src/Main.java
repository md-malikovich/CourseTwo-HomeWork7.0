import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, String[]> dictionary = new HashMap<>();

        //dictionary.put("красный", new String[]{"лиловый", "бордовый", "красивый", "румяный", "срочный"});
        //dictionary.put("лиловый", new String[]{"красный", "бордовый", "красивый", "румяный", "срочный"});
        //dictionary.put("бордовый", new String[]{"лиловый", "красный", "красивый", "румяный", "срочный"});
        //dictionary.put("красивый", new String[]{"лиловый", "бордовый", "красный", "румяный", "срочный"});
        //dictionary.put("румяный", new String[]{"лиловый", "бордовый", "красивый", "красный", "срочный"});
        //dictionary.put("срочный", new String[]{"лиловый", "бордовый", "красивый", "румяный", "красный"});

        //dictionary.put("большой", new String[]{"огромный", "громадный", "колоссальный", "великий"});
        //dictionary.put("огромный", new String[]{"большой", "громадный", "колоссальный", "великий"});
        //dictionary.put("громадный", new String[]{"огромный", "большой", "колоссальный", "великий"});
        //dictionary.put("колоссальный", new String[]{"огромный", "громадный", "большой", "великий"});
        //dictionary.put("великий", new String[]{"огромный", "громадный", "колоссальный", "большой"});

        dictionary.put("дом", new String[]{"жилище", "хата", "кров"});
        dictionary.put("жилище", new String[]{"дом", "хата", "кров"});
        dictionary.put("хата", new String[]{"жилище", "дом", "кров"});
        dictionary.put("кров", new String[]{"жилище", "хата", "дом"});

        //dictionary.put("человек", new String[]{"персона", "индивидуум", "лицо", "личность"});
        //dictionary.put("персона", new String[]{"человек", "индивидуум", "лицо", "личность"});
        //dictionary.put("индивидуум", new String[]{"персона", "человек", "лицо", "личность"});
        //dictionary.put("лицо", new String[]{"персона", "индивидуум", "человек", "личность"});
        //dictionary.put("личность", new String[]{"персона", "индивидуум", "лицо", "человек"});


        Set<String> keys = dictionary.keySet();                             //keySet() - возвращает набор ключей
        Iterator iter = keys.iterator();                                    //keys.iterator() - создаем итератор

        while (iter.hasNext()) {                                            //iter.hasNext() - возвращает true, если остались еще элементы

            String key = iter.next().toString();                            //toString() - создаем переменную и преобразов в сторку
            String[] values = dictionary.get(key);                          //элементы массива преобразовываем в ключ
            dictionary.put(key, values);                                    //помещаем в коллекцию (K, V)

            for (int i = 0; i < values.length; i=i+1) {                     //цикл равный кол-ву элементов массивов
                String noviyKlyuch = values[i];                             //новый ключ приравниваем к значению элемента массива+
                ArrayList<String> strArr = new ArrayList<>(values.length);  //создаем список strArr равный кол-ву элементов массива
                strArr.addAll(Arrays.asList(values));                       //добавляем в список все значения из массива+
                strArr.remove(noviyKlyuch);                                 //удаляем из списка элемент массива, который стал новым ключом+
                strArr.add(key);                                            //добавляем в список первоначальный ключ+
                String[] newVals = new String[strArr.size()];               //создаем массив равный размеру списка
                newVals = strArr.toArray(newVals);                          //возвращает массив, содержащий новые элементы
                System.out.println(noviyKlyuch + " - " + Arrays.toString(newVals));   //вывод в консоль
                dictionary.put(noviyKlyuch, newVals);                       //помещаем в коллекцию новый объект (K, V)
            }
        }
    }
}
//Написать алгоритм который каждый из синонимов добавит в словарь в качестве ключа, а ключ в качестве одного из синонимов (как значение)

//String[] first = dictionary.get("красный");
//System.out.printf("1: %s \n", first);
//System.out.println(dictionary.get("красный"));

//for (int i=0; i<10; i++) {
//    dictionary.put(String, String[i]);
// }
//for (String key: dictionary.keySet()) {
//System.out.println(dictionary.replace("красный", new String[] {"черный"}));
//}
//System.out.println(dictionary);

//dictionary.computeIfPresent("красный", (k, v) -> dictionary.);

//dictionary.put("красный", new String[]{"желтый"});
//dictionary.replace("красный", new String[] {"черный"});
//System.out.println(dictionary.containsKey("желтый"));

//dictionary.computeIfPresent("красный", (k, v) -> v + 1);
//System.out.println(dictionary.get("красный"));
//System.out.println(dictionary.put("красный", dictionary.get("красный")));

/*for(Map.Entry<String, String[]> item : dictionary.entrySet()) {
System.out.printf("Key: %s. Value: %s \n", item.getKey(), item.getValue().length + ".");
System.out.printf("Key: %s. Value: %s \n", item.getKey(), item.getValue());
}*/

