import java.util.HashMap;

public class Telephone {

    public static void main(String[] args) {

        HashMap<String, String> telefoneDirectory = new HashMap<>();

        telefoneDirectory.put("Меликов А. А.", "+79264522546");
        telefoneDirectory.put("Сидоров П. А.", "+79171522546");
        telefoneDirectory.put("Петров А. Ю.", "+79151522546");
        telefoneDirectory.put("Никифаров Г. А.", "+79201522546");
        telefoneDirectory.put("Жеребцов Ю. А.", "+79141522546");
        telefoneDirectory.put("Мельников Р. А.", "+79161522546");
        telefoneDirectory.put("Мышкина М. М.", "+79112342546");
        telefoneDirectory.put("Лисин А. П.", "+79345622546");
        telefoneDirectory.put("Петькина К. Р.", "+79121522546");
        telefoneDirectory.put("Кротовкий Р. А.", "+79201522546");
        telefoneDirectory.put("Собак А. П.", "+79341522546");
        telefoneDirectory.put("Жук А. А.", "+793451522546");
        telefoneDirectory.put("Зебра С. А.", "+79161522546");
        telefoneDirectory.put("Стриксин П. А.", "+79181522546");
        telefoneDirectory.put("Бюжин К. А.", "+79171522546");
        telefoneDirectory.put("Заршинин А. Р.", "+79211522546");
        telefoneDirectory.put("Хлебовская У. А.", "+79181522546");
        telefoneDirectory.put("Петин Р. А.", "+79222222546");
        telefoneDirectory.put("Ребров А. А.", "+79181521111");
        telefoneDirectory.put("Конь А. В.", "+79181525868");

        System.out.println(telefoneDirectory.values());
        System.out.println(telefoneDirectory);


    }
}

